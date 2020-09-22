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
public class AccountPatternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account prepaidAccount = new PrepaidAccount(1, 4944);
        Account creditAccount = new CreditAccount(2, 4303);
        System.out.println("Prepaid-Konto: " + prepaidAccount.doOverdraw(66666, prepaidAccount.getBalance()));
        System.out.println("Kredit-Konto: " + creditAccount.doOverdraw(1500, 200));
        creditAccount.setOverdrawAbility(new NotOverdrawable());
        System.out.println("Kredit-Konto: " + creditAccount.doOverdraw(1500, 200));
    }

}
