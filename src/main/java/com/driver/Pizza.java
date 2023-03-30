package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;
    boolean isExtraCheese;
    boolean isExtraTopping;
    boolean isBill;
    boolean bag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else{
            this.price = 400;
            this.toppings = 120;
        }
        this.bill = "Base Price Of The Pizza: "+ this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!isExtraCheese){
            this.price += 80;
            isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraTopping){
            this.price += this.toppings;
            isExtraTopping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!bag){
            this.price += 20;
            bag = true;
        }
    }

    public String getBill() {
        // your code goes here
        if (!isBill){
            if (isExtraCheese) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (isExtraTopping) {
                this.bill += "Extra Topping Added: 20" + "\n";
            }
            if (bag) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price" + this.price + "\n";
            this.isBill = true;
            return this.bill;
        }
        return this.bill;
    }
}
