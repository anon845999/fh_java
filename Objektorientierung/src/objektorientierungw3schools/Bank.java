package objektorientierungw3schools;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Bank {

    ArrayList<Account> accounts;
    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account a) {
        if(!this.accounts.contains(a)) {
            this.accounts.add(a);
        }

    }
    public void removeAccount(Account a) {
        if(accounts.contains(a)) {
            this.accounts.remove(a);
        }

    }


    public ArrayList<Account> getAccountsPerCustomer(Customer customer) {
      if(customer != null){
          ArrayList<Account> result = this.accounts.stream()
                  .filter(account -> account.getCustomer().equals(customer))
                  .collect(Collectors.toCollection(ArrayList::new));

          return result;
      }
      return null;

    }



}
