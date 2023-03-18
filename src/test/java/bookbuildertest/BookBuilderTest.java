package bookbuildertest;

import builder.model.Book;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BookBuilderTest {
    @Test
    public void shouldCheckPaperBookDescription(){
        Book book = Book.builder()
                .title("Pan Tadeusz")
                .author("Adam Mickiewicz")
                .publishingHouse("Muza")
                .publicationYear(1989)
                .ISBN(1234567).build();

        System.out.println(book.getBookDescription());

        String expectedBookDescription = "Book \n" +
                "title: Pan Tadeusz\n" +
                "Author: Adam Mickiewicz\n" +
                "publication year: 1989\n" +
                "publishing house: Muza\n" +
                "ISBN:1234567";

        assertThat(expectedBookDescription, equalTo(book.getBookDescription()));
    }

    @Test
    public void shouldCheckEbookDescription(){
        Book book = Book.builder()
                .title("Ebook jak żyć zdrowo kolorowo")
                .author("Influ Julka")
                .publicationYear(2023)
                .build();

        System.out.println(book.getBookDescription());

        String expectedBookDescription = "Book \n" +
        "title: Ebook jak żyć zdrowo kolorowo\n" +
        "Author: Influ Julka\n" +
        "publication year: 2023\n" +
        "publishing house: null\n" +
        "ISBN:0";

        assertThat(expectedBookDescription, equalTo(book.getBookDescription()));
    }
}
