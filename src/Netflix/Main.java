/**
* ICS4U OOP Assignment
* @author: E. Lai
*/

package Netflix;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

  /**
  * Static method that allows easy formatting for printing strings and numbers.
  *
  * @param strName - a string
  * @param args - any variable argument
  * @return Formatted String
  */
  public static String format(String strFormat, Object... args) {  
    return new Formatter().format(strFormat, args).toString();  
  }
  
  /**
  * Static method that prints the title.
  *
  * @return void
  */
  public static void title() {
    System.out.println("\n Please extend console to full screen...");
    sleep(2);
    System.out.println(" ___   ___  ________   ___________  __________  ___  __________ ___    ___              ");
    System.out.println(" |  \\  | | |  ______| |           | |  _______| | |  |        | \\  \\  /  /           ");
    System.out.println(" |   \\ | | | |______  |___     ___| | |_______  | |  |__    __|  \\  \\/  /            ");
    System.out.println(" | |\\ \\| | | _______|     |   |     |  _______| | |   __|  |__    \\    /             ");
    System.out.println(" | | \\   | | |______      |   |     | |         | |  |        |   /    \\              ");
    System.out.println(" |_|  \\ _| |________|     |___|     |_|         |_|  |________|  /__/\\__\\            ");
  }  

  /**
  * Static method that prints the log off info.
  *
  * @return void
  */
  public static void logoff() {
    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Logging off...");
    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
  }

  /**
  * Static method that prints the main menu.
  *
  * @return void
  */
  public static void mainmenu() {
    System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("[My List] [Database] [Recommendations] [Account Details]");
    System.out.println("\nType the first letter of the desired location to continue (e.g. M). \nType anything else to log off.");
    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
  }

  /**
  * Static method that allows the program to pause for a set amount of time.
  *
  * @param intSec - the time in seconds that the program pauses for. An integer.
  * @return void
  */
  public static void sleep(int intSec) {
    try { 
      TimeUnit.SECONDS.sleep(intSec);
    }
    catch (InterruptedException e) { 
        System.out.println(e);
    } 
  }
  
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
    String StringDatabase;
    Boolean isNetflixOn;
    Boolean isAddingToList;

    // Initializing Variables
    isNetflixOn = true;
    strUserInput = "";

    // Title screen static method
    title();

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
    Item Texhnolyze = new Show("Texhnolyze", "Sci-Fi", "Yasuyuki Ueda", 2003, 7.76, 22, "Finished");
    Item CobraKai = new Show("Cobra Kai", "Action", "Jon Hurwitz", 2018, 8.7, 32, "Airing");
    Item FamilyGuy = new Show("Family Guy", "Comedy", "Seth MacFarlane", 1999, 8.1, 364, "Airing");
    Item HunterxHunter = new Show("Hunter X Hunter", "Action", "Yoshihiro Togashi", 2011, 9.11, 148, "Finished");

    // Creating Movie Objects
    Item Titanic = new Movie("Titanic", "Romance", "James Cameron", 1997, 7.80, 210);
    Item StarWars = new Movie("Star Wars Trilogy", "Sci-Fi", "George Lucas", 2005, 7.50, 408);
    Item FallingDown = new Movie("Falling Down", "Comedy", "Joel Schumacher", 2005, 7.60, 113);
    Item YourName = new Movie("Your Name", "Romance", "Makoto Shinkai", 2016, 8.40, 112);
    Item LordOfTheRings = new Movie("Lord Of The Rings Trilogy", "Action", "Peter Jackson", 2001, 8.80, 702);
    Item TheThing = new Movie("The Thing", "Horror", "John Carpenter", 1982, 8.10, 109);
    Item TheConjuring = new Movie("The Conjuring", "Horror", "James Wan", 2013, 7.50, 112);
    Item ForrestGump = new Movie("Forrest Gump", "Romance", "Robert Zemeckis", 1994, 8.80, 142);
    Item SpiritedAway = new Movie("Spirited Away", "Horror", "Hayao Miyazaki", 2001, 8.60, 125);
    Item Inception = new Movie("Inception", "Sci-Fi", "Christopher Nolan", 2010, 8.80, 148);
    Item ThePlatform = new Movie("The Platform", "Horror", "Galder Urrutia", 2019, 7.0, 94);
    Item Saw = new Movie("Saw", "Horror", "James Wan", 2004, 7.6, 103);

    // Adding the movie and show objects into an Item arraylist
    ArrayList<Item> Database = new ArrayList<>();
    Database.add(StrangerThings);
    Database.add(Berserk);
    Database.add(SteinsGate);
    Database.add(Clannad);
    Database.add(Texhnolyze);
    Database.add(CobraKai);
    Database.add(FamilyGuy);
    Database.add(HunterxHunter);
    Database.add(Titanic);
    Database.add(StarWars);
    Database.add(FallingDown);
    Database.add(YourName);
    Database.add(LordOfTheRings);
    Database.add(TheThing);
    Database.add(TheConjuring);
    Database.add(ForrestGump);
    Database.add(SpiritedAway);
    Database.add(Inception);
    Database.add(ThePlatform);
    Database.add(Saw);

    // Creating a string version of the arraylist, Database. This version lacks the commas and square brackets.
    StringDatabase = (Arrays.toString(Database.toArray())).replace("[", " ").replace("]", "").replace(",", "");

    // While loop to allow the program to keep on repeating as long as a boolean is true
    while (isNetflixOn == true) {

      // Initializing a boolean which allows the program to keep on asking the user if they want to add more items to their list
      isAddingToList = true;

      // Prints instructions to the screen
      mainmenu();

      // Reads user input. User input determines which section of the program they want to access.
      strUserInput = keyboard.readLine();

      // Switch statement that detects what the user input is and accesses the user's desired section of the program.
      switch (strUserInput.toLowerCase()) {  
        case "m" :
          System.out.println("\nCurrent Watched List: \n");

          // Gets the user's current watched list using a method from the Account class
          System.out.println(" " + String.format("|%10s |", "Type") + String.format("%25s |", "Title") + String.format("%10s |", "Genre") + String.format("%20s |", "Director") + String.format("%10s |", "Year") + String.format("%10s |", "Rating") + String.format("%10s |", "Duration") + String.format("%10s |", "Episodes") + String.format("%10s |", "Status"));
          System.out.println(" --------------------------------------------------------------------------------------------------------------------------------------");
          System.out.println(userAccount.getList());
          sleep(1);

          // While loop that continuously asks the user if they want to add a new item to their list if a boolean is true.
          while (isAddingToList == true) {
            System.out.print("\nWhat items do you want to add to your watched list? (Press enter to leave) ");
            strUserItemInput = keyboard.readLine();

            // If the user types nothing, turns the boolean to false so the question will stop repeating. Also displays the User's watched list after their changes.
            if (strUserItemInput.equalsIgnoreCase("")) {
              isAddingToList = false;
              sleep(1);
              System.out.println("\nNew Watched List: \n");
              System.out.println(" " + String.format("|%10s |", "Type") + String.format("%25s |", "Title") + String.format("%10s |", "Genre") + String.format("%20s |", "Director") + String.format("%10s |", "Year") + String.format("%10s |", "Rating") + String.format("%10s |", "Duration") + String.format("%10s |", "Episodes") + String.format("%10s |", "Status"));
              System.out.println(" --------------------------------------------------------------------------------------------------------------------------------------");
              System.out.println(userAccount.getList());
            
            // If the user types anything, it triggers a method from the WatchedList class. This method checks if the user's string matches any object from the database and adds it to the user's watched list.
            }else {
              UserList.addingItem(strUserItemInput, Database);
            }
          }
          sleep(1);
          break;
        case "d" :
          System.out.println("\nNetflix Database: \n");

          // Prints out the arraylist which contains every movie and show in the database
          System.out.println(" " + String.format("|%10s |", "Type") + String.format("%25s |", "Title") + String.format("%10s |", "Genre") + String.format("%20s |", "Director") + String.format("%10s |", "Year") + String.format("%10s |", "Rating") + String.format("%10s |", "Duration") + String.format("%10s |", "Episodes") + String.format("%10s |", "Status"));
          System.out.println(" --------------------------------------------------------------------------------------------------------------------------------------");
          System.out.println(StringDatabase);
          sleep(1);
          break;
        case "r" :
          System.out.println("\nYour Recommendations (Based on common genres from your list):\n");

          // Triggers a method from the WatchedList class. This method sorts the user's watched list and counts their most watched genre. Then, it sorts the database arraylist and displays every object with that genre.
          System.out.println(String.format("|%10s |", "Type") + String.format("%25s |", "Title") + String.format("%10s |", "Genre") + String.format("%20s |", "Director") + String.format("%10s |", "Year") + String.format("%10s |", "Rating") + String.format("%10s |", "Duration") + String.format("%10s |", "Episodes") + String.format("%10s |", "Status"));
          System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
          UserList.recommendations(Database);
          sleep(1);
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
          logoff();
      }
    }
  }
}
