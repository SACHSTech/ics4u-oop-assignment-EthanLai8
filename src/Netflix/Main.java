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

    Movie Titanic = new Movie("Titanic", "Romance", "Hi", 1990, 9.00);
    Movie StarWars = new Movie("Star Wars", "Sci-Fi", "Lucas", 2003, 8.50);
    Movie Berserk = new Movie("Berserk", "Action", "Miura", 2003, 9.50);

    ArrayList<Movie> Movies = new ArrayList<>();
    Movies.add(Titanic);
    Movies.add(Berserk);
    Movies.add(StarWars);


    while(isNetflixOn == true) {
      System.out.println("");
      System.out.println("---------------------------------------------");
      System.out.println("[My List] [Netflix Items] [Account Details]");
      System.out.println("---------------------------------------------");
      strUserInput = keyboard.readLine();
      System.out.println("---------------------------------------------");
      switch (strUserInput) {
        case "My List":
          System.out.println("\nCurrent List: " + userAccount.getList());
          System.out.print("\nWhat items do you want to add to your watched list? ");
          strUserItemInput = keyboard.readLine();
          UserList.AddingItem(strUserItemInput, Movies);
          System.out.println("\nCurrent List: " + userAccount.getList());
          break;

        case "Netflix Items":
          System.out.println("\nNetflix Movies: \n" + Movies);
          break;

        case "Account Details":
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