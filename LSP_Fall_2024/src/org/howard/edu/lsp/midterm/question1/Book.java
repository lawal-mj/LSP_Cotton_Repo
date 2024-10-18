/**
*  Name: Abdulmujeeb Lawal
*/
package org.howard.edu.lsp.midterm.question1;

/**
 * The Book class represents a book with attributes like title, author,
 * ISBN number, and year of publication.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * creates a new Book object with title, year, isbn and author
     *
     * @param title         book title
     * @param author        author of the book
     * @param ISBN          ISBN number
     * @param yearPublished the year the book was published
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    /**
     * Returns the title of the book.
     * @return book title
     */
    public String getTitle() {
        return title;
    }


    /**
     * Returns the author of the book.
     *
     * @return author
     */
    public String getAuthor() {
        return author;
    }



    /**
     * Returns the ISBN of the book.
     *
     * @return ISBN
     */
    public String getISBN() {
        return ISBN;
    }


    /**
     * Returns the year the book was published.
     *
     * @return publishing year
     */
    public int getYearPublished() {
        return yearPublished;
    }



    /**
     * Compares the book to another specified one and theyre equal if they have the same ISBN and author.
     *
     * @param obj the object to compare this book against
     * @return true if the given object is equal to this book, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }

    /**
     * returns a string rerepresentation of the book object that its title, author, ISBN and publication year
     *
     * @return a string representation of the book
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}
