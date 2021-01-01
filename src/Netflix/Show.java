package Netflix;

public class Show extends Item {

  // Instance variables
  private int intEpisodes;

  // Show constructor
  public Show(String strName, String strGenre, String strDirector, int intYear, double dblRating, int intEpisodes) {

    // Super method to take parameters from the parent class, Item
    super(strName, strGenre, strDirector, intYear, dblRating);
    this.intEpisodes = intEpisodes;
  }

  // toString method which prints out how this object would look like as a string
  public String toString() {
    return "\n[Show: " + getName() + ", Genre: " + getGenre() + ", Director: " + getDirector() + ", Year Released: " + getYear() + ", Rating: " + getRating() + ", Episodes: " + intEpisodes + "]";
  }
}