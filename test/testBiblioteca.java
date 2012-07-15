import org.junit.Test;
import junit.framework.Assert;
/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/12/12
 * Time: 7:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class testBiblioteca {
    @Test
    public void testPrintsWelcome()
    {
        String welcome="Welcome";
        Bibliotica bibliotica=new Bibliotica();
        Assert.assertEquals(welcome,bibliotica.printWelcome());
    }
    @Test
    public void testGetUserInput(){//how to test user input
        int input=1;
        //Assert.assertEquals(input,MainClass.getUserInput());

    }
    @Test
    public void testIsBookInRackExistingBook(){
        Bibliotica bibliotica=new Bibliotica();
        Assert.assertTrue(bibliotica.isBookInRack(1));
    }
    @Test
    public void testIsBookInRackNotExistinBook(){
        Bibliotica bibliotica=new Bibliotica();
        Assert.assertFalse(bibliotica.isBookInRack(10));
    }
    @Test
    public void testReserveBook(){
        Bibliotica bibliotica=new Bibliotica();
        Book physicsBook=new Book(10,"Physics","Science","S H Gambhir",1);
        Assert.assertFalse(physicsBook.equals(bibliotica.reserveBook(1,1)));
    }
    @Test
    public void testReserveBookNotAvailable(){
        Bibliotica bibliotica=new Bibliotica();
        Book physicsBook=new Book(10,"Physics","Science","S H Gambhir",1);
        Assert.assertNotSame(physicsBook,bibliotica.reserveBook(1,1));
    }
   }
