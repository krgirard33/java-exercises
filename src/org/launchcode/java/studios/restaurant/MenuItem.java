package org.launchcode.java.studios.restaurant;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {
    private int itemId;
    private String itemName;
    private String itemDescription;
    private String itemCategory;
    private double itemPrice;
    private Date itemCreated;
    private static int nextId = 1;
    private Date modifiedDate;


    public MenuItem (int itemId, String itemName, String itemDescription, String itemCategory, double itemPrice, Date modifiedDate) {
        this();
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemPrice = itemPrice;
        this.modifiedDate = modifiedDate;
    }

    public MenuItem() {
        itemId = itemId;
        itemName = "Fatman Burger";
        itemDescription = "1/2lb burger with onions & green peppers mixed into the burger";
        itemCategory = "Main Course";
        itemPrice = 8.99;
        //modifiedDate = 2018-05-23;
    }

    public void setMenuItem() {
        itemId = nextId;
        nextId++;
        itemName = itemName;
        itemDescription = itemDescription;
        itemCategory = itemCategory;
        itemPrice = itemPrice;
        modifiedDate = new Date();
    }

    public int getItemId() {
        return itemId;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Date getItemCreated() {
        return itemCreated;
    }

    public void setItemCreated(Date itemCreated) {
        this.itemCreated = itemCreated;
    }
    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MenuItem.nextId = nextId;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = new Date();
    }

    public String getModifiedDate() {
        Date modifiedDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(modifiedDate);
    }
}


