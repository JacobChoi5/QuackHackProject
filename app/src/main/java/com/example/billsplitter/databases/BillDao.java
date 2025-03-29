package com.example.billsplitter.databases;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.billsplitter.entities.Bill;

import java.util.List;

@Dao
public abstract class BillDao {
    @Query("SELECT * FROM bill")
    public abstract LiveData<List<Bill>> fetchAllBills();
}
