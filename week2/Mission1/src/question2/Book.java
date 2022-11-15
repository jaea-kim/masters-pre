package question2;

public class Book {
    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void changeBookInfo(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getBookInfo() {
        return title + "/" + author;
    }
}
