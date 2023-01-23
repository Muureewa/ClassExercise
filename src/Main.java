public class Main {
    public static void main(String[] args) {

        Book hungerGames = new Book("The Hunger Games", "Suzanne", 411, true);
        System.out.println(hungerGames.toString());

        Book[] books = new Book[3];
        books[0] = new Book("Where the Red Fern Grows", "Wilson Rawls", 304, false);
        books[1] = new Book("The Fellowship of the Ring", "JRR Tolkin", 550, true);
        books[2] = new Book("The Hunt for Red October", "Tom Clancy", 300, false);

        Library library = new Library(hungerGames, books);
        System.out.println(library.toString());



        Point atOrigin = new Point();
        System.out.println(atOrigin.toString()); //Point - x: 0, y: 0

        Point point = new Point(1, 5);
        System.out.println(point.toString()); //Point - x: 1, y: 5

        System.out.println(atOrigin.isLocatedAtOrigin()); //true
        System.out.println(point.isLocatedAtOrigin()); //false

        System.out.println(point.distance(-2, 1)); //5
        System.out.println(atOrigin.distance(0, 0)); //0
    }
}