/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vvallet;

import BussinessLogic.BalanceType;
import BussinessLogic.Category;
import BussinessLogic.CreditAccount;
import BussinessLogic.DebitAccount;
import SubSystems.Facade;

/**
 *
 * @author Gonza-PC
 */
public class InitialData {
    public static void addInitialData() {
        Category category = new Category("Supermercados");
        Facade.getInstancia().addNewCategory(category);

        Category category1 = new Category("Farmacia");
        Facade.getInstancia().addNewCategory(category1);

        Category category2 = new Category("Delivery");
        Facade.getInstancia().addNewCategory(category2);

        Category category3 = new Category("Facturas");
        Facade.getInstancia().addNewCategory(category);

        Category category4 = new Category("Educación");
        Facade.getInstancia().addNewCategory(category4);

        Category category5 = new Category("Salidas");
        Facade.getInstancia().addNewCategory(category5);

        CreditAccount creditAccount = new CreditAccount("OCA Card",BalanceType.CREDITO,0,4);
        Facade.getInstancia().addCreditAccount(creditAccount);
        
        DebitAccount debitAccount = new DebitAccount("Santander VISA",BalanceType.DEBITO,1000);
        Facade.getInstancia().addDebitAccount(debitAccount);
    }
}
