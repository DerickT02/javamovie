import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Movie goodFellas = new Movie("GoodFellas", "Gangster", .73, LocalDate.of(1990, 9, 19), 9);
        Movie heat = new Movie("Heat", "Crime", .90, LocalDate.of(1995, 12, 15), 10);
        Movie aBronxTale = new Movie("A Bronx Tale", "Teen", 0.70, LocalDate.of(1993, 9, 29), 100);

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(aBronxTale);
        movies.add(goodFellas);
        movies.add(heat);

        System.out.println("Before sort by recommendation");
        for(int i = 0; i < movies.size(); i++){
            System.out.println(movies.get(i).getTitle() + " : Genre: " + movies.get(i).getGenre());
        }
        System.out.println("After sort by recommendation");

        Collections.sort(movies, new MovieGenre());
        for(int i = 0; i < movies.size(); i++){
            System.out.println(movies.get(i).getTitle() + " : Genre: " + movies.get(i).getGenre());
        }


    }
}
