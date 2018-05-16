package com.example.sawepeter.androideatit.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SAWE PETER on 5/17/2018.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView txtMenuName;
    public ImageView imageview;
    
    public MenuViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void onClick(View v) {

    }
}
