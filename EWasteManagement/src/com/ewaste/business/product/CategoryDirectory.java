/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.product;

import java.util.ArrayList;

/**
 *
 * @author Harshad 0509
 */
public class CategoryDirectory {
    public static CategoryDirectory categoryDirectory;
    
    
    private ArrayList<Category> categories;

    private CategoryDirectory() {
         categories = new ArrayList<>();
    }
    
    public static CategoryDirectory getCategoryDirectory(){
        if(categoryDirectory == null){
            categoryDirectory = new CategoryDirectory();
        }
        return categoryDirectory;
    }
    
    public Category addCategory(String categoryName, String categoryDescription, String categoryType){
        for(Category c : categories){
            if(c.getCategoryName().equalsIgnoreCase(categoryName)){
                return c;
            }
        }
        return addNewCategory(categoryName, categoryDescription, categoryType);
    }

    private Category addNewCategory(String categoryName, String categoryDescription, String categoryType){
        Category category =new Category();
        category.setCategoryName(categoryName);
        category.setCategoryDescription(categoryDescription);
        category.setCategoryType(categoryType);
        categoryDirectory.getCategories().add(category);
        return category;
    }
    
    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
}
