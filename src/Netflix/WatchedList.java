package Netflix;

import java.io.*;
import java.util.*;

public class WatchedList {
  private ArrayList<Item> myList;
  private int intCheck;

  public WatchedList(ArrayList<Item> myList) {
    this.myList = myList;
  }
  
  public ArrayList<Item> getWatchedList() {
    return myList;
  }

  public void AddingItem(String strUserItemInput, ArrayList<Movie> Movies) {
    intCheck = 0;
    for (Item i : Movies) {
      if (strUserItemInput.equalsIgnoreCase(i.getName())) {
        myList.add(i);
      } else {
        intCheck++;
        if (intCheck == Movies.size()) {
          System.out.println("That item is not part of our database.");
        }
      }
    }
  }
}