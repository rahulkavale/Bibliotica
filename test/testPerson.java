import org.junit.Test;
import junit.framework.Assert;

/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/15/12
 * Time: 11:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class testPerson {
    @Test
    public void testPersonEqualityDifferentPerson(){
    person manmohan=new person("Manmohan",1);
    person michel=new person("Michel",2);
    Assert.assertFalse(manmohan.equals(michel));
    }
    @Test
    public void testPersonEqualitySamePerson(){
        person manmohan=new person("Manmohan",1);
        person manmohanSecond=new person("Manmohan",1);
        Assert.assertTrue(manmohan.equals(manmohanSecond));
    }
    @Test
    public void testcheckPerson(){
        person manmohan=new person("Manmohan",1);
        Assert.assertTrue(manmohan.checkPerson(1));
    }
    @Test
    public void testcheckPersonNonExistoing(){
        person manmohan=new person("Manmohan",1);
        Assert.assertFalse(manmohan.checkPerson(2));
    }
    @Test
    public void testBorrowBook(){
        person manmohan=new person("Manmohan",1);
        Book politicsBook=new Book(1,"Politics","Politics","Aristotle",1);
        manmohan.borrowBook(politicsBook);
        Assert.assertTrue(manmohan.hasBorrowedTheBook(1));
     }
    @Test
    public void testNotBorrowBook(){
        person manmohan=new person("Manmohan",1);
        Book politicsBook=new Book(2,"Politics","Politics","Aristotle",1);
        Assert.assertFalse(manmohan.hasBorrowedTheBook(2));
    }
}
