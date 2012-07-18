import org.omg.Dynamic.Parameter;

import java.io.PrintStream;

public class Movie {
    String name;
    String director;
    String rating;
    public Movie(){
        name=null;
        director=null;
        rating=null;
    }
    public Movie(String name,String director,String rating){
        this.name=name;
        this.director =director;
        this.rating=rating;
    }
    public Movie(String name,String director){
        this.name=name;
        this.director=director;
        this.rating="N/A";
    }
    public void print(){
        System.out.println(String.format("%-35s %-20s %-4s \n",name,director,rating));
    }
}
