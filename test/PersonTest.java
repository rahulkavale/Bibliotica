import org.junit.Test;
import junit.framework.Assert;
public class PersonTest {
    @Test
    public void testPersonEqualityDifferentPerson(){
        Person manmohan=new Person("Manmohan","111-1111","Manmohan");
    Person michel=new Person("Michel","111-1112","Michel");
    Assert.assertFalse(manmohan.equals(michel));
    }
    @Test
    public void testPersonEqualitySamePerson(){
        Person manmohan=new Person("Manmohan","111-1111","Manmohan");
        Person manmohanSecond=new Person("Manmohan","111-1111","Manmohan");
        Assert.assertTrue(manmohan.equals(manmohanSecond));
    }
    @Test
    public void testcheckPerson(){
        Person manmohan=new Person("Manmohan","111-1111","Manmohan");
        Assert.assertTrue(manmohan.checkPerson("111-1111"));
    }
    @Test
    public void testcheckPersonNonExistoing(){
        Person manmohan=new Person("Manmohan","111-1111","Manmohan");
        Assert.assertFalse(manmohan.checkPerson("111-1112"));
    }
    @Test
    public void testBorrowBook(){
        Person manmohan=new Person("Manmohan","111-1111","Manmohan");
        Book politicsBook=new Book(1,"Politics","Politics","Aristotle",1);
        manmohan.borrowBook(politicsBook);
        Assert.assertTrue(manmohan.hasBorrowedTheBook(1));
     }
    @Test
    public void testNotBorrowBook(){
        Person manmohan=new Person("Manmohan","111-1111","Manmohan");
        Book politicsBook=new Book(2,"Politics","Politics","Aristotle",1);
        Assert.assertFalse(manmohan.hasBorrowedTheBook(2));
    }
}
