/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.adridi.accountspatternexample;

/**
 *
 * @author A.Dridi
 */
public class Account {

    protected  Integer accountId;
    protected String accountType;
    protected Integer balance;
    public Overdraw overdrawAbility;

    public Account() {
        
    }

    public Account(Integer accountId, String accountType, Integer balance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.balance = balance;
    }
    
    public String doOverdraw(Integer amount, Integer currentBalance) {
        return this.overdrawAbility.overdrawAccount(amount, currentBalance);
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Overdraw getOverdrawAbility() {
        return overdrawAbility;
    }

    public void setOverdrawAbility(Overdraw overdrawAbility) {
        this.overdrawAbility = overdrawAbility;
    }
    
    
}
