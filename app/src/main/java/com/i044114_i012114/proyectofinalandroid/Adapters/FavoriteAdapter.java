package com.i044114_i012114.proyectofinalandroid.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.i044114_i012114.proyectofinalandroid.Models.Favorite;
import com.i044114_i012114.proyectofinalandroid.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by equipo14 on 27/11/17.
 */

public class FavoriteAdapter extends  RecyclerView.Adapter<FavoriteAdapter.ViewHolder> {

    List<Favorite> favoriteList = new ArrayList<>();
    Context context;

    public FavoriteAdapter(List<Favorite> favoriteList, Context context) {
        this.favoriteList = favoriteList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favorite, parent, false);
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        //holder.textViewid_fav.setText(Integer.toString(favoriteList.get(position).getId_fav()));
        //holder.textViewid_user.setText(Integer.toString(favoriteList.get(position).getId_user()));
        //holder.textViewid_prod.setText(Integer.toString(favoriteList.get(position).getId_prod()));
        //Picasso.with(context).load(contactList.get(position).getUrl()).into(holder.imageView);

        holder.textViewid_fav.setText(favoriteList.get(position).getName());
        holder.textViewid_prod.setText(favoriteList.get(position).getCantidad());
        Picasso.with(context).load(favoriteList.get(position).getUrl()).into(holder.imageView_url);


    }

    @Override
    public int getItemCount() {
        return favoriteList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewid_fav;
        TextView textViewid_prod;
        TextView textViewid_user;
        ImageView imageView_url;


        public ViewHolder(View item) {
            super(item);

            textViewid_fav = (TextView) item.findViewById(R.id.id_tv_item_name_fav);
            textViewid_prod = (TextView) item.findViewById(R.id.id_tv_item_des_fav);
            textViewid_user = (TextView) item.findViewById(R.id.id_tv_item_can_fav);
            imageView_url =(ImageView) item.findViewById(R.id.id_img_item_cardview_fav);

        }
    }
}
