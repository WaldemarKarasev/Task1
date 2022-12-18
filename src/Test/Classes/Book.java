package Test.Classes;

public class Book {
    private String topic;
    private int numOfPages;
    private boolean isTaken = false;

    private int bookId;
    private static int BookCount = 0;

    public Book(String topic, int numOfPages) {
        this.topic = topic;
        this.numOfPages = numOfPages;
        this.bookId = BookCount;
        ++BookCount;
    }

    public String GetBookTopic() {
        return this.topic;
    }

    public int GetBookID() {
        return this.bookId;
    }

    public void TakeBook() {
        if (isTaken)
            System.out.println("The book is unavailable (the book is already taken)");
        else
            isTaken = true;
    }

    public void ReturnBook() {
        if (isTaken)
            isTaken = false;
        else
            System.out.println("Book on the shelf");
    }

    public boolean isBookTaken(){
        return isTaken;
    }

    @Override
    public String toString() {
        return "Book(topic: " + this.topic + ", numOfPages=" + this.numOfPages + ", isTaken=" + isTaken + ")\n";
    }



}