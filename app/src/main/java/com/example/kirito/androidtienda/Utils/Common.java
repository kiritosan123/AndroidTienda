package com.example.kirito.androidtienda.Utils;

import com.example.kirito.androidtienda.Retrofit.IDrinkShopAPI;
import com.example.kirito.androidtienda.Retrofit.RetrofitClient;

public class Common {

    // En el emulador el localhost es 10.0.2.2.
    private static final String BASE_URL = "http://10.0.3.2/drinkshop/";

    public static IDrinkShopAPI getAPI(){
        return RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
    }
}
