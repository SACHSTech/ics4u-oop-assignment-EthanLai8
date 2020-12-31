package Netflix;

public class Movie extends Item {

  public Movie(String strName, String strGenre, String strDirector, int intYear, double dblRating) {
    super(strName, strGenre, strDirector, intYear, dblRating);
  }
  public String toString() {
    return "\n[Movie: " + getName() + ", Genre: " + getGenre() + ", Director: " + getDirector() + ", Year Released: " + getYear() + ", Rating: " + getRating() + "]";
  }
}