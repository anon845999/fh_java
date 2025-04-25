import objektorientierungw3schools.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Customer custom1 = new Customer(2200,"Daniel");
        Customer custom2 = new Customer(2100,"Sebastian");
        Customer custom3 = new Customer(2200,"Florian");
        Customer custom4 = new Customer(2100,"Sophie");
        Customer custom5 = new Customer(2200,"Dimchi");
        Customer custom6 = new Customer(2100,"Marvin");


        Account acc1 = AccountFactory.createAccount(custom1);
        Account acc2 = AccountFactory.createAccount(custom1);
        Account acc3 = AccountFactory.createAccount(custom2);
        Account acc4 = AccountFactory.createAccount(custom2);
        Account acc5 = AccountFactory.createAccount(custom2);
        Account acc6 = AccountFactory.createAccount(custom1);


        Bank bank = new Bank();

        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);
        bank.addAccount(acc4);
        bank.addAccount(acc5);



        acc1.depositMoney(23232);
        acc2.depositMoney(8);

        ArrayList<Account> liste = bank.getAccountsPerCustomer(custom1);
        for (Account acc : liste) {
            System.out.println(acc.getBalancePerAccount());
        }
        bank.removeAccount(acc1);

        liste = bank.getAccountsPerCustomer(custom1);

        for (Account acc : liste) {
            System.out.println(acc.getBalancePerAccount());
        }

        ArrayList<Account> liste2 = bank.getAccountsPerCustomer(custom2);
        for (Account acc : liste2) {
            System.out.println(acc.getBalancePerAccount());
        }



    }
}