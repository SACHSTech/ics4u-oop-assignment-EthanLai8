package Netflix;

import java.io.*;
import java.util.*;

public class Account {
  private String strUsername;
  private String strPassword;
  private WatchedList myList;

  public Account(String strUsername, String strPassword, WatchedList myList) {
    this.strUsername = strUsername;
    this.strPassword = strPassword;
    this.myList = myList;
  }
  
  // Getter Methods
  public String getUsername() {
    return strUsername;
  }

  public String getPassword() {
    return strPassword;
  }

  public ArrayList<Item> getList() {
    return myList.getWatchedList();
  }

  // Setter Methods
  public void setUsername(String strUsername) {
    this.strUsername = strUsername;
  }

  public void setPassword(String strPassword) {
    this.strPassword = strPassword;
  }

  public void setList(WatchedList myList) {
    this.myList = myList;
  }
}