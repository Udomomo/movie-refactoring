package MovieRental;

/**
 * 各映画が借りられている状態を示すクラス
 *
 */
public class Rental {
    
    private Movie _movie;
    private int _daysRented;
    
    public Rental(Movie movie, int daysRented) {
        
        _movie = movie;
        _daysRented = daysRented;
        
    }
    
    public int getDaysRented() {
        
        return _daysRented;
    }
    
    public Movie getMovie() {
        
        return _movie;
    }
    
}
