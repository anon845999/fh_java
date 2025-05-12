package objektorientierungw3schools;

public class AccountFactory {

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract("null -> fail")
    public static Account createAccount(Customer customer) {
        if(customer == null){
            throw new IllegalArgumentException("Customer cannot be null");
        }
        Account account = new Account(customer);
        account.depositMoney(100);
        return account;
    }
}
