package bookbuildertest;

import builder.model.Book;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BookWithoutGetterSecondTest {
    @Test
    public void shouldCheckPaperBookDescription() {
        Book book = Book.builder()
                .title("Ferdydurke")
                .author("Witold Gombrowicz")
                .publishingHouse("PWN")
                .publicationYear(1974)
                .ISBN(181828).build();

        System.out.println(book.getPaperBookDescription());

        String expectedBookDescription = "Book title: Ferdydurke, Author: Witold Gombrowicz, publication year: 1974, publishing house: PWN, ISBN:181828";

        assertThat(expectedBookDescription, equalTo(book.getPaperBookDescription()));
    }

    @Test
    public void shouldCheckEbookDescription() {
        Book book = Book.builder()
                .title("Ebook kuchnia tajska bez tajemnic")
                .author("Influ Teodor")
                .publicationYear(2023)
                .build();

        System.out.println(book.getEbookDescription());

        String expectedBookDescription = "Book  title: Ebook kuchnia tajska bez tajemnic, Author: Influ Teodor, publication year: 2023";

        assertThat(expectedBookDescription, equalTo(book.getEbookDescription()));
    }
}
