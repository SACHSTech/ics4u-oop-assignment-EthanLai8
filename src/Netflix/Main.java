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

    // Creating Item objects
    Item StrangerThings = new Show("Stranger Things", "Horror", "Matt Duffer", 2016, 8.70, 8);
    Item Berserk = new Show("Berserk", "Action", "Kentaro Miura", 1988, 9.35, 25);
    Item Titanic = new Movie("Titanic", "Romance", "James Cameron", 1997, 7.80);
    Item StarWars = new Movie("Star Wars: Episode III", "Sci-Fi", "George Lucas", 2005, 7.50);

    ArrayList<Item> Database = new ArrayList<>();
    Database.add(StrangerThings);
    Database.add(Berserk);
    Database.add(Titanic);
    Database.add(StarWars);

    while(isNetflixOn == true) {
      System.out.println("");
      System.out.println("---------------------------------------------");
      System.out.println("[(M)y List] [(D)atabase] [(R)ecommendations] [(A)ccount Details]");
      System.out.println("---------------------------------------------");
      strUserInput = keyboard.readLine();
      System.out.println("---------------------------------------------");
      switch (strUserInput) {
        case "M":
          System.out.println("\nCurrent List: " + userAccount.getList());
          System.out.print("\nWhat items do you want to add to your watched list? ");
          strUserItemInput = keyboard.readLine();
          UserList.AddingItem(strUserItemInput, Database);
          System.out.println("\nCurrent List: " + userAccount.getList());
          break;

        case "D":
          System.out.println("\nNetflix Database: \n" + Database);
          break;

        case "R":
          System.out.println("\nYour Recommendations:");
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