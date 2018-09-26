package com.example.kirito.androidtienda.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kirito.androidtienda.DrinkActivity;
import com.example.kirito.androidtienda.Interface.IItemClickListener;
import com.example.kirito.androidtienda.Model.Category;
import com.example.kirito.androidtienda.R;
import com.example.kirito.androidtienda.Utils.Common;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder>{

    Context context;
    List<Category> categories;

    public CategoryAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.menu_item_layout, null);
        return new CategoryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, final int position) {
        //Cargamos las imagees con la ayuda de Picassa
        Picasso.with(context)
                .load(categories.get(position).Link)
                .into(holder.img_product);
        holder.txt_menu_name.setText(categories.get(position).Name);

        //Evento para la lista de imagenes
        holder.setItemClickListener(new IItemClickListener() {
            @Override
            public void onClick(View v) {
                Common.currentCategory = categories.get(position);

                //Iniciamos la nueva Actividad
                context.startActivity(new Intent(context, DrinkActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
