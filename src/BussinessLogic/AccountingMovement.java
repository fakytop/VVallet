/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BussinessLogic;

import java.util.Date;

/**
 *
 * @author Gonza-PC
 */
public class AccountingMovement {
    private double amount;
    private String description;
    private BalanceType balanceType;
    private Category category;
    private Date balanceMovementDate;

    public AccountingMovement(double amount, String description, BalanceType balanceType, Category category, Date balanceMovementDate) {
        this.amount = amount;
        this.description = description;
        this.balanceType = balanceType;
        this.category = category;
        this.balanceMovementDate = balanceMovementDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BalanceType getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(BalanceType balanceType) {
        this.balanceType = balanceType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getBalanceMovementDate() {
        return balanceMovementDate;
    }

    public void setBalanceMovementDate(Date balanceMovementDate) {
        this.balanceMovementDate = balanceMovementDate;
    }

    @Override
    public String toString() {
        return "Movimientos Contables {" 
                + "Tipo de Mov.: " + balanceType 
                + ", Fecha: " + balanceMovementDate 
                + ", Detalle: " + description 
                + ", Categoría: " + category.toString()
                + ", Saldo: " + amount 
                + '}';
    }


}
