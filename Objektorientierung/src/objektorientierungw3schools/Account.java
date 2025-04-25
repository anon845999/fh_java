package objektorientierungw3schools;

import java.util.Objects;

public class Account {

    private Customer customer;
    private long balance;


    public Account(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public long getBalancePerAccount() {
        return balance;
    }
    public void depositMoney(long amount) {
        balance += amount;
    }
    public void withdrawMoney(long amount) {
        balance -= amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balance == account.balance && Objects.equals(customer, account.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, balance);
    }
}
