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
public class PrepaidAccount extends Account {

    public PrepaidAccount(Integer accountId, Integer balance) {
        super(accountId, "Prepaid Account", balance);
        super.overdrawAbility = new NotOverdrawable();
    }

    public String topUp(Integer value) {
        if (value <= 0) {
            return "Recharge failed. Value must be bigger than 0.";
        }
        if (value < 1000) {
            return "OK. Recharge sucessful. Amount " + value + " was added.";
        } else {
            return "Recharge failed. Max. Recharge value is " + 1000;
        }
    }

}
