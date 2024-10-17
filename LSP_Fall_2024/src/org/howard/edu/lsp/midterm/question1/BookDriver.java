/**
*  Name: Abdulmujeeb Lawal
*/
package org.howard.edu.lsp.midterm.question1;

/**
 * This class shows the fucntionality of the Book class by creatign instances and testing some fucntionality
 */
public class BookDriver {
    /**
     * The main method creates book objects and  compares using equals.
     */
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        System.out.println(book1.equals(book2)); 

        System.out.println(book1.equals(book3)); 

        System.out.println(book1); 
    }
}
