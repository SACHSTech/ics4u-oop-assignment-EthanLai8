package Netflix;

import java.io.*;
import java.util.*;

public class WatchedList {
  private List<String> myList; 

  public WatchedList(List<String> myList) {
    this.myList = myList;
  }
  
  public List<String> getWatchedList() {
    return myList;
  }
}