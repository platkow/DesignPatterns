package builder.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Book {
    private final String title;
    private final String author;
    private final int publicationYear;
    private final String publishingHouse;
    private final int ISBN;

    public String getBookDescription(){
       return "Book " +
                "\ntitle: " +  getTitle() +
                "\nAuthor: " +  getAuthor() +
                "\npublication year: " +  getPublicationYear() +
                "\npublishing house: " +  getPublishingHouse() +
                "\nISBN:" +  getISBN();
    }

}
