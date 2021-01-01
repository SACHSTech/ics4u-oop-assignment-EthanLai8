package Netflix;

public class Movie extends Item {
  
  // Movie constructor
  public Movie(String strName, String strGenre, String strDirector, int intYear, double dblRating) {

    // Super method to take parameters from the parent class, Item
    super(strName, strGenre, strDirector, intYear, dblRating);
  }

  // toString method which prints out how this object would look like as a string
  public String toString() {
    return "\n[Movie: " + getName() + ", Genre: " + getGenre() + ", Director: " + getDirector() + ", Year Released: " + getYear() + ", Rating: " + getRating() + "]";
  }
}