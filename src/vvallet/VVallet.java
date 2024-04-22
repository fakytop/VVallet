/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vvallet;

import UserInterface.UIConsole;

/**
 *
 * @author Gonza-PC
 */
public class VVallet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UIConsole console = new UIConsole();
        InitialData.addInitialData();
        console.showConsole();
    }
    
}
