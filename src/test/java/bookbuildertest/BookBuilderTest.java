package bookbuildertest;

import builder.model.Book;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BookBuilderTest {
    @Test
    public void shouldCheckPaperBookDescription() {
        Book book = Book.builder()
                .title("Pan Tadeusz")
                .author("Adam Mickiewicz")
                .publishingHouse("Muza")
                .publicationYear(1989)
                .ISBN(1234567).build();

        //Added to verify description
        System.out.println(book.getPaperBookDescription());

        String expectedBookDescription = "Book title: Pan Tadeusz, Author: Adam Mickiewicz, publication year: 1989, publishing house: Muza, ISBN:1234567";

        assertThat(expectedBookDescription, equalTo(book.getPaperBookDescription()));
    }

    @Test
    public void shouldCheckEbookDescription() {
        Book book = Book.builder()
                .title("Ebook jak żyć zdrowo kolorowo")
                .author("Influ Julka")
                .publicationYear(2023)
                .build();

        System.out.println(book.getEbookDescription());

        String expectedBookDescription = "Book  title: Ebook jak żyć zdrowo kolorowo, Author: Influ Julka, publication year: 2023";

        assertThat(expectedBookDescription, equalTo(book.getEbookDescription()));
    }
}
