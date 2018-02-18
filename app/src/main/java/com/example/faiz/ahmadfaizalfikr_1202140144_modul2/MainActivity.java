package com.example.faiz.ahmadfaizalfikr_1202140144_modul2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton radio_dine , radio_take;

        Button btn_submit = (Button) findViewById(R.id.button);
        radio_dine = (RadioButton) findViewById(R.id.radio_dine);
        radio_take = (RadioButton) findViewById(R.id.radio_take);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (radio_dine.isChecked()) {
                    Intent iDine = new Intent(getApplicationContext(), dine_in.class);
                    startActivity(iDine);
                }else {
                    Intent iTake = new Intent(getApplicationContext(), take_activity.class);
                    startActivity(iTake);
                }
            }
        });
    }

  //  public void onRadioButtonClick(View view) {
   //     boolean checked = ((RadioButton) view).isChecked();

     //   switch (view.getId()) {
       //     case R.id.radio_dine:
         //       if (checked)

           //  break;
            //case R.id.radio_take:
              //  if (checked)
                //    break;
        //}
}
