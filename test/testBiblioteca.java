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
   }
