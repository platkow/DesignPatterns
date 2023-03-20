package builder.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BookWithoutGetterFirst {
    private final String title;
    private final String author;
    private final int publicationYear;
    private final String publishingHouse;
    private final int ISBN;

    public String getPaperBookDescription(){
        return "Book " +
                "title: " +  getTitle() + "," +
                " Author: " +  getAuthor() + "," +
                " publication year: " +  getPublicationYear() + "," +
                " publishing house: " +  getPublishingHouse() + "," +
                " ISBN:" +  getISBN();
    }

    public String getEbookDescription(){
        return "Book " +
                " title: " +  getTitle() + "," +
                " Author: " +  getAuthor() + "," +
                " publication year: " +  getPublicationYear();
    }
}
