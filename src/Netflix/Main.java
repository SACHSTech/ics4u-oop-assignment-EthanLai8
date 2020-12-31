package Netflix;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    String strUsername;
    String strPassword;
    String strUserInput = "";
    String strUserItemInput;

    Boolean isNetflixOn = true;
    Boolean isAddingToList;

    System.out.println("");
    System.out.println(" *   *");
    System.out.println(" * * *");
    System.out.println(" *  **");
    System.out.println(" *   *");

    System.out.print("\nUsername: ");
    strUsername = keyboard.readLine();
    System.out.print("Password: ");
    strPassword = keyboard.readLine();

    WatchedList UserList = new WatchedList(new ArrayList<Item>());
    Account userAccount = new Account(strUsername, strPassword, UserList);

    // Creating Show Objects
    Item StrangerThings = new Show("Stranger Things", "Horror", "Matt Duffer", 2016, 8.70, 8);
    Item Berserk = new Show("Berserk", "Action", "Kentaro Miura", 1988, 9.35, 25);
    Item Clannad = new Show("Clannad", "Romance", "Tatsuya Ishihara", 2008, 8.96, 47);
    Item SteinsGate = new Show("Steins Gate", "Sci-Fi", "Hamasaki Hiroshi", 2011, 9.12, 24);
    Item HunterxHunter = new Show("Hunter X Hunter", "Action", "Yoshihiro Togashi", 2011, 9.11, 148);

    // Creating Movie Objects
    Item Titanic = new Movie("Titanic", "Romance", "James Cameron", 1997, 7.80);
    Item StarWars = new Movie("Star Wars Trilogy", "Sci-Fi", "George Lucas", 2005, 7.50);
    Item FallingDown = new Movie("Falling Down", "Comedy", "Joel Schumacher", 2005, 7.60);
    Item YourName = new Movie("Your Name", "Romance", "Makoto Shinkai", 2016, 8.40);
    Item LordOfTheRings = new Movie("Lord Of The Rings Trilogy", "Action", "Peter Jackson", 2001, 8.80);
    Item TheThing = new Movie("The Thing", "Horror", "John Carpenter", 1982, 8.10);
    Item TheConjuring = new Movie("The Conjuring", "Horror", "James Wan", 2013, 7.50);

    ArrayList<Item> Database = new ArrayList<>();
    Database.add(StrangerThings);
    Database.add(Berserk);
    Database.add(SteinsGate);
    Database.add(Clannad);
    Database.add(HunterxHunter);

    Database.add(Titanic);
    Database.add(StarWars);
    Database.add(FallingDown);
    Database.add(YourName);
    Database.add(LordOfTheRings);
    Database.add(TheThing);
    Database.add(TheConjuring);

    while(isNetflixOn == true) {
      isAddingToList = true;
      System.out.println("");
      System.out.println("---------------------------------------------");
      System.out.println("[(M)y List] [(D)atabase] [(R)ecommendations] [(A)ccount Details]");
      System.out.println("---------------------------------------------");
      strUserInput = keyboard.readLine();
      System.out.println("---------------------------------------------");
      switch (strUserInput) {
        case "M":
          System.out.println("\nCurrent List: " + userAccount.getList());
          while(isAddingToList == true) {
            System.out.print("\nWhat items do you want to add to your watched list? (Press enter to leave) ");
            strUserItemInput = keyboard.readLine();
            if (strUserItemInput.equalsIgnoreCase("")) {
              isAddingToList = false;
            } else {
              UserList.AddingItem(strUserItemInput, Database);
            }
          }
          break;

        case "D":
          System.out.println("\nNetflix Database: \n" + Database);
          break;

        case "R":
          System.out.println("\nYour Recommendations (Based on common genres from your list):");
          UserList.Recommendations(Database);
          break;
        case "A":
          System.out.println("");
          System.out.println("Username: " + userAccount.getUsername());
          System.out.println("Password: " + userAccount.getPassword());
          break;
        
        default:
          isNetflixOn = false;
          System.out.println("Logging off...");
          System.out.println("---------------------------------------------");
      }
    }
  }
}