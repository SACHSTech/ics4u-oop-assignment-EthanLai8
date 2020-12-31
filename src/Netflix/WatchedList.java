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
  
  public ArrayList<Item> getWatchedList() {
    return myList;
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
      if (intGenreCount[i] > intMax)
    }
  }

  public void Test(ArrayList<Item> Database) {
    for(Item Z : Database) {
      if(Z.getGenre().equalsIgnoreCase("Action")) {
        System.out.println(Z);
      }
    }
  }
}