package com.example.darius.praxismanager.logic.objects;

public class treatment {

    private final int id;
    private final String idNumber;
    private final String name;
    private final String description;
    private final double price;
    private final double factor;

    public treatment(int id, String idNumber, String name, String description, double price, double factor) {
        this.id = id;
        this.idNumber = idNumber;
        this.name = name;
        this.description = description;
        this.price = price;
        this.factor = factor;
    }
    public int getId() {
        return id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getFactor() {
        return factor;
    }
}
