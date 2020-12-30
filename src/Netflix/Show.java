package Netflix;

public class Show extends Item {
  private int intEpisodes;

  public Show(String strName, String strGenre, String strDirector, int intYear, double dblRating, int intEpisodes) {
    super(strName, strGenre, strDirector, intYear, dblRating);
    this.intEpisodes = intEpisodes;
  }
}