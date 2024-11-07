import java.time.LocalDate;

public class Movie implements Comparable<Movie>{
    private String title;
    private String genre;
    private double rating;
    private LocalDate releaseDate;
    private int recommendation;

    public Movie(String title, String genre, double rating, LocalDate releaseDate, int recommendation){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.recommendation = recommendation;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getGenre(){
        return this.genre;
    } 

    public void setRating(double rating){
        this.rating = rating;
    }

    public double getRating(){
        return this.rating;
    }

    public void setReleaseDate(LocalDate releaseDate){
        this.releaseDate = releaseDate;
    }

    public LocalDate getReleaseDate(){
        return this.releaseDate;
    }

    public void setRecommendation(int recommendation){
        this.recommendation = recommendation;
    }

    public int getRecommendation(){
        return this.recommendation;
    }

    @Override
    public int compareTo(Movie other){
        if (this.getRecommendation() < other.getRecommendation()) {
            return -1;
        } else if (this.getRecommendation() > other.getRecommendation()) {
            return 1;
        } else {
            return 0;
        }
    }
}
