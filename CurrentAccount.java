class CurrentAccount implements Account {
    private double balance;
    private final String name;

    public CurrentAccount(double initialBalance, String name) {
        this.balance = initialBalance;
        this.name = name;
        Bank.addAccount(this);

    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if(amount > 0) {
            balance -= amount;
        }
    }

    public double calculateInterest() {
        if(balance < 0) {
            return balance * 0.3 / 365; // Daily interest for simplification
        }
        return 0;
    }

    public double getBalance() {
        return balance + calculateInterest();
    }

    public String getName(){
      return name;
    }
}
