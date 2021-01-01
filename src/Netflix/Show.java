package Netflix;

public class Show extends Item {

  // Instance variables
  private int intEpisodes;

  /**
  * Show constructor. Creates an instance of the item, show. An inheritance of the object, Item.
  *
  * @param strName - a string that displays the name of the show
  * @param strGenre - a string that displays the genre of the show
  * @param strDirector - a string that displays the director of the show
  * @param intYear - an integer that displays what year the show was released
  * @param dblRating - a double that displays what the rating of the show
  * @param intEpisodes - an integer that displays how many episodes the show has
  */	
  public Show(String strName, String strGenre, String strDirector, int intYear, double dblRating, int intEpisodes) {

    // Super method to take parameters from the parent class, Item
    super(strName, strGenre, strDirector, intYear, dblRating);
    this.intEpisodes = intEpisodes;
  }

  /**
  * toString method which prints out how this object would look like as a string.
  *
  * @return a String
  */
  public String toString() {
    return "\n[Show: " + getName() + ", Genre: " + getGenre() + ", Director: " + getDirector() + ", Year Released: " + getYear() + ", Rating: " + getRating() + ", Episodes: " + intEpisodes + "]";
  }
}