package org.launchcode.java.studios.restaurant;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {
    private int itemId;
    private String itemName;
    private String itemDescription;
    private Date itemCreated;
    public static int nextId = 1;
    public Date currentDate;


    public MenuItem (String itemName, String itemDescription, ) {
        this();
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public MenuItem() {
        itemId = nextId;
        nextId++;
    }

    public int getItemId() {
        return itemId;
    }
    public int setItemId(int itemId) {
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

    public String getCurrentDate() {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(currentDate);
    }
}


