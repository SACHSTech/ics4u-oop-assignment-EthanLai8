/**
* ICS4U OOP Assignment
* @author: E. Lai
*/

package Netflix;

public class Movie extends Item {
  private double dblDuration;

  /**
  * Movie constructor. Creates an instance of the item, movie. An inheritance of the object, Item.
  *
  * @param strName - a string that displays the name of the movie
  * @param strGenre - a string that displays the genre of the movie
  * @param strDirector - a string that displays the director of the movie
  * @param intYear - an integer that displays what year the movie was released
  * @param dblRating - a double that displays what the rating of the movie
  * @param dblDuration - a double that displays the duration of the movie
  */	
  public Movie(String strName, String strGenre, String strDirector, int intYear, double dblRating, double dblDuration) {

    // Super method to take parameters from the parent class, Item
    super(strName, strGenre, strDirector, intYear, dblRating);
    this.dblDuration = dblDuration;
  }

  /**
  * Getter method that returns the movie's duration
  *
  * @return dblDuration - the duration of the movie
  */
  public double getDuration() {
    return dblDuration;
  }

  /**
  * Setter method that allows the user to modify the duration of the movie
  *
  * @param dblDuration - a double
  */
  public void setDuration(double dblDuration) {
    this.dblDuration = dblDuration;
  }

  /**
  * toString method which prints out how this object would look like as a string.
  *
  * @return a String
  */
  public String toString() {
    //return "\n[Movie: " + getName() + ", Genre: " + getGenre() + ", Director: " + getDirector() + ", Year Released: " + getYear() + ", Rating: " + getRating() + ", Duration: " + dblDuration + "h]";

    return String.format("|%10s |", "Movie") + String.format("%25s |", getName()) + String.format("%10s |", getGenre()) + String.format("%20s |", getDirector()) + String.format("%10s |", getYear()) + String.format("%10s |", getRating()) + String.format("%10s |", dblDuration) + String.format("%10s |", "N/A") + String.format("%10s |", "N/A") + "\n";
  }
}