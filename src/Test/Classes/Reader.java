package Test.Classes;

import java.io.StringReader;

public class Reader {
    private String ReaderFirstName;
    private String ReaderLastName;

    private static int ReaderCount = 0;
    private int ReaderID;

    private boolean inLibrary = false;

    private int BookIDInHand;

    public Reader(String FirstName, String LastName) {
        this.ReaderFirstName = FirstName;
        this.ReaderLastName = LastName;
        this.ReaderID = ReaderCount;
        ++ReaderCount;
    }

    public void EnterTheLibrary() {
        if (inLibrary)
            System.out.println("Reader id=" + this.ReaderID + " is already in library!!!");
        else {
            this.inLibrary = true;
            System.out.println("Resder id=" + this.ReaderID + " is entered the library");
        }
    }

    public void ExitTheLibrary() {
        if (inLibrary) {
            this.inLibrary = false;
            System.out.println("Reader id=" + this.ReaderID + " is exited the library");
        }
        else
            System.out.println("Reader id=" + this.ReaderID + " is already exited the library!!!");
    }

    public int GetBookIDInHand() {
        return this.BookIDInHand;
    }

    public int GetReaderID() {
        return this.ReaderID;
    }

    public boolean GetInLibrary() {
        return this.inLibrary;
    }

    public void StartReadBook(Book book) {
        if (book.isBookTaken()) {
            System.out.println("Book id=" + book.GetBookID() + " is taken");
        }
        else {
            book.TakeBook();
        }
        this.BookIDInHand = book.GetBookID();
        System.out.println(this.toString() + "is reading " + book.toString());
    }

    public void FinishReadingBook(Book book) {
        if (this.BookIDInHand != 0) {
            book.ReturnBook();
        }
    }


    @Override
    public String toString() {
        return "----------------------------------------------\n" +
                "Reader FirstName: " + this.ReaderFirstName +
                ", ReaderLastName=" + ReaderLastName +
                ", ReaderID=" + ReaderID + "\n" +
                "----------------------------------------------\n";
    }
}
