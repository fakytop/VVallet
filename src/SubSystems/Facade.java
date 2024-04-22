/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubSystems;

import BussinessLogic.Account;
import BussinessLogic.AccountingMovement;
import BussinessLogic.Category;
import BussinessLogic.CreditAccount;
import BussinessLogic.DebitAccount;
import java.util.ArrayList;

/**
 *
 * @author Gonza-PC
 */
public class Facade {
    private static Facade instancia;
    private AccountControl accountControl;
    private CategoryControl categoryControl;
    
    public static Facade getInstancia() {
        if(instancia == null) {
            instancia = new Facade();
        }
        return instancia;
    }

    public AccountControl getAccountControl() {
        return accountControl;
    }

    public void setAccountControl(AccountControl accountControl) {
        this.accountControl = accountControl;
    }

    public CategoryControl getCategoryControl() {
        return categoryControl;
    }

    public void setCategoryControl(CategoryControl categoryControl) {
        this.categoryControl = categoryControl;
    }
    
    public Facade() {
        accountControl = new AccountControl();
        categoryControl = new CategoryControl();
    }
    
    public void addCreditAccount(CreditAccount account) {
        this.getAccountControl().addCreditAccount(account);
    }
    
    public void addDebitAccount(DebitAccount account) {
        this.getAccountControl().addDebitAccount(account);
    }
    
    public ArrayList<Account> getAllAccounts() {
        return this.getAccountControl().getAccountControl();
    }
    
    public Account getAccount(int i) {
        return this.getAccountControl().getAccountControl().get(i);
    }
    
    public ArrayList<String> showAllAccounts() {
        return this.getAccountControl().showAllAccounts();
    }

    public ArrayList<Category> getAllCategories() {
        return this.getCategoryControl().getcCategories();
    }
    
    public Category getCategory(int i) {
        return this.getCategoryControl().getcCategories().get(i);
    }

    public void addNewCategory(Category category) {
        this.getCategoryControl().addNewCategory(category);
    }

    public void addNewAccountingMovementTo(Account account, AccountingMovement mov) {
        this.getAccountControl().addNewAccountingMovementTo(account,mov);
    }

    public ArrayList<String> showActualAccountingMovementsFrom(Account account) {
        return this.getAccountControl().showActualAccountingMovementsFrom(account);
    }
}
