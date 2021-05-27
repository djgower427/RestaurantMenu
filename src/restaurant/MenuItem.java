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

    public void setName(String aName){
        this.name = aName;
    }

    public void setPrice(double aPrice){
        this.price = aPrice;
    }

    public void setDescription(String aDescription){
        this.description = aDescription;
    }

    public void setCategory(String aCategory){
        this.category = aCategory;
    }

    public void setDateAdded(Date aDateAdded){
        this.dateAdded = aDateAdded;
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

    public String toString(){
        return name + "\n" + description + "\n" + price;
    }
}
