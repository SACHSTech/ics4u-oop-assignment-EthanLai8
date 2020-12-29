package Netflix;

public class Account {
  private String strEmail;
  private String strPassword;

  public Account(String strEmail, String strPassword) {
    this.strEmail = strEmail;
    this.strPassword = strPassword;
  }

  public String getEmail() {
    return this.strEmail;
  }

  public String getPassword() {
    return this.strPassword;
  }
}