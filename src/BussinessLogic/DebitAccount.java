/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BussinessLogic;

import java.util.ArrayList;

/**
 *
 * @author Gonza-PC
 */
public class DebitAccount extends Account {
    
    public DebitAccount(String name, BalanceType balanceType, double actualBalance) {
        super(name, balanceType, actualBalance);
    }
    
    @Override
    public void creditActualBalance(double amount) {
        double actualBalance = super.getActualBalance() - amount;
        super.setActualBalance(actualBalance);
    }
    
    @Override
    public void debitActualBalance(double amount) {
        double actualBalance = super.getActualBalance() + amount;
        super.setActualBalance(actualBalance);
    }

    
    @Override
    public String toString() {
        return "Cuenta Débito {"
                + "Nombre: " + super.getName() + ", " 
                + "Tipo de cuenta: " + super.getBalanceType() + ", "
                + "Saldo actual: " + super.getActualBalance()
                + '}';
    }
    
    
    
}
