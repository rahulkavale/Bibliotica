import org.junit.Assert;
import org.junit.Test;

public class BookTest {
    @Test
    public void testBooksAreEqualDifferent(){
         Book physicsBook=new Book("1","Physics","Science","S H Gambhir");
        Book chemistryBook=new Book("1","Chemistry","Science","S H Gambhir");
        Assert.assertFalse(physicsBook.equals(chemistryBook));
    }
    @Test
    public void testBooksAreEqualSimilar(){
        Book physicsBook=new Book("1","Physics","Science","S H Gambhir");
        Book physicsBookSecond=new Book("1","Physics","Science","S H Gambhir");
        Assert.assertTrue(physicsBook.equals(physicsBookSecond));
    }
}
