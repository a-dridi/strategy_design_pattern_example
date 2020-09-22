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
public class Overdrawable implements Overdraw{

    @Override
    public String overdrawAccount(Integer amount, Integer balance) {
        return "Now. You have overdrawn an amount of " + amount + ". Your balance: " + (balance - amount);
    }
    
}
