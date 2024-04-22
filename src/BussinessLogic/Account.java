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
public abstract class Account {
    private String name;
    private BalanceType balanceType;
    private ArrayList<AccountingMovement> accountingMovements;
    private ArrayList<ArrayList<AccountingMovement>> monthlyHistoric;
    private double actualBalance;

    public Account(String name, BalanceType balanceType, double actualBalance) {
        this.name = name;
        this.balanceType = balanceType;
        this.actualBalance = actualBalance;
        this.accountingMovements = new ArrayList<AccountingMovement>();
        this.monthlyHistoric = new ArrayList<ArrayList<AccountingMovement>>();
    }
    
    public void addAccountingMovement(AccountingMovement mov) {
        if(getAccountingMovements() == null) {
            setAccountingMovements(new ArrayList<AccountingMovement>());
        }
        getAccountingMovements().add(mov);
        if(BalanceType.CREDITO == mov.getBalanceType()){
            creditActualBalance(mov.getAmount());
        } else {
            debitActualBalance(mov.getAmount());
        }
    }
    
    public void creditActualBalance(double mov) {
        
    }
    
    public void debitActualBalance(double mov) {
        
    }
    
    public void performMonthlyClosing() {
        if(monthlyHistoric == null) {
            monthlyHistoric = new ArrayList<ArrayList<AccountingMovement>>();
        }
        monthlyHistoric.add(accountingMovements);
        setAccountingMovements(new ArrayList<AccountingMovement>());
    }

    @Override
    public boolean equals(Object obj) {
        Account account = (Account) obj;
        return account.getName().equals(this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BalanceType getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(BalanceType balanceType) {
        this.balanceType = balanceType;
    }

    public ArrayList<AccountingMovement> getAccountingMovements() {
        return accountingMovements;
    }

    public void setAccountingMovements(ArrayList<AccountingMovement> accountingMovements) {
        this.accountingMovements = accountingMovements;
    }

    public ArrayList<ArrayList<AccountingMovement>> getMonthlyHistoric() {
        return monthlyHistoric;
    }

    public void setMonthlyHistoric(ArrayList<ArrayList<AccountingMovement>> monthlyHistoric) {
        this.monthlyHistoric = monthlyHistoric;
    }

    public double getActualBalance() {
        return actualBalance;
    }

    public void setActualBalance(double actualBalance) {
        this.actualBalance = actualBalance;
    }
}
