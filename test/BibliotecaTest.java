import junit.framework.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BibliotecaTest {

    @Test
    public void testIsBookInRackExistingBook(){
        Biblioteca biblioteca =new Biblioteca();
        biblioteca.showBooks();
        Assert.assertTrue(biblioteca.isBookInRack("2"));
    }
    @Test
    public void testIsBookInRackNotExistinBook(){
        Biblioteca biblioteca =new Biblioteca();
        Assert.assertFalse(biblioteca.isBookInRack("10"));
    }

   }
