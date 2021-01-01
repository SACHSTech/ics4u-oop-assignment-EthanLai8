package Netflix;

import java.io.*;
import java.util.*;

public class WatchedList {
  private ArrayList<Item> myList;
  private int intCheck;
  private int[] intGenreCount;
  private int intMax;

  public WatchedList(ArrayList<Item> myList) {
    this.myList = myList;
  }
  
  // Getter Method
  public ArrayList<Item> getWatchedList() {
    return myList;
  }

  // Setter Method
  public void setWatchedList(ArrayList<Item> myList) {
    this.myList = myList;
  }

  public void AddingItem(String strUserItemInput, ArrayList<Item> Database) {
    intCheck = 0;
    for (Item i : Database) {
      if (strUserItemInput.equalsIgnoreCase(i.getName())) {
        myList.add(i);
      } else {
        intCheck++;
        if (intCheck == Database.size()) {
          System.out.println("That item is not part of our database.");
        }
      }
    }
  }

  public void Recommendations(ArrayList<Item> Database) {
    intGenreCount = new int[] {0, 0, 0, 0, 0};
    intMax = intGenreCount[0];
    for (Item i : myList) {
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
    for (int i = 0; i < intGenreCount.length; i++) {
      if (intGenreCount[i] > intMax) {
        intMax = intGenreCount[i];
      }
    }
    for(Item Z : Database) {
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