import org.junit.Assert;
import org.junit.Test;
public class MovieTest {
    @Test
    public void testShowMovie(){
        Movie sholay=new Movie("Sholay","SIPPY","N/A");
        MovieList movieList=new MovieList();
        movieList.add(sholay);
        Assert.assertTrue(movieList.hasMovie(sholay));
    }
}
