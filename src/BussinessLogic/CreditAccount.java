/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BussinessLogic;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Gonza-PC
 */
public class CreditAccount extends Account {
    private int closingDay;

    public CreditAccount(String name, BalanceType balanceType, double actualBalance, int closingDay) {
        super(name, balanceType, actualBalance);
        this.closingDay = closingDay;
    }

    @Override
    public void creditActualBalance(double amount) {
        double actualBalance = super.getActualBalance() + amount;
        super.setActualBalance(actualBalance);
    }
    
    @Override
    public void debitActualBalance(double amount) {
        double actualBalance = super.getActualBalance() - amount;
        super.setActualBalance(actualBalance);
    }

    @Override
    public String toString() {
        return "Cuenta Crédito {" 
                + "Nombre: " + super.getName() + ", " 
                + "Tipo de cuenta: " + super.getBalanceType() + ", "
                + "Fecha de cierre: " + closingDay + ", "
                + "Saldo Actual: " + super.getActualBalance()
                + '}';
    }
    
}
