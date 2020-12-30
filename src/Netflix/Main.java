package Netflix;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    String strUsername;
    String strPassword;
    String strUserInput = "";

    System.out.println("");
    System.out.println(" *   *");
    System.out.println(" * * *");
    System.out.println(" *  **");
    System.out.println(" *   *");

    System.out.print("\nUsername: ");
    strUsername = keyboard.readLine();
    System.out.print("Password: ");
    strPassword = keyboard.readLine();

    WatchedList UserList = new WatchedList(Arrays.asList(""));
    Account userAccount = new Account(strUsername, strPassword, UserList);

    Movie Titanic = new Movie("Titanic", "Romance", "Hi", 1990, 9.00);
    Movie StarWars = new Movie("Star Wars", "Sci-Fi", "Lucas", 2003, 8.50);
    Movie Berserk = new Movie("Berserk", "Action", "Miura", 2003, 9.50);

    ArrayList<Movie> Movies = new ArrayList<>();
    Movies.add(Titanic);
    Movies.add(Berserk);
    Movies.add(StarWars);


    while(strUserInput.equals("")) {
      System.out.println("\n[My list] [Netflix Items] [Account Details]");
      strUserInput = keyboard.readLine();
      switch (strUserInput) {
        case "My List":
          System.out.println("Current List: " + UserList.getWatchedList());
          System.out.println("\nDo you want to add any items to your watched list?");
          break;
        case "Netflix Items":
          System.out.println("\nNetflix Movies: \n" + Movies);
          break;
        case "Account Details":
          System.out.println("Username: " + userAccount.getUsername());
          System.out.println("Password: " + userAccount.getPassword());
          break;
        default:
          strUserInput = "";
      }
    }
  }
}