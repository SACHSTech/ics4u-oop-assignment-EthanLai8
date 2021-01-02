package Netflix;

import java.io.*;
import java.util.*;

/**
* ICS4U OOP Assignment
* @author: E. Lai
*
*/

public class Main {
  public static void main(String[] args) throws IOException {

    // Setting up Buffered reader for user input
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Variables
    String strUsername;
    String strPassword;
    String strUserInput;
    String strUserItemInput;
    String strUserChangedPass;
    String strUserChangedUser;
    Boolean isNetflixOn;
    Boolean isAddingToList;

    // Initializing Variables
    isNetflixOn = true;
    strUserInput = "";

    // Title screen
    System.out.println(" Please extend console to full screen...");
    System.out.println(" ___      ___  ________   ___________  __________  ___  __________ __    __                ");
    System.out.println(" | |\\\\    | | |  ______| |           | |  _______| | |  |        | \\ \\  / /            ");
    System.out.println(" | | \\\\   | | | |______  |___     ___| | |_______  | |  |__    __|  \\ \\/ /             ");
    System.out.println(" | |  \\\\  | | | _______|     |   |     |  _______| | |   __|  |__    \\ \\/              ");
    System.out.println(" | |   \\\\ | | | |______      |   |     | |         | |  |        |   /\\ \\              ");
    System.out.println(" |_|    \\\\|_| |________|     |___|     |_|         |_|  |________| _/_/\\_\\_            ");

    // Asking for user input for their account's username and password
    System.out.print("\nUsername: ");
    strUsername = keyboard.readLine();
    System.out.print("Password: ");
    strPassword = keyboard.readLine();

    // Creating a watchlist object and an account object using their username and password
    WatchedList UserList = new WatchedList(new ArrayList<Item>());
    Account userAccount = new Account(strUsername, strPassword, UserList);

    // Creating Show Objects
    Item StrangerThings = new Show("Stranger Things", "Horror", "Matt Duffer", 2016, 8.70, 8, "Finished");
    Item Berserk = new Show("Berserk", "Action", "Kentaro Miura", 1988, 9.35, 25, "Airing");
    Item Clannad = new Show("Clannad", "Romance", "Tatsuya Ishihara", 2008, 8.96, 47, "Finished");
    Item SteinsGate = new Show("Steins Gate", "Sci-Fi", "Hamasaki Hiroshi", 2011, 9.12, 24, "Finished");
    Item HunterxHunter = new Show("Hunter X Hunter", "Action", "Yoshihiro Togashi", 2011, 9.11, 148, "Finished");

    // Creating Movie Objects
    Item Titanic = new Movie("Titanic", "Romance", "James Cameron", 1997, 7.80, 2.67);
    Item StarWars = new Movie("Star Wars Trilogy", "Sci-Fi", "George Lucas", 2005, 7.50, 6.8);
    Item FallingDown = new Movie("Falling Down", "Comedy", "Joel Schumacher", 2005, 7.60, 1.89);
    Item YourName = new Movie("Your Name", "Romance", "Makoto Shinkai", 2016, 8.40, 1.87);
    Item LordOfTheRings = new Movie("Lord Of The Rings Trilogy", "Action", "Peter Jackson", 2001, 8.80, 11.7);
    Item TheThing = new Movie("The Thing", "Horror", "John Carpenter", 1982, 8.10, 1.82);
    Item TheConjuring = new Movie("The Conjuring", "Horror", "James Wan", 2013, 7.50, 1.87);

    // Adding the movie and show objects into an arraylist
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

    // While loop to allow the program to keep on repeating as long as a boolean is true
    while (isNetflixOn == true) {

      // Initializing a boolean which allows the program to keep on asking the user if they want to add more items to their list
      isAddingToList = true;

      // Prints instructions to the screen
      System.out.println("");
      System.out.println("-------------------------------------------------------------------------");
      System.out.println("[My List] [Database] [Recommendations] [Account Details]");
      System.out.println("\nType the first letter of the desired location to continue (e.g M) \nType anything else to log off");
      System.out.println("-------------------------------------------------------------------------");

      // Reads user input. User input determines which section of the program they want to access.
      strUserInput = keyboard.readLine();

      // Switch statement that detects what the user input is and accesses the user's desired section of the program.
      switch (strUserInput.toLowerCase()) {
        case "m" :

          // Gets the user's current watched list using a method from the Account class
          System.out.println("\nCurrent Watched List: \n" + userAccount.getList());

          // While loop that continuously asks the user if they want to add a new item to their list if a boolean is true.
          while (isAddingToList == true) {
            System.out.print("\nWhat items do you want to add to your watched list? (Press enter to leave) ");
            strUserItemInput = keyboard.readLine();

            // If the user types nothing, turns the boolean to false so the question will stop repeating. Also displays the User's watched list after their changes.
            if (strUserItemInput.equalsIgnoreCase("")) {
              isAddingToList = false;
              System.out.println("\nNew Watched List: \n" + userAccount.getList());
            
            // If the user types anything, it triggers a method from the WatchedList class. This method checks if the user's string matches any object from the database and adds it to the user's watched list.
            }else {
              UserList.AddingItem(strUserItemInput, Database);
            }
          }
          break;

        case "d" :

          // Prints out the arraylist which contains every movie and show in the database
          System.out.println("\nNetflix Database: \n" + Database);
          break;

        case "r" :
          System.out.println("\nYour Recommendations (Based on common genres from your list):");

          // Triggers a method from the WatchedList class. This method sorts the user's watched list and counts their most watched genre. Then, it sorts the database arraylist and displays every object with that genre.
          UserList.Recommendations(Database);
          break;

        case "a" :
          System.out.println("");

          // Triggers a method from the Account class which gets the user's current username and password
          System.out.println("Username: " + userAccount.getUsername());
          System.out.println("Password: " + userAccount.getPassword());
          System.out.print("New Username (Press enter to skip): ");
          strUserChangedUser = keyboard.readLine();

          // If statement that checks if the user pressed enter or not
          if (!strUserChangedUser.equalsIgnoreCase("")) {

            // Triggers a method from the Account class which sets the account's username as a new username
            userAccount.setUsername(strUserChangedUser);
          }
          System.out.print("New Password (Press enter to skip): ");
          strUserChangedPass = keyboard.readLine();

          // If statement that checks if the user pressed enter or not
          if (!strUserChangedPass.equalsIgnoreCase("")) {

            // Triggers a method from the Account class which sets the account's password as a new password
            userAccount.setPassword(strUserChangedPass);
          }
          break;
        
        default :

          // Turns a boolean off which prevents the program from running again
          isNetflixOn = false;
          System.out.println("---------------------------------------------");
          System.out.println("Logging off...");
          System.out.println("---------------------------------------------");
      }
    }
  }
}