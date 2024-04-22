/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BussinessLogic;

/**
 *
 * @author Gonza-PC
 */
public class Category {
    private String nombre;    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Category(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Categoría {Nombre: " + this.getNombre() + "}";
    }

    @Override
    public boolean equals(Object obj) {
        Category category = (Category) obj;
        return this.getNombre().equalsIgnoreCase(category.getNombre());
    }
    
    
    
    
}
