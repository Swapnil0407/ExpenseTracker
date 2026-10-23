package com.swapnil;

import java.time.LocalDate;

import com.swapnil.model.Expense;

public class App 
{
    public static void main( String[] args )
    {
        //Model Expense.class Object
        Expense expenseObj = new Expense(
            "1",
            "Nasta",
            30.0,
            "Food",
            LocalDate.of(2026, 10, 20),
            "Online"
        );
        System.out.println("Expense ID: " + expenseObj.getId());
        System.out.println("Title: " + expenseObj.getTitle());
        System.out.println("Amount: " + expenseObj.getAmount());
        System.out.println("Category: " + expenseObj.getCategory());
        System.out.println("Date: " + expenseObj.getDate());
        System.out.println("Payment: " + expenseObj.getPaymentMethod());
    }
}
