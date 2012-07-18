import java.text.Format;
import java.util.ArrayList;
import java.util.List;
public class MovieList {
    private List<Movie> movieList=new ArrayList<Movie>();
    public void add(Movie movie){
        movieList.add(movie);
    }
    public boolean hasMovie(Movie movie){
        return movieList.contains(movie);
    }

    public void print() {
        for (Movie movie : movieList) {
            movie.print();

        }
    }
}
