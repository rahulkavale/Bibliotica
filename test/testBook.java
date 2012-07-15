import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/12/12
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class testBook {
    @Test
    public void testBooksAreEqualDifferent(){
         Book physicsBook=new Book(1,"Physics","Science","S H Gambhir",5);
        Book chemistryBook=new Book(1,"Chemistry","Science","S H Gambhir",5);
        Assert.assertFalse(physicsBook.equals(chemistryBook));
    }
    @Test
    public void testBooksAreEqualSimilar(){
        Book physicsBook=new Book(1,"Physics","Science","S H Gambhir",5);
        Book physicsBookSecond=new Book(1,"Physics","Science","S H Gambhir",5);
        Assert.assertTrue(physicsBook.equals(physicsBookSecond));
    }
    @Test
    public void testBookCopyAvailable(){
        Book physicsBook=new Book(1,"Physics","Science","S H Gambhir",5);
        Assert.assertTrue(physicsBook.areCopiesAvailable());
    }
    @Test
    public void testBookCopyNotAvailable(){
        Book physicsBook=new Book(1,"Physics","Science","S H Gambhir",0);
        Assert.assertFalse(physicsBook.areCopiesAvailable());
    }
    @Test
    public void testBookingACopyOfABook(){
        Book physicsBook=new Book(1,"Physics","Science","S H Gambhir",10);
        physicsBook.bookCopy();
        Assert.assertTrue(physicsBook.areCopiesAvailable());

    }
    @Test
    public void testBookingNoCopyOfABookAvailable(){
        Book physicsBook=new Book(1,"Physics","Science","S H Gambhir",0);
        physicsBook.bookCopy();
        Assert.assertFalse(physicsBook.areCopiesAvailable());
     }
    @Test
    public void testBookingLastCopyOfABookAvailable(){
        Book physicsBook=new Book(1,"Physics","Science","S H Gambhir",1);
        physicsBook.bookCopy();
        Assert.assertFalse(physicsBook.areCopiesAvailable());
    }
}
