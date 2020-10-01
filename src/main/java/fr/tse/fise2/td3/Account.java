package fr.tse.fise2.td3;

public class Account implements Comparable{
    private String identifier;
    private double balance;

    public Account(String identifier, double balance) {
        this.identifier = identifier;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "identifier='" + identifier + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (Double.compare(account.balance, balance) != 0) return false;
        return identifier.equals(account.identifier);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = identifier.hashCode();
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Object o) {
        Account account = (Account)o;

        if(balance < account.getBalance())
            return -1;
        else if(balance > account.getBalance())
            return 1;
        else
            return 0;
    }
}
