import org.junit.Test;
import junit.framework.Assert;
public class BibliotecaTest {
    @Test
    public void testPrintsWelcome()
    {
        String welcome="Welcome";
        Biblioteca biblioteca =new Biblioteca();
        Assert.assertEquals(welcome, biblioteca.printWelcome());
    }
    @Test
    public void testGetUserInput(){//how to test user input
        int input=1;
        //Assert.assertEquals(input,MainClass.getUserInput());

    }
    @Test
    public void testIsBookInRackExistingBook(){
        Biblioteca biblioteca =new Biblioteca();
        Assert.assertTrue(biblioteca.isBookInRack(1));
    }
    @Test
    public void testIsBookInRackNotExistinBook(){
        Biblioteca biblioteca =new Biblioteca();
        Assert.assertFalse(biblioteca.isBookInRack(10));
    }
    @Test
    public void testReserveBook(){
        Biblioteca biblioteca =new Biblioteca();
        Book physicsBook=new Book(10,"Physics","Science","S H Gambhir",1);
        Assert.assertFalse(physicsBook.equals(biblioteca.reserveBook(1,1)));
    }
    @Test
    public void testReserveBookNotAvailable(){
        Biblioteca biblioteca =new Biblioteca();
        Book physicsBook=new Book(10,"Physics","Science","S H Gambhir",1);
        Assert.assertNotSame(physicsBook, biblioteca.reserveBook(1,1));
    }
   }
