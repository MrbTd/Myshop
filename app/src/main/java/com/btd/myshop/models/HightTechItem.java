package com.btd.myshop.models;

public class HightTechItem {
    private String name;
    private String mnemonic;
    private double price;

    public HightTechItem(String name,String mnemonic, double price){
        this.name=name;
        this.mnemonic=mnemonic;
        this.price=price;

    }

    public String getName(){return name;}

    public String getMnemonic(){return mnemonic;}


    public double getPrice(){return price;}
}
