package com.example.faiz.ahmadfaizalfikr_1202140144_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Faiz on 2/18/2018.
 */

public class take_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.take_away);

        Button btn_4 = (Button) findViewById(R.id.button2);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next1 = new Intent(getApplicationContext(), menu_makanan.class);
                startActivity(next1);
            }
        });
    }

}
