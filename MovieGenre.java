import java.util.Comparator;

public class MovieGenre implements Comparator<Movie> { //Used to compare based on genre
    public int compare(Movie a, Movie b){
        return a.getGenre().compareTo(b.getGenre());
    }
}
