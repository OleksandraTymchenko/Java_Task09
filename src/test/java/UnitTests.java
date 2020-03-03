import com.alex.tym.task09.Book;
import com.alex.tym.task09.Books;
import junit.framework.Assert;
import org.junit.Test;


public class UnitTests {
    Book book1 = new Book(1, "The Old Man and the Sea",
            "Ernest Hemingway", "B & W Publishing",
            1987, 324, 78);
    Book book2 = new Book(2, "A Walk in Amnesia",
            "O. Henry", "Ballantine Books",
            2001, 90, 45);
    Book book3 = new Book(3, "Robin Hood",
            "Sally M. Stockton", "Ace Books",
            1999, 342, 20);
    Book book4 = new Book(4, "A Kiss Before Dying",
            "Ira Levin", "Airiti Press",
            2009, 420, 110);
    Book book5 = new Book(5, "Pride And Prejudice",
            "Jane Austen", "Armida Publications",
            2004, 145, 90);
    Book[] testObj = new Book[]{book1, book2, book3, book4, book5};

    Book[] changePrice = new Book[]{
            new Book(1, "The Old Man and the Sea",
                    "Ernest Hemingway", "B & W Publishing",
                    1987, 324, 85),
            new Book(2, "A Walk in Amnesia",
                    "O. Henry", "Ballantine Books",
                    2001, 90, 49),
            new Book(3, "Robin Hood",
                    "Sally M. Stockton", "Ace Books",
                    1999, 342, 22),
            new Book(4, "A Kiss Before Dying",
                    "Ira Levin", "Airiti Press",
                    2009, 420, 121),
            new Book(5, "Pride And Prejudice",
                    "Jane Austen", "Armida Publications",
                    2004, 145, 99)
    };


    @Test
    public void compareByAuthorNameTest() {
        Books result = new Books(5);
        result.setBooks(testObj);
        result.compareAuthorNames(testObj);
        Assert.assertEquals("not equals", book1, result.getBooks()[0]);
        Assert.assertEquals("not equals", book4, result.getBooks()[1]);
        Assert.assertEquals("not equals", book5, result.getBooks()[2]);
        Assert.assertEquals("not equals", book2, result.getBooks()[3]);
        Assert.assertEquals("not equals", book3, result.getBooks()[4]);

    }

    @Test
    public void compareByPublisherTest() {
        Books result = new Books(5);
        result.setBooks(testObj);
        result.comparePuplisherNames(testObj);
        Assert.assertEquals("not equals", book3, result.getBooks()[0]);
        Assert.assertEquals("not equals", book4, result.getBooks()[1]);
        Assert.assertEquals("not equals", book5, result.getBooks()[2]);
        Assert.assertEquals("not equals", book1, result.getBooks()[3]);
        Assert.assertEquals("not equals", book2, result.getBooks()[4]);

    }

    @Test
    public void compareByPricesTest() {
        Books result = new Books(5);
        result.setBooks(testObj);
        result.comparePrices(testObj);
        Assert.assertEquals("not equals", book4, result.getBooks()[0]);
        Assert.assertEquals("not equals", book5, result.getBooks()[1]);
        Assert.assertEquals("not equals", book1, result.getBooks()[2]);
        Assert.assertEquals("not equals", book2, result.getBooks()[3]);
        Assert.assertEquals("not equals", book3, result.getBooks()[4]);

    }

    @Test
    public void changePriceTest() {
        Books result = new Books(5);
        result.setBooks(testObj);
        result.changePrice(10);
        Assert.assertEquals("not equals", changePrice[0], result.getBooks()[0]);
    }

    @Test
    public void searchBookByAuthorTest() {
        Books instance = new Books(5);
        instance.setBooks(testObj);
        Book[] result = instance.searchBookByAuthor("Jane Austen");
        Assert.assertEquals("not equals", book5, result[0]);
    }

    @Test
    public void searchBookByYearTest() {
        Books instance = new Books(5);
        instance.setBooks(testObj);
        Book[] result = instance.searchBookByYear(2003);
        Assert.assertEquals("not equals", book4, result[0]);
        Assert.assertEquals("not equals", book5, result[1]);
    }


}
