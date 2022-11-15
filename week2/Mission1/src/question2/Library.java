package question2;

import java.util.ArrayList;

public class Library {
    private String[][] bookList;
    private ArrayList<Book> book;

    Library(String[][] bookList) {
        this.bookList = bookList;
        makeBookStorage(this.bookList);
    }
    //복사 생성자
    Library(Library library) {
        makeBookStorage(library.bookList);
    }
    //팩토리 복사
    static Library newInstance(Library library) {
        return new Library(library);
    }

    private void makeBookStorage(String[][] bookList) {
        book = new ArrayList<Book>();
        for (int i = 0; i < bookList.length; i++) {
            book.add(new Book(bookList[i][0], bookList[i][1]));
        }
    }

    void modifyBookList(String originalTitle, String newTitle, String newAuthor) {
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getBookInfo().split("/")[0].equals(originalTitle)) book.get(i).changeBookInfo(newTitle, newAuthor);
        }
    }

    void addBookList(String title, String author) {
        book.add(new Book(title, author));
    }

    String getLibraryInfo() {
        String info = "";
        for (int i = 0; i < book.size(); i++) {
            info += "[";
            info += book.get(i).getBookInfo();
            info += "]\n";
        }
        return info;
    }

}
