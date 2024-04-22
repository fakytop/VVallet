/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubSystems;

import BussinessLogic.Category;
import java.util.ArrayList;

/**
 *
 * @author Gonza-PC
 */
public class CategoryControl {
    private ArrayList<Category> cCategories;
    
    public CategoryControl() {
        this.cCategories = new ArrayList<Category>();
    }

    public ArrayList<Category> getcCategories() {
        return cCategories;
    }

    public void addNewCategory(Category category) {
        cCategories.add(category);
    }
    
    
}


