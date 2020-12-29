package Netflix;

public class Show extends Item {
  private int intEpisodes;

  public Show(String strName, String strGenre, int intRating, int intEpisodes) {
    super(strName, strGenre, intRating);
    this.intEpisodes = intEpisodes;
  }
}