package com.swapnil.model;

import java.time.LocalDate;

public class Expense {
    //unique expense id
    private String id;
    //Expense description
    private String title;
    //Expense amount;
    private double amount;
    //Food travel category
    private String category;
    //date os expense
    private LocalDate date;
    //Cash UPI Card
    private String paymentMethod; 

    public Expense(String id,String title,double amount,String category,LocalDate date,String paymentMethod){
        this.id = id;
        this.title = title;
        this.amount  = amount;
        this.category = category;
        this.date = date;
        this.paymentMethod = paymentMethod;
    }

    //getter methods
    public String getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public double getAmount(){
        return this.amount;
    }
    public String getCategory(){
        return this.category;
    }
    public LocalDate getDate(){
        return  this.date;
    }
    public String getPaymentMethod(){
        return this.paymentMethod;
    }

    //setter methods
    public void setId(String id){
        this.id;
    }
    public void setTitle(String title){
        this.title;
    }
    public void setAmount(double amount){
        this.amount;
    }
    public void setCategory(String category){
        this.category;
    }
    public void setDate(LocalDate date){
        this.date;
    }
    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod;
    }
}
