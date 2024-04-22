/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface;

import BussinessLogic.Account;
import BussinessLogic.AccountingMovement;
import BussinessLogic.BalanceType;
import BussinessLogic.Category;
import BussinessLogic.CreditAccount;
import BussinessLogic.DebitAccount;
import SubSystems.Facade;
import Utilities.Console;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Gonza-PC
 */
public class UIConsole {

    private int printMenu() {
        Console.println("----------");
        Console.println("***MENÚ***");
        Console.println("----------");
        
        ArrayList<String> options = new ArrayList<String>();
        
        options.add(">>Salir<<");
        options.add("> Agregar cuenta de crédito");
        options.add("> Agregar cuenta de débito");
        options.add("> Ver todas las cuentas");
        options.add("> Agregar nuevo movimiento");
        options.add("> Crear categoría");        
        options.add("> Mostrar movimientos actuales");


        return Console.menu(options);

    }

    public void showConsole() {
        boolean exit = false;
        do {
            int option = printMenu();
            exit = processOption(option);
        } while(!exit);
    }

    private boolean processOption(int option) {
        boolean exit = false;
        
        int n;
        
        switch(option) {
            case 0: exit = true;
                break;
            case 1: addCreditAccount();
                break;
            case 2: addDebitAccount();
                break;  
            case 3: showAllAccounts();
                break;
            case 4: addNewAccountingMovement();
                break;
            case 5: addNewCategory();
                break;
            case 6: showActualAccountingMovements();
        }
        return exit;
    }

    private void addCreditAccount() {

        String name = Console.read("Indique nombre de la cuenta: ");
        double actualBalance = Console.readDouble("Indique el saldo actual de la cuenta: ");
        int closingDay = Console.readInt("Indique día de cierre de estado de cuentas: ");
        CreditAccount account = new CreditAccount(name,BalanceType.CREDITO,actualBalance,closingDay);
        
        Facade.getInstancia().addCreditAccount(account);
        
        Console.println("Cuenta crédito agregada correctamente.");
    }

    private void addDebitAccount() {
        
        String name = Console.read("Indique nombre de la cuenta: ");
        double actualBalance = Console.readDouble("Indique el saldo actual de la cuenta: ");
        DebitAccount account = new DebitAccount(name,BalanceType.DEBITO,actualBalance);
        
        Facade.getInstancia().addDebitAccount(account);
        
        Console.println("Cuenta crédito agregada correctamente.");
    }
    
    private void showAllAccounts() {
        ArrayList<String> accounts = Facade.getInstancia().showAllAccounts();
        for(String accountDetails : accounts) {
            Console.println(accountDetails);
        }
    }
    
    private void addNewAccountingMovement() {
        double amount = Console.readDouble("Ingrese el importe: ");
        String description = Console.read("Ingrese una descripción: ");
        BalanceType balanceType = setBalanceType();
        Date date = setDate();
        Category category = selectCategory();
        AccountingMovement mov = new AccountingMovement(amount, description, balanceType, category, date);
        Account account = selectAccount();
        Facade.getInstancia().addNewAccountingMovementTo(account,mov);
    }
    
    private void addNewCategory() {
        String name = Console.read("Ingrese el nombre de la nueva categoría: ");
        Category category = new Category(name);
        Facade.getInstancia().addNewCategory(category);
    }
    
    private void showActualAccountingMovements() {
        Account account = selectAccount();
        ArrayList<String> dataDetails = Facade.getInstancia().showActualAccountingMovementsFrom(account);
        for(String data : dataDetails) {
            Console.println(data);
        }
    }
    
    private Date setDate() {
        Console.println("Ingrese la fecha =>");
        int day = Console.readInt("Día: ");
        int month = Console.readInt("Mes: ");
        int year = Console.readInt("Año: ");
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return new Date(calendar.getTimeInMillis());
    }
    
    private BalanceType setBalanceType() {
        BalanceType balanceType = null;
        do{
            String strBalanceType = Console.read("Si es un gasto indique 'C', si es un ingreso indique 'D': ");
            if("C".equalsIgnoreCase(strBalanceType)) {
                balanceType = BalanceType.CREDITO;
            } else if("D".equalsIgnoreCase(strBalanceType)) {
                balanceType = BalanceType.DEBITO;
            } 
            
            if(balanceType == null) {
                Console.println("El dato ingresado no es correcto, por favor corrobore...");
            }
        } while(balanceType == null);
        return balanceType;
    }
    
    private ArrayList<Account> getAllAccounts() {
        return Facade.getInstancia().getAllAccounts();
    }
    
    private Account getAccount(int i) {
        return Facade.getInstancia().getAccount(i);
    }
    
    private Category getCategory(int i) {
        return Facade.getInstancia().getCategory(i);
    }

    private ArrayList getAllCategories() {
        return Facade.getInstancia().getAllCategories();
    }
    
    private Account selectAccount() {
        Console.println("Seleccione una cuenta: ");
        int optionAccount = Console.menu(getAllAccounts());
        return getAccount(optionAccount);
    }
    
    private Category selectCategory() {
        Console.println("Seleccione una categoría: ");
        int optionCategory = Console.menu(getAllCategories());
        return getCategory(optionCategory);
    }
}
