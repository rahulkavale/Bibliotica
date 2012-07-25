import org.junit.Assert;
import org.junit.Test;
public class RackTest {
    @Test
    public void testShowsAnAvailableBook(){

        Book math=new Book("1","Math","Science","Newton");
        Book wingsOfFire=new Book("2","Wings of Fire","Literature","APJ AbdulKalam");
        Book english=new Book("3","English","Literature","Rudyard Kipling");
        Rack rack=new Rack();
        rack.addBook(math, "2");
        rack.addBook(english,"4");
        rack.addBook(wingsOfFire,"41");
        rack.showAllBook();
    }
    @Test
    public void testShowAvailableBook(){
        Book math=new Book("2","Math","Science","Newton");
        Rack rack=new Rack();
        rack.addBook(math, "1");
        Assert.assertTrue(rack.isBookInRack(math));
    }
    @Test
    public void testShowAnUnavailableBook(){
        Book math=new Book("2","Math","Science","Newton");
        Book wingsOfFire=new Book("3","Wings of Fire","Literature","APJ AbdulKalam");
        Rack rack=new Rack();
        rack.addBook(math,"1");
        Assert.assertFalse(rack.isBookInRack(wingsOfFire));
    }
    @Test
    public void testShowAvailableBookByProvidingOnlyISBN(){
        Book math=new Book("2","Math","Science","Newton");
        Book wingsOfFire=new Book("3","Wings of Fire","Literature","APJ AbdulKalam");
        Rack rack=new Rack();
        rack.addBook(math,"100");
        rack.addBook(wingsOfFire,"10");
        Assert.assertTrue(rack.isBookInRack("3"));
    }
    //User should be able to search bok by any of the field
    @Test
    public void testNonRemovedBookExistence(){
        Book math=new Book("2","Math","Science","Newton");
        Book wingsOfFire=new Book("3","Wings of Fire","Literature","APJ AbdulKalam");
        Rack rack=new Rack();
        rack.addBook(math,"2");
        rack.addBook(wingsOfFire,"3");
        rack.removeBook(math);
        Assert.assertTrue((rack.isBookInRack(wingsOfFire)));
        Assert.assertTrue((rack.isBookInRack("3")));

        Assert.assertFalse((rack.isBookInRack(math)));
        Assert.assertFalse((rack.isBookInRack("2")));
    }
    @Test
    public void testRemovedBookExistence(){
        Book math=new Book("2","Math","Science","Newton");
        Book wingsOfFire=new Book("3","Wings of Fire","Literature","APJ AbdulKalam");
        Rack rack=new Rack();
        rack.addBook(math,"2");
        rack.addBook(wingsOfFire,"3");
        rack.removeBook(math);
        Assert.assertFalse(rack.isBookInRack(math));
    }
    @Test
    public void testIsBookAvailable(){
        Book math=new Book("2","Math","Science","Newton");
        Rack rack=new Rack();
        rack.addBook(math,"2");
        Assert.assertTrue(rack.isBookInRack(math));
    }
    @Test
    public void testRemoveBook(){
        Book math=new Book("2","Math","Science","Newton");
        Rack rack=new Rack();
        rack.addBook(math,"2");
        rack.removeBook(math);
        Assert.assertFalse(rack.isBookInRack(math));
    }
    @Test
    public void testBookInRackPassByBookObjectForUnavailableBook(){

        Book math=new Book("2","Math","Science","Newton");
        Book english=new Book("3","English","Literature","Rudyard Kipling");
        Rack rack=new Rack();
        rack.addBook(math,"2");
        Assert.assertFalse(rack.isBookInRack(english));
    }
    @Test
     public void testIsBookInRackPassByISBN(){
        Book math=new Book("2","Math","Science","Newton");
        Rack rack=new Rack();
        rack.addBook(math,"2");
        Assert.assertTrue(rack.isBookInRack("2"));
    }
    @Test
    public void testIsBookNotInRackPassByISBN(){
        Book math=new Book("2","Math","Science","Newton");
        Book english=new Book("3","English","Literature","Rudyard Kipling");
        Rack rack=new Rack();
        rack.addBook(english,"1");
        rack.addBook(math, "1");
        rack.removeBook(english);
        Assert.assertFalse(rack.isBookInRack("3"));
    }
    @Test
    public void testBookCopyAvailable(){
        Book math=new Book("2","Math","Science","Newton");
        Book english=new Book("3","English","Literature","Rudyard Kipling");
        Rack rack=new Rack();
        rack.addBook(english,"1");
        rack.addBook(math, "1");
        try
        {
        Assert.assertTrue(rack.areCopiesOfTheBookAreAvailable("2"));
        Assert.assertTrue(rack.areCopiesOfTheBookAreAvailable("3"));
        }catch(Exception e){
            e.toString();
        }
    }
    @Test (expected = BookNotAvailableException.class)
    public void testBookUnavailableThrowsException(){
        Book math=new Book("2","Math","Science","Newton");
        Book english=new Book("3","English","Literature","Rudyard Kipling");
        Rack rack=new Rack();
        rack.addBook(english,"1");
        rack.areCopiesOfTheBookAreAvailable("2");
    }
    @Test
    public void testReservingABook(){
        Book math=new Book("2","Math","Science","Newton");
        Book english=new Book("3","English","Literature","Rudyard Kipling");
        Rack rack=new Rack();
        rack.addBook(math,"1");
        rack.reserveBook("2", math);
        Assert.assertEquals(true,rack.areCopiesOfTheBookAreAvailable("2"));
    }
    @Test (expected = BookNotAvailableException.class)
    public void testReservingABookNotAvailableInLibrary(){
        Book math=new Book("2","Math","Science","Newton");
        Rack rack=new Rack();
        rack.reserveBook("2", math);
    }
    @Test (expected = BookCopyNotAvailableException.class)
    public void testReservingABookCopyNotAvailableInLibrary(){
        Book math=new Book("2","Math","Science","Newton");
        Rack rack=new Rack();
        rack.addBook(math,"1");
        rack.reserveBook("2", math);
        rack.reserveBook("2", math);
    }
}