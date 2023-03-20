package builder.model;

import lombok.Builder;

@Builder
public class BookWithoutGetterSecond {
    private final String title;
    private final String author;
    private final int publicationYear;
    private final String publishingHouse;
    private final int ISBN;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getISBN() {
        return ISBN;
    }

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
