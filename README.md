# This git has different type of class one of the class is this: Write a class to store details for a book.

public class Book
{
    //fields, constructors, methods...
}
Your class should have the following fields:

title (String)
author (String)
pages (int)
hardcover (boolean)
The class should have the following basic features:

A parameterized constructor to assign the fields of the class
Getters for each field
A toString() method that prints out a String representation of a Book object. The format of the string should look like this: The Hunger Games by Suzanne Collins (300 pages)
Write a second class for storing groups of books at a library.

public class Library
{
    //fields, constructors, methods...
}
Your class should should have the following fields:

allBooks (an array of Book objects)
bookOfTheMonth (Book)
The class should have the following basic features:

A parameterized constructor to assign the fields of the class
A toString() method that prints out a String representation of a Library object. The format of the string should look like this: Library: Book of the month - "Where the Red Fern Grows", # of books - 5
Note: The number of books should be the same as the length of the allBooks array
Test case - Make sure you can create Book and Library objects and print them out:

Book hungerGames = new Book("The Hunger Games", "Suzanne Collins", 411, true);
System.out.println(hungerGames.toString()); //The Hunger Games by Suzanne Collins (411 pages)

Book[] books = new Book[3];
books[0] = new Book("Where the Red Fern Grows", "Wilson Rawls", 304, false);
books[1] = new Book("The Fellowship of the Ring", "JRR Tolkien", 550, true);
books[2] = new Book("The Hunt for Red October", "Tom Clancy", 300, false);

Library library = new Library(hungerGames, books);
System.out.println(library.toString()); //Book of the month - "The Hunger Games", # of books - 3
