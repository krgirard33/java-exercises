package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastModified;
    private ArrayList<MenuItem> items;
    private String category;

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }


}
