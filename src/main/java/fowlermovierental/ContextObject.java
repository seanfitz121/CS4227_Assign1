package fowlermovierental;

public class ContextObject {
    Movie movie;
    public ContextObject(Movie movie){
        this.movie = movie;
    }
    public double getMoviePrice(){
        return this.movie.getPriceCode();
    }
    public String getMovieTitle(){
        return this.movie.getTitle();
    }
}
