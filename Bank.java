import java.util.ArrayList;

class Bank {
    static ArrayList<Account> listOfAccounts = new ArrayList<>();

    public static void addAccount(Account account) {
        listOfAccounts.add(account);
    }

    public static void deleteAccount(Account account) {
        listOfAccounts.remove(account);
    }

    public static double calculateTotalBalance() {
        double total = 0;
        for(Account account : listOfAccounts) {
            total += account.getBalance();
        }
        return total;
    }

    public static String printToString() { // Chris will fix
        String allAccounts = "";
        for(int i = 0; i < listOfAccounts.size(); i++){
            Account account =  listOfAccounts.get(i);
            allAccounts += account.getName() + "," ;

        }
        allAccounts += "\nTotal account balances: " + calculateTotalBalance();

        return allAccounts;
    }


}