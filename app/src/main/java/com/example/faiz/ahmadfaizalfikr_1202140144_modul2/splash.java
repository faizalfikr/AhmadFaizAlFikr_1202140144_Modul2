package com.example.faiz.ahmadfaizalfikr_1202140144_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import static android.R.attr.name;

/**
 * Created by Faiz on 2/18/2018.
 */

public class splash extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }

}
