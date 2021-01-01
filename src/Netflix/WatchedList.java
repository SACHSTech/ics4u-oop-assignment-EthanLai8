package Netflix;

import java.io.*;
import java.util.*;

public class WatchedList {

  // Instance variables
  private ArrayList<Item> myList;
  private int intCheck;
  private int[] intGenreCount;
  private int intMax;
  private boolean isItemInList;

  /**
  * WatchedList constructor. Creates an instance of the object, WatchedList. An aggregation of the object, Account.
  *
  * @param myList - an Arraylist that contains only Item objects
  */	
  public WatchedList(ArrayList<Item> myList) {
    this.myList = myList;
  }
  
  /**
  * Getter method that returns the watched list's arraylist contents
  *
  * @return myList - an arraylist that contains Item objects
  */	
  public ArrayList<Item> getWatchedList() {
    return myList;
  }

  /**
  * Setter method which allows the user to modify the watched list's arraylist
  *
  * @param myList - an arraylist that contains Item objects
  */	
  public void setWatchedList(ArrayList<Item> myList) {
    this.myList = myList;
  }

  /**
  * A method that adds an item to the user's watched list
  *
  * @param strUserItemInput - a string that comes from the user's inputs.
  * @param Database - an arraylist that contains Item objects. This arraylist contains every movie and show available.
  */	
  public void AddingItem(String strUserItemInput, ArrayList<Item> Database) {

    // Intializing instance variables
    intCheck = 0;
    isItemInList = false;

    // For loop that iterates through the database arraylist
    for (Item i : Database) {

      // If the user input equals to an object in the database, runs another set of programs
      if (strUserItemInput.equalsIgnoreCase(i.getName())) {

        // For loop that iterates through the user's watched list
        for (Item z : myList) {

          // If the current object is equal to the current selected object in the database, sets boolean to true and stops the for loop. Otherwise, sets the for loop as false.
          if (z.getName() == i.getName()) {
            isItemInList = true;
            break;
          } else {
            isItemInList = false;
          }
        }

        // If the boolean is true, prints out that the item is already in the user's watched list
        if (isItemInList == true) {
          System.out.println("This item is already in your list.");
        
        // Otherwise, adds the item into the user's watched list
        } else if (isItemInList == false) {
          myList.add(i);
        }
      
      // If the user's inputted string is not equal to an object in the database, increases an integer by 1
      } else {
        intCheck++;

        // If the integer reaches the same amount as the size of the database, prints out that the object is not part of the database
        if (intCheck == Database.size()) {
          System.out.println("That item is not part of our database.");
        }
      }
    }
  }

  /**
  * A method that checks which genre is most common in the user's watched list. Then lists all objects in the database with the same genre.
  *
  * @param Database - an arraylist that contains Item objects. This arraylist contains every movie and show available.
  */	
  public void Recommendations(ArrayList<Item> Database) {

    // Intializing instance variables
    intGenreCount = new int[] {0, 0, 0, 0, 0};
    intMax = intGenreCount[0];

    // For loop that iterates through the user's watched list
    for (Item i : myList) {

      // Checks each object's genre. Each cell of the array, intGenreCount, represents a specific genre. The cell is increased by 1 for each count of their specified genre. 
      if (i.getGenre().equalsIgnoreCase("Action")) {
        intGenreCount[0]++; 
      } else if (i.getGenre().equalsIgnoreCase("Comedy")) {
        intGenreCount[1]++; 
      } else if (i.getGenre().equalsIgnoreCase("Horror")) {
        intGenreCount[2]++; 
      } else if (i.getGenre().equalsIgnoreCase("Romance")) {
        intGenreCount[3]++; 
      } else if (i.getGenre().equalsIgnoreCase("Sci-Fi")) {
        intGenreCount[4]++; 
      }
    }

    // For loop that checks which cell has the greatest number
    for (int i = 0; i < intGenreCount.length; i++) {
      if (intGenreCount[i] > intMax) {
        intMax = intGenreCount[i];
      }
    }

    // For loop that iterates through the database arraylist
    for(Item Z : Database) {

      // If statements that check which cell has the greatest number. Displays all objects from the database with the same genre as the genre that the greatest cell represents.
      if (intMax == intGenreCount[0]) {
        if(Z.getGenre().equalsIgnoreCase("Action")) {
          System.out.println(Z);
        }
      } else if (intMax == intGenreCount[1]) {
        if(Z.getGenre().equalsIgnoreCase("Comedy")) {
          System.out.println(Z);
        }
      } else if (intMax == intGenreCount[2]) {
        if(Z.getGenre().equalsIgnoreCase("Horror")) {
          System.out.println(Z);
        }
      } else if (intMax == intGenreCount[3]) {
        if(Z.getGenre().equalsIgnoreCase("Romance")) {
          System.out.println(Z);
        }
      } else if (intMax == intGenreCount[4]) {
        if(Z.getGenre().equalsIgnoreCase("Sci-Fi")) {
          System.out.println(Z);
        }
      }
    }
  }
}