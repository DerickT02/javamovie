import java.util.Comparator;

public class MovieGenre implements Comparator<Movie> {
    public int compare(Movie a, Movie b){
        return a.getGenre().compareTo(b.getGenre());
    }
}
