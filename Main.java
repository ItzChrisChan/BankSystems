
public class Main {
    public static void main(String[] args) {
       // Bank bank = new Bank();


        SavingsAccount sa = new SavingsAccount(1000, "Sa");
        CurrentAccount ca = new CurrentAccount(-500, "Ca");

        System.out.println("Names of Accounts: " + Bank.printToString());
    }
}
