import java.util.Comparator;

public class MovieReleaseDate implements Comparator<Movie> {
    public int compare(Movie a, Movie b){
        return a.getReleaseDate().compareTo(b.getReleaseDate());
    }
}
