public class Library {
    private Book[] allBooks;
    private Book bookOfTheMonth;

    public Library(Book bookOfTheMonth, Book[] allBooks){
        this.bookOfTheMonth = bookOfTheMonth;
        this.allBooks = allBooks;
    }

    public  Book[] getAllBooks() {
        return allBooks;
    }

    public Book getBookOfTheMonth() {
        return bookOfTheMonth;
    }

    @Override
    public String toString() {
        return "Library: Book of the month -\"" + bookOfTheMonth.getTitle() + "\", # of books - " + allBooks;
    }

}
