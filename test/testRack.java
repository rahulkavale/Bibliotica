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
    public void testShowBooksReaalyShowsAnAvailableBook(){
        Book math=new Book(2,"fg","fgfg","k",5);
        Rack rack=new Rack();
        rack.addBook(math);
        Assert.assertTrue(rack.isBookInRack(math));
    }

}
