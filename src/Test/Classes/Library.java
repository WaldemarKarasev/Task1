package Test.Classes;

import java.security.PublicKey;
import java.util.ArrayList;

public class Library {
    private String address;
    private ArrayList<Book> books;
    private ArrayList<Reader> readers;

    public Library(String address) {
        this.address = address;
        this.books = new ArrayList<Book>();
        this.readers = new ArrayList<Reader>();
    }

    public Library(String address, ArrayList<Book> books) {
        this.address = address;
        this.books = new ArrayList<Book>(books);
        this.readers = new ArrayList<Reader>();
    }

    public Library(String address, ArrayList<Book> books, ArrayList<Reader> readers) {
        this.address = address;
        this.books = new ArrayList<Book>(books);
        this.readers = new ArrayList<Reader>(readers);
    }

    public void addBook(String topic, int nunOfPages) {
        Book book = new Book(topic, nunOfPages);
        this.books.add(book);
    }

    public void addReader(String FirstName, String LastName) {
        Reader reader = new Reader(FirstName, LastName);
        this.readers.add(reader);
    }

    public String printAllBooks() {
        String printResult = "\n";
        int id = 0;
        for (Book book : this.books) {
            printResult = printResult + book.toString();
            ++id;
        }

        return printResult;
    }

    public Reader GetReader(int ID) {
        if (ID > readers.size()) {
            System.out.println("Invalid reader ID");
            return null;
        }

        return readers.get(ID);
    }

    public void ReaderEnters(Reader reader) {
        reader.EnterTheLibrary();
    }

    public void ReaderStartReadBook(Reader reader, int BookID) {
        // find book
        if (reader.GetBookIDInHand() == 0){
            if (BookID > books.size())
                System.out.println("There is no book with this id=" + BookID);
            else {
                if (books.get(BookID).isBookTaken())
                    System.out.println("Book id=" + BookID + " is already taken");
                else {
                    books.get(BookID).TakeBook();
                    reader.StartReadBook(books.get(BookID));
                }
            }

        }
        else {
            // start read
            System.out.println("Reader id=" + reader.GetReaderID() + " is reading book now");
        }


    }

    public void ReaderFinishedReadBook(Reader reader) {
        // finished read
        if (reader.GetBookIDInHand() != 0) {
            reader.FinishReadingBook(books.get(reader.GetBookIDInHand()));
        }
        else
            System.out.println("This reader id=" + reader.GetReaderID() + " isn't reading book now");
    }

    public void ReaderExits(Reader reader) {
        reader.ExitTheLibrary();
    }


    @Override
    public String toString() {
        return "-------------------------****Library Info****-------------------------\n" +
                "Library address: " + this.address + "\n" +
                "Number of readers = " + readers.size() + "\n" +
                "Books in the library:\n" +
                "---------------------------------------------------------------------" +
                printAllBooks() +
                "---------------------------------------------------------------------\n" +
                "-----------------------------****End****-----------------------------";
    }
}
