package restaurant;

import java.util.Date;
import java.util.Arrays;
import java.util.ArrayList;

public class Menu {
    private Date lastUpdate;

    private ArrayList<String> categories = new ArrayList<>(
            Arrays.asList("Appetizer", "Main Course", "Dessert")
    );

    private ArrayList<MenuItem> items;

    public Menu(ArrayList<MenuItem> items){
        this.items = items;
        this.lastUpdate = new Date();
    }

    //Getters below

    public ArrayList<MenuItem> getItems(){
        return items;
    }

    public ArrayList<String> getCategories(){
        return categories;
    }

    public Date getLastUpdate(){
        return lastUpdate;
    }

    //Method to add menu item below

    public void addMenuItem(MenuItem item) {
        this.items.add(item);
    }

    //Method to delete menu item below

    public void removeMenuItem(MenuItem item){
        this.items.remove(item);
    }

    //Method to print menu items below

    public void printMenu(){
        System.out.println("Menu:");
        for (MenuItem menuItem : items){
            System.out.println(menuItem.toString() + "\n");
        }
    }
}
