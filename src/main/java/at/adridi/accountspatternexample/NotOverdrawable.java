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
public class NotOverdrawable implements Overdraw {

    @Override
    public String overdrawAccount(Integer amount, Integer balance) {
        if (amount > balance) {
            return "Account cannot be overdrawn!";
        } else {
            return "You have withdrawn an amount of " + amount + ". Your balance: " + (balance - amount);
        }
    }

}
