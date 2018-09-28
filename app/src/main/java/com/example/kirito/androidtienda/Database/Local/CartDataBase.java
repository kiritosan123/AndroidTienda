package com.example.kirito.androidtienda.Database.Local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.kirito.androidtienda.Database.ModelDB.Cart;

@Database(entities = {Cart.class}, version = 1)
public abstract class CartDataBase extends RoomDatabase{

    public abstract CartDAO cartDAO();
    private static CartDataBase instance;

    public static CartDataBase getInstance(Context context){
        if (instance == null)
            instance = Room.databaseBuilder(context, CartDataBase.class, "VIDDA_DrinkShopDB")
                    .allowMainThreadQueries()
                    .build();
        return instance;
    }
}
