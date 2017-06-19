

package com.mybank.domain;

/**
 *
 * @author student
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account account;

    Account accounts[];
    int numberOfAccounts;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
        accounts = new Account[10];
        numberOfAccounts = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    /*public void setAccount(Account acct) {
        account = acct;
    }  */

    public void addAccount(Account acc) {
        int i = numberOfAccounts++;
        accounts[i] = acc;
    }

    public Account getAccount(int a) {
        return accounts[a];
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }
}
