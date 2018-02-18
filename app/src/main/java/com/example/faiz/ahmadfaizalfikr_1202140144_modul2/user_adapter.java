package com.example.faiz.ahmadfaizalfikr_1202140144_modul2;

/**
 * Created by Faiz on 2/18/2018.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by putuguna on 22/11/16.
 */

public class user_adapter extends RecyclerView.Adapter<user_adapter.ViewHolder>{

    private List<user_model> mListUser;
    private Context mContexl;

    public user_adapter(List<user_model> mListUser, Context mContexl) {
        this.mListUser = mListUser;
        this.mContexl = mContexl;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_makanan,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //get the user by its position
        user_model user = mListUser.get(position);

        holder.tvUserName.setText("Name : " + user.getName() +"\n" +
                "Harga : " + user.getHarga());
    }

    @Override
    public int getItemCount() {
        return mListUser.size();
    }

    /**
     * inner class
     * here we define all of attribute item in our layout
     */
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvUserName;

        public ViewHolder(View itemView) {
            super(itemView);
            tvUserName = (TextView) itemView.findViewById(R.id.text_view_user_name);
        }
    }
}
