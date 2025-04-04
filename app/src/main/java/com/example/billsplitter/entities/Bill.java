package com.example.billsplitter.entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity=User.class, onDelete = ForeignKey.CASCADE, parentColumns="userId", childColumns = "purchaserId"), indices = @Index(value="billId", unique = true))
public class Bill {
    @PrimaryKey(autoGenerate = true)
    public int billId;
    public int purchaserId;
    public String name;
    public double subtotal;
    public double tax;
    public double tip;
    public double total;
    public boolean taxEven;
    public boolean tipEven;
    public Bill(){

    }

    public Bill(int purchaserId, String name, double subtotal, double tax, double tip){
        this.purchaserId = purchaserId;
        this.name = name;
        this.subtotal = subtotal;
        this.tax = tax;
        this.tip = tip;
        total = subtotal + tax + tip;
    }

    public String toString(){
        return name;
    }
}
