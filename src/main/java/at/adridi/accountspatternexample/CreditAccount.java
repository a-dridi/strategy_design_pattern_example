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
public class CreditAccount extends Account {

    public CreditAccount(Integer accountId, Integer balance) {
        super(accountId, "Credit Account", balance);
        super.overdrawAbility = new Overdrawable();
    }

    public String changeInterests(double interest) {
        if (interest < 0.01) {
            return "Interest value must be bigger than 0.01";
        }
        if (interest < 2.5) {
            return "Interest changed to the value: " + interest;
        } else {
            return "Max. interest value for your account type is " + interest + ". Interest value where changed to this max. values.";
        }
    }
}
