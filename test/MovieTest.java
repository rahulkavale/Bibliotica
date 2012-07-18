import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/18/12
 * Time: 8:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {
    @Test
    public void testShowMovie(){
        Movie sholay=new Movie("Sholay","SIPPY","N/A");
        MovieList movieList=new MovieList();
        movieList.add(sholay);
        Assert.assertTrue(movieList.hasMovie(sholay));
    }
}
