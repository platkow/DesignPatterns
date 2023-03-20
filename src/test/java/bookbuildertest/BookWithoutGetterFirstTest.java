package bookbuildertest;

import builder.model.Book;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BookWithoutGetterFirstTest {

    @Test
    public void shouldCheckPaperBookDescription() {
        Book book = Book.builder()
                .title("Balladyna")
                .author("Juliusz Słowacki")
                .publishingHouse("PWN")
                .publicationYear(1989)
                .ISBN(1234567).build();

        System.out.println(book.getPaperBookDescription());

        String expectedBookDescription = "Book title: Balladyna, Author: Juliusz Słowacki, publication year: 1989, publishing house: PWN, ISBN:1234567";

        assertThat(expectedBookDescription, equalTo(book.getPaperBookDescription()));
    }

    @Test
    public void shouldCheckEbookDescription() {
        Book book = Book.builder()
                .title("Ebook tajniki makijażu")
                .author("Influ Angela")
                .publicationYear(2023)
                .build();

        System.out.println(book.getEbookDescription());

        String expectedBookDescription = "Book  title: Ebook tajniki makijażu, Author: Influ Angela, publication year: 2023";

        assertThat(expectedBookDescription, equalTo(book.getEbookDescription()));
    }
}
