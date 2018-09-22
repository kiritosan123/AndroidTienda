package com.example.kirito.androidtienda.Utils;

import com.example.kirito.androidtienda.Model.User;
import com.example.kirito.androidtienda.Retrofit.IDrinkShopAPI;
import com.example.kirito.androidtienda.Retrofit.RetrofitClient;

public class Common {

    // En el emulador de Genymotion el localhost es 10.0.3.2 .
    private static final String BASE_URL = "http://10.0.3.2/drinkshop/";

    public static User currentUser =null;

    public static IDrinkShopAPI getAPI(){
        return RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
    }
}
