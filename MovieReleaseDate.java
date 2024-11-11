import java.util.Comparator;

public class MovieReleaseDate implements Comparator<Movie> { //Used to compare based on release date
    public int compare(Movie a, Movie b){
        return a.getReleaseDate().compareTo(b.getReleaseDate());
    }
}
