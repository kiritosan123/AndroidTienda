package com.example.kirito.androidtienda.Utils;

import com.example.kirito.androidtienda.Database.DataSource.CartRepository;
import com.example.kirito.androidtienda.Database.Local.CartDataBase;
import com.example.kirito.androidtienda.Model.Category;
import com.example.kirito.androidtienda.Model.Drink;
import com.example.kirito.androidtienda.Model.User;
import com.example.kirito.androidtienda.Retrofit.IDrinkShopAPI;
import com.example.kirito.androidtienda.Retrofit.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

public class Common {

    // En el emulador de Genymotion el localhost es 10.0.3.2 .
    private static final String BASE_URL = "http://10.0.3.2/drinkshop/";

    public static  final String TOPPING_MENU_ID = "7";

    public static User currentUser = null;
    public static Category currentCategory = null;

    public static List<Drink> toppingList = new ArrayList<>();

    public static double toppingPrice = 0.0;
    public static List<String> toppingAdded = new ArrayList<>();

    //Mantener el campo (hold field)
    public static int sizeOfCup = -1; //-1: no selecciono(error), 0=M, 1=L
    public static int sugar = -1; //-1: no selecciono(error)
    public static int ice = -1; // -1: no selecciono(error)

    //DataBase
    public static CartDataBase cartDataBase;
    public static CartRepository cartRepository;

    public static IDrinkShopAPI getAPI(){
        return RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
    }
}
