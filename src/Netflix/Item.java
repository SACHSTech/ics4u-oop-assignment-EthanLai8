package Netflix;

public class Item {

  // Instance variables
  private String strName;
  private String strGenre;
  private String strDirector;
  private int intYear;
  private double dblRating;

  // Item constructor
  public Item(String strName, String strGenre, String strDirector, int intYear, double dblRating) {
    this.strName = strName;
    this.strGenre = strGenre;
    this.strDirector = strDirector;
    this.intYear = intYear;
    this.dblRating = dblRating;
  }

  // Getter Methods
  public String getName() {
    return strName;
  }

  public String getGenre() {
    return strGenre;
  }

  public String getDirector() {
    return strDirector;
  }

  public int getYear() {
    return intYear;
  }

  public double getRating() {
    return dblRating;
  }

  // Setter Methods
  public void setName(String strName) {
    this.strName = strName;
  }

  public void setGenre(String strGenre) {
    this.strGenre = strGenre;
  }

  public void setDirector(String strDirector) {
    this.strDirector = strDirector;
  }

  public void setYear(int intYear) {
    this.intYear = intYear;
  }

  public void setRating(double dblRating) {
    this.dblRating = dblRating;
  }
}