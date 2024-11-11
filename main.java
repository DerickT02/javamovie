import java.time.LocalDate;
import java.util.Scanner;
import java.util.PriorityQueue;

public class main{
    public static void main(String[] args){
        System.out.println("How do you want your movie queue?"); //asks the user how they want their queue sorted
        System.out.println("By recommendation");
        System.out.println("By release date");
        System.out.println("By genre");

        Movie goodFellas = new Movie("GoodFellas", "Gangster", .73, LocalDate.of(1990, 9, 19), 9); //information for movies
        Movie heat = new Movie("Heat", "Crime", .90, LocalDate.of(1995, 12, 15), 10);
        Movie aBronxTale = new Movie("A Bronx Tale", "Teen", 0.70, LocalDate.of(1993, 9, 29), 10);

        Scanner input = new Scanner(System.in); //takes in user input
        String preference = input.nextLine();

        PriorityQueue<Movie> moviePriorityQueue = null; //declares a variable but does not implement it yet

        while (moviePriorityQueue == null) {

            if (preference.equalsIgnoreCase("Recommendation")) { //checks if a valid input was used and prepares to implement it in the queue
                moviePriorityQueue = new PriorityQueue<>();
            } else if (preference.equalsIgnoreCase("Release Date")) {
                moviePriorityQueue = new PriorityQueue<>(new MovieReleaseDate());
            } else if (preference.equalsIgnoreCase("Genre")) {
                moviePriorityQueue = new PriorityQueue<>(new MovieGenre());
            } else {
                System.out.println("Please choose between recommendation, release date, or genre."); //asks user for a valid queue if previously not inputted
                preference = input.nextLine();
            }
        }

        moviePriorityQueue.add(aBronxTale); //adds movies to queue
        moviePriorityQueue.add(goodFellas);
        moviePriorityQueue.add(heat);

        Movie firstPriorityMovie = moviePriorityQueue.peek(); //displays only the first movie in the queue based on how the user wants it sorted
        System.out.println("First movie");
        System.out.println("Title: " + firstPriorityMovie.getTitle() + " Genre: " + firstPriorityMovie.getGenre() + " Rating: " + firstPriorityMovie.getRating() + " Release date: " + firstPriorityMovie.getReleaseDate() + " Recommendation: " + firstPriorityMovie.getRecommendation());

        System.out.println("Full Queue"); //displays the full queue based on how the user wants it sorted
        for (Movie movie : moviePriorityQueue){
            System.out.println("Title: " + movie.getTitle() + " Genre: " + movie.getGenre() + " Rating: " + movie.getRating() + " Release date: " + movie.getReleaseDate() + " Recommendation: " + movie.getRecommendation());
        }
        moviePriorityQueue.poll(); //deletes the first item in the queue
        System.out.println("Queue after deletion"); //displays the queue with the first item removed
        for (Movie movie : moviePriorityQueue){
            System.out.println("Title: " + movie.getTitle() + " Genre: " + movie.getGenre() + " Rating: " + movie.getRating() + " Release date: " + movie.getReleaseDate() + " Recommendation: " + movie.getRecommendation());
        }
        input.close();
    }
}
