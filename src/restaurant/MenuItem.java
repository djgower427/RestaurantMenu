package restaurant;

import java.util.Date;

public class MenuItem {
    protected String name;
    protected double price;
    protected String description;
    protected String category;
    protected boolean isNew;
    private Date dateAdded;

    public MenuItem(String name, double price, String description, String category){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
        this.dateAdded = new Date();
    }

    //Setters below

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setDateAdded(Date dateAdded){
        this.dateAdded = dateAdded;
    }

    //Getters below

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getDescription(){
        return  description;
    }

    public String getCategory(){
        return category;
    }

    public Date getDateAdded(){
        return dateAdded;
    }

    //Method to concatenate text strings

    public String concatenate(){
        return name + "\n" + description + "\n" + price;
    }
}
