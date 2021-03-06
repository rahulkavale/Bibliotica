import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/12/12
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class testRack {
    @Test
    public void testShowsAnAvailableBook(){

        Book math=new Book(2,"Math","Science","Newton",5);
        Rack rack=new Rack();
        rack.addBook(math);
        Assert.assertTrue(rack.isBookInRack(math));
    }
    @Test
    public void testShowAnUnavailableBook(){
        Book math=new Book(2,"Math","Science","Newton",5);
        Book wingsOfFire=new Book(3,"Wings of Fire","Literature","APJ AbdulKalam",5);

        Rack rack=new Rack();
        rack.addBook(math);
        Assert.assertFalse(rack.isBookInRack(wingsOfFire));
    }
    @Test
    public void testNonRemovedBookExistence(){
        Book math=new Book(2,"Math","Science","Newton",5);
        Book wingsOfFire=new Book(3,"Wings of Fire","Literature","APJ AbdulKalam",5);

        Rack rack=new Rack();
        rack.addBook(math);
        rack.addBook(wingsOfFire);
        rack.removeBook(math);
        Assert.assertTrue((rack.isBookInRack(wingsOfFire)));

    }
    @Test
    public void testRemovedBookExistence(){
        Book math=new Book(2,"Math","Science","Newton",5);
        Book wingsOfFire=new Book(3,"Wings of Fire","Literature","APJ AbdulKalam",5);

        Rack rack=new Rack();
        rack.addBook(math);
        rack.addBook(wingsOfFire);
        rack.removeBook(math);
        Assert.assertFalse(rack.isBookInRack(math));

    }
    @Test
    public void testIsBookAvailable(){
        Book math=new Book(2,"Math","Science","Newton",5);
        Rack rack=new Rack();
        rack.addBook(math);
        Assert.assertTrue(rack.isBookInRack(math));

    }
    @Test
    public void testRemoveBook(){
        Book math=new Book(2,"Math","Science","Newton",5);
        Rack rack=new Rack();
        rack.addBook(math);
        rack.removeBook(math);
        Assert.assertFalse(rack.isBookInRack(math));
     }
    @Test
    public void testBookInRackPassByBookObject(){
        Book math=new Book(2,"Math","Science","Newton",5);
        Book english=new Book(3,"English","Literature","Rudyard Kipling",5);

        Rack rack=new Rack();
        rack.addBook(math);
        Assert.assertFalse(rack.isBookInRack(english));
    }
    @Test
    public void testIsBookInRackPassByISBN(){
        Book math=new Book(2,"Math","Science","Newton",5);
        Book english=new Book(3,"English","Literature","Rudyard Kipling",5);

        Rack rack=new Rack();
        rack.addBook(math);
        Assert.assertTrue(rack.isBookInRack(2));
    }
    @Test
    public void testIsBookNotInRackPassByISBN(){
        Book math=new Book(2,"Math","Science","Newton",5);
        Book english=new Book(3,"English","Literature","Rudyard Kipling",5);

        Rack rack=new Rack();
        rack.addBook(math);
        Assert.assertFalse(rack.isBookInRack(3));
    }
    @Test
    public void testReserveAnExistingBook(){
        Book math=new Book(2,"Math","Science","Newton",5);
        Book english=new Book(3,"English","Literature","Rudyard Kipling",5);
         person p=new person("Rodger",1);
        Rack rack=new Rack();
        rack.addBook(math);
        rack.addBook(english);
        Assert.assertEquals(english, (rack.reserveBook(3,1)));
    }
    @Test
    public void testReserveANonExistingBook(){
        Book math=new Book(2,"Math","Science","Newton",5);
        Book english=new Book(3,"English","Literature","Rudyard Kipling",5);
        person p=new person("Rodger",1);
        Rack rack=new Rack();
        rack.addBook(math);
        Assert.assertFalse(english.equals(rack.reserveBook(3,1)));
    }
}
