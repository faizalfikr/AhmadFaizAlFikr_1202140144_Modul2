package com.example.faiz.ahmadfaizalfikr_1202140144_modul2;


import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Faiz on 2/18/2018.
 */

public class menu_makanan extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    private RecyclerView rvUser;
    private List<user_model> mListUser;
    private user_adapter mUserAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_makanan);

        rvUser = (RecyclerView) findViewById(R.id.recyclerview);

        mListUser = new ArrayList<>();

        //create data user
        user_model user1 = new user_model("Nasi Goreng", "24000");
        user_model user2 = new user_model("Mie Goreng", "22000");
        user_model user3 = new user_model("Gado Gado", "20000");
        user_model user4 = new user_model("Batagor", "19000");
        user_model user5 = new user_model("Syomay", "19000");
        user_model user6 = new user_model("Kentang Goreng", "10000");
        user_model user7 = new user_model("Sosis Goreng", "20000");
        user_model user8 = new user_model("Nasi Kuning", "10000");
        user_model user9 = new user_model("Nasi Uduk", "10000");
        user_model user10 = new user_model("Pasta", "30000");

        //add object user to list
        mListUser.add(user1);
        mListUser.add(user2);
        mListUser.add(user3);
        mListUser.add(user4);
        mListUser.add(user5);
        mListUser.add(user6);
        mListUser.add(user7);
        mListUser.add(user8);
        mListUser.add(user9);
        mListUser.add(user10);

        //passing to adapter
        mUserAdapter = new user_adapter(mListUser, this);
        rvUser.setLayoutManager(new LinearLayoutManager(this));
        rvUser.setItemAnimator(new DefaultItemAnimator());
        rvUser.setAdapter(mUserAdapter);
        mUserAdapter.notifyDataSetChanged();

    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("menu_makanan Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}


