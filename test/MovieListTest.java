import org.junit.Assert;
import org.junit.Test;

public class MovieListTest {
    @Test
    public void testMovieAvailableInCollection(){
        Movie kugFuPanda=new Movie("Kung Fu Panda","Rodger","8");
        MovieList movieList=new MovieList();
        movieList.add(kugFuPanda);

        Assert.assertTrue(movieList.hasMovie(kugFuPanda));
    }
}
