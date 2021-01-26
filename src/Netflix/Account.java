/**
* ICS4U OOP Assignment
* @author: E. Lai
*/

package Netflix;

import java.io.*;
import java.util.*;

public class Account {

  // Instance variables
  private String strUsername;
  private String strPassword;
  private WatchedList myList;

  /**
  * Account constructor. Creates an instance of the object, Account. Has a WatchedList object as a parameter.
  *
  * @param strUsername - The account's username which is a string
  * @param strPassword - The account's password which is a string
  * @param myList - The account's watched list. This is a WatchedList object.
  */	
  public Account(String strUsername, String strPassword, WatchedList myList) {
    this.strUsername = strUsername;
    this.strPassword = strPassword;
    this.myList = myList;
  }
  
  /**
  * Getter method that returns the account's username
  *
  * @return strUsername - the username of the account
  */	
  public String getUsername() {
    return strUsername;
  }

  /**
  * Getter method that returns the account's password
  *
  * @return strPassword - the password of the account
  */	
  public String getPassword() {
    return strPassword;
  }

  /**
  * Getter method that returns the account's watched list as a string. Removes all square brackets and commas from the watched list when it is converted to a string.
  *
  * @return String of myList.getWatchedList - a method from WatchedList class. Displays the string version of the arraylist of myList.
  */	
  public String getList() {
    return Arrays.toString(myList.getWatchedList().toArray()).replace("[", " ").replace("]", "").replace(",", "");
  }

  /**
  * Setter method that allows the user to modify the username of the account.
  *
  * @param strUsername - a string
  */	
  public void setUsername(String strUsername) {
    this.strUsername = strUsername;
  }

  /**
  * Setter method that allows the user to modify the password of the account.
  *
  * @param strPassword - a string
  */	
  public void setPassword(String strPassword) {
    this.strPassword = strPassword;
  }

  /**
  * Setter method that allows the user to modify the myList object.
  *
  * @param myList - an object from the WatchedList class
  */	
  public void setList(WatchedList myList) {
    this.myList = myList;
  }
}