public class Account {
  private String name;
  private double balance;

  public Account() {
    this.name = "";
    this.balance = 0;
  }

  public Account(double balance) {
    this.name = "";
    this.balance = balance;
  }

  public Account(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }

  public void withdraw(double amount) {
    if (amount > 0 && this.balance >= amount) {
      this.balance -= amount;
    }
  }

  public void deposit(double amount) {
    this.balance += amount;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("This account belongs to %s and currently has a balance of SEK%s.", name, balance);
  }
}
