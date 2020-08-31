package com.example.fakelayout2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

     Float UserDistance2 = 3f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        loadStepPref();


/*        final Button saveStepLength = (Button) findViewById(R.id.Save1);
        if(saveStepLength != null) {
            saveStepLength.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText editText = (EditText) findViewById(R.id.UserDistance1);


                }
            });
        }*/

    }


        private void loadStepPref() {
            EditText inputStepLength = (EditText) findViewById(R.id.UserDistance1);
            SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
            String value = sp.getString("editStepLength", null);
            inputStepLength.setText(value);
        }

        private void saveStepPref(String key, String value){
            SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor edit = sp.edit();
            edit.putString(key, value);
            edit.apply();
        }



        public void sendChangeView(View view1) {
        Intent intent = new Intent(this, SideActivity.class);
        startActivity(intent);
        }

         public void ClickOnLog1(View view1) {
             // saveStepPref("editStepLength", editText.getText().toString());
             // SideActivity.ReturnInputFromSide();
            // SideActivity UserDistanceInstance123 = new SideActivity();
             //Float UserDistance2 = UserDistanceInstance123.ReturnInputFromSide();

             EditText inputStepLength = (EditText) findViewById(R.id.UserDistance1);
             Float UserDistance1 = Float.valueOf(inputStepLength.getText().toString());


             SharedPreferences sp = getSharedPreferences("key2", MODE_PRIVATE);
             String value2 = sp.getString("value2","");

        Log.e("Log1", "Log1 = " + UserDistance1 + " Log2 From Side = " + value2 );
        }



}