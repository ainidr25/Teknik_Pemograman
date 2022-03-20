package composition;
/**
 *
 * @author ainiii
 */
import java.io.*;
import java.util.*;

class Buku {
    public String title;
    public String author;
 
    Buku(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
}

class Library {
    private final List<Buku> books;
    Library(List<Buku> books)
    {
        this.books = books;
    }
    public List<Buku> getListOfBooksInLibrary()
    {
        return books;
    }
}

public class Composition {
    public static void main(String[] args)
    {
        Buku b1
            = new Buku("The Java Programming Language", "James Gosling and Ken Arnold");
        Buku b2
            = new Buku("Si Putih Novel", "Tere Liye");
        Buku b3 = new Buku("The Paris Apartment","Lucy Foley");
 
        // Membuat List dan terdapat no buku
        List<Buku> buku = new ArrayList<Buku>();
 
        // Add buku ke List object
        buku.add(b1);
        buku.add(b2);
        buku.add(b3);
        Library library = new Library(buku);
 
        List<Buku> books = library.getListOfBooksInLibrary();

        for (Buku bk : books) {
            System.out.println("Title : " + bk.title
                               + " and "
                               + " Author : " + bk.author);
        }
    }
}
