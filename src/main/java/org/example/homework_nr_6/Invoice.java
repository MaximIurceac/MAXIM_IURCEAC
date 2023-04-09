package org.example.homework_nr_6;

public class Invoice {
    String model;
    String description;
    int quantity;
    double price;

    public Invoice(String model, String description, int quantity, double price){
        this.model = model;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if( quantity > 0 ) {
            this.quantity = quantity;
        }else{
            this.quantity = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if( price > 0.0) {
            this.price = price;
        }else{
            this.price = 0.0;
        }
    }

    public double getAmount(){
        return quantity * price;

    }
    public static void main(String[] args){
        Invoice laptop = new Invoice("Aspire", "black", 2, 299 );
        System.out.println(laptop.getAmount());


    }
}

