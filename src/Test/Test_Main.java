package Test;

import Test.Classes.*;

import java.util.ArrayList;

public class Test_Main {
    public static void main(String[] args) {

        ArrayList<Reader> readers = new ArrayList<Reader>();

        readers.add(new Reader("FName0", "LName0"));
        readers.add(new Reader("FName1", "LName1"));
        readers.add(new Reader("FName2", "LName2"));
        readers.add(new Reader("FName3", "LName3"));
        readers.add(new Reader("FName4", "LName4"));


        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("math", 600));
        books.add(new Book("biology", 840));
        books.add(new Book("astronomy", 423));
        books.add(new Book("economics", 342));
        books.add(new Book("paleontology", 840));
        books.add(new Book("physics", 920));

        Library library = new Library("1st Street", books, readers);
        System.out.println(library.toString());

        library.addBook("chemistry", 739);
        library.addReader("FirstName6", "LastName6");


        System.out.println("\n\n\n");
        System.out.println(library.toString());

        System.out.println("\n\n\n");


        library.GetReader(4).EnterTheLibrary();
        library.GetReader(2).ExitTheLibrary();
        library.GetReader(1).EnterTheLibrary();
        library.GetReader(5).EnterTheLibrary();

        System.out.println("\n\n\n");

        library.ReaderStartReadBook(library.GetReader(4), 3);
        library.ReaderStartReadBook(library.GetReader(1), 3);
        library.ReaderStartReadBook(library.GetReader(5), 2);

        System.out.println("\n\n\n");

        System.out.println(library.toString());

        System.out.println("\n\n\n");

        library.ReaderFinishedReadBook(library.GetReader(4));
        library.ReaderFinishedReadBook(library.GetReader(5));
        library.ReaderFinishedReadBook(library.GetReader(1));

        System.out.println(library.toString());

    }
}
