package oop.labor03.lab3_2;

public class Customer {
    public static final int MAX_ACCOUNTS = 10;
    private final String firstName;
    private String lastName;
    private BankAccount[] accounts = new BankAccount[10];
    private int numAccounts;

    public Customer(String pFirstName, String pLastName) {
        firstName = pFirstName;
        lastName = pLastName;
    }

    public void addAccount(BankAccount pbankAccount) {
        if (numAccounts == MAX_ACCOUNTS) {
            System.out.println("nem lehet hozzaadni mert tul sok szamla van");
            return;
        }
        accounts[numAccounts++] = pbankAccount;
    }

    public BankAccount getAccount(String accountnumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountnumber))
                return accounts[i];
        }
        return null;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void deleteAccount(String accountnumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountnumber)) {
                accounts[i] = accounts[numAccounts - 1];
                numAccounts--;
                break;
            }
        }

    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for (int i = 0; i < numAccounts; ++i) {
            result.append("\t" + accounts[i] + "\n");
        }
        return result.toString();
    }
}
