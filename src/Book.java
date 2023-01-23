public class Book {
    private String title;
    private String author;
    private int pages;
    private boolean hardcover;

    public Book(String title, String author, int pages, boolean hardcover) {
        this.title = title;
        this.author = author;
        this. pages = pages;
        this.hardcover = hardcover;

    }

    public String getTitle() {
//        this.title = title;
        return title;
    }

    public String getAuthor() {
//        this.author = author;
        return author;
    }

    public int getPages() {
//        this.pages = pages;
        return pages;
    }

    public boolean isHardcover() {
//        this.hardcover = hardcover;
        return hardcover;
    }

    @Override
    public String toString() {
        return title + "by " + author + " (" + pages + " pages)";
    }

}
