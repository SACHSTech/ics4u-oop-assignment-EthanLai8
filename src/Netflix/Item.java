package Netflix;

public class Item {
  private String strName;
  private String strGenre;
  private String strDirector;
  private int intYear;
  private double dblRating;

  public Item(String strName, String strGenre, String strDirector, int intYear, double dblRating) {
    this.strName = strName;
    this.strGenre = strGenre;
    this.strDirector = strDirector;
    this.intYear = intYear;
    this.dblRating = dblRating;
  }

  public String getName() {
    return strName;
  }
  public String toString() {
    return "\nName: " + strName + "\nGenre: " + strGenre + "\nRating: " + dblRating + "\n";
  }
}