/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Angela.Kuznetsova
 */
public class Account {
    private double balance;

    public Account(double bal) {
        if(bal>0)
            this.balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void credit(double amount){
        double newBalance = amount+getBalance();
        setBalance(newBalance);
        getBalance();
    }
    
    public void debit(double amount){
        double newBal=0.0;
        if (amount<getBalance()){
            newBal = getBalance()-amount;
            setBalance(newBal);
            getBalance();
        }
            else
                System.out.println("Error. Please, enter correct amount");
    }
    
}
