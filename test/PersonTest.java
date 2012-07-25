import junit.framework.Assert;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTest {
    @Test
    public void testPersonEqualityDifferentPerson() {
        Person manmohan = new Person("Manmohan", "111-1111", "Manmohan");
        Person michel = new Person("Michel", "111-1112", "Michel");
        Assert.assertFalse(manmohan.equals(michel));
    }

    @Test
    public void testPersonEqualitySamePerson() {
        Person manmohan = new Person("Manmohan", "111-1111", "Manmohan");
        Person manmohanSecond = new Person("Manmohan", "111-1111", "Manmohan");
        Assert.assertTrue(manmohan.equals(manmohanSecond));
    }

    @Test
    public void testcheckPerson() {
        Person manmohan = new Person("Manmohan", "111-1111", "Manmohan");
        Assert.assertTrue(manmohan.checkPerson("111-1111"));
    }

    @Test
    public void testcheckPersonNonExistoing() {
        Person manmohan = new Person("Manmohan", "111-1111", "Manmohan");
        Assert.assertFalse(manmohan.checkPerson("111-1112"));
    }

    @Test
    public void testBorrowBook() {
        Date borrowDate = null;
        Date returnDate = null;
        int year = 2003;
        int month = 12;
        int day = 12;

        int year1 = 2004;
        int month1 = 12;
        int day1 = 12;


        String date1 = year1 + "/" + month1 + "/" + day1;
        String date = year + "/" + month + "/" + day;

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            borrowDate = formatter.parse(date);
            returnDate = formatter.parse(date1);
        } catch (ParseException e) {
            System.out.println(e.toString());
        }

        Person manmohan = new Person("Manmohan", "111-1111", "Manmohan");
        Book politicsBook = new Book("1", "Politics", "Politics", "Aristotle");
        Rack rack = new Rack();
        rack.addBook(politicsBook,"2");
        BorrowedBooksRegister borrowedBooksRegister = new BorrowedBooksRegister();
        manmohan.borrowBook(politicsBook, rack, borrowDate, returnDate, borrowedBooksRegister);
        Assert.assertTrue(manmohan.hasBorrowedTheBook("1"));
    }

    @Test
    public void testNotBorrowBook() {
        Person manmohan = new Person("Manmohan", "111-1111", "Manmohan");
        Book politicsBook = new Book("2", "Politics", "Politics", "Aristotle");
        Assert.assertFalse(manmohan.hasBorrowedTheBook("2"));
    }

    @Test
    public void testLoginWithCorrectCredentials() {
        Person manmohan = new Person("Manmohan", "111-1111", "Manmohan");
        PersonRegister personRegister = new PersonRegister();
        personRegister.addPerson(manmohan);
        Assert.assertTrue(personRegister.isAValidMember("111-1111", "Manmohan"));
    }

    @Test
    public void testLoginWithIncorrectCredentials() {
        Person manmohan = new Person("Manmohan", "111-1111", "Manmohan");
        PersonRegister personRegister = new PersonRegister();
        personRegister.addPerson(manmohan);
        Assert.assertFalse(personRegister.isAValidMember("111-1111", "Mike"));
    }
}
