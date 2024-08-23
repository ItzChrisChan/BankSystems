public interface Account {
    void deposit(double amount);

    void withdraw(double amount);

    double calculateInterest();

    double getBalance();

    String getName();
}

