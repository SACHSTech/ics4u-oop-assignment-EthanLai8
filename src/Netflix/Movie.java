package Netflix;

public class Movie extends Item {
  
  /**
  * Movie constructor. Creates an instance of the item, movie. An inheritance of the object, Item.
  *
  * @param strName - a string that displays the name of the movie
  * @param strGenre - a string that displays the genre of the movie
  * @param strDirector - a string that displays the director of the movie
  * @param intYear - an integer that displays what year the movie was released
  * @param dblRating - a double that displays what the rating of the movie
  */	
  public Movie(String strName, String strGenre, String strDirector, int intYear, double dblRating) {

    // Super method to take parameters from the parent class, Item
    super(strName, strGenre, strDirector, intYear, dblRating);
  }

  /**
  * toString method which prints out how this object would look like as a string.
  *
  * @return a String
  */
  public String toString() {
    return "\n[Movie: " + getName() + ", Genre: " + getGenre() + ", Director: " + getDirector() + ", Year Released: " + getYear() + ", Rating: " + getRating() + "]";
  }
}