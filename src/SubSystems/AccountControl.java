/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubSystems;

import BussinessLogic.Account;
import BussinessLogic.AccountingMovement;
import BussinessLogic.BalanceType;
import BussinessLogic.CreditAccount;
import BussinessLogic.DebitAccount;
import java.util.ArrayList;

/**
 *
 * @author Gonza-PC
 */
public class AccountControl {
    private ArrayList<Account> accountControl;

    public AccountControl() {
        accountControl = new ArrayList<Account>();
    }
    
    public void addCreditAccount(CreditAccount creditAccount) {
        accountControl.add(creditAccount);
    }
    
    public void addDebitAccount(DebitAccount debitAccount) {
        accountControl.add(debitAccount);
    }
    
    public ArrayList<String> showAllAccounts(){
        ArrayList<String> accounts = new ArrayList<String>();
        for(Account account: accountControl) {
            accounts.add(account.toString());
        }
        return accounts;
    }

    public ArrayList<Account> getAccountControl() {
        return accountControl;
    }

    void addNewAccountingMovementTo(Account account, AccountingMovement mov) {
        account.addAccountingMovement(mov);
    }

    ArrayList<String> showActualAccountingMovementsFrom(Account account) {
        ArrayList<String> movs = new ArrayList<String>();
        for(AccountingMovement mov : account.getAccountingMovements()) {
            movs.add(mov.toString());
        }
        return movs;
    }
}
