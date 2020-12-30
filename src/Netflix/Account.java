package Netflix;

import java.io.*;
import java.util.*;

public class Account {
  private String strUsername;
  private String strPassword;
  private WatchedList myList;

  // WatchedList myList = new WatchedList(Arrays.asList(""));

  public Account(String strUsername, String strPassword, WatchedList myList) {
    this.strUsername = strUsername;
    this.strPassword = strPassword;
    this.myList = myList;
  }

  public String getUsername() {
    return strUsername;
  }

  public String getPassword() {
    return strPassword;
  }
}