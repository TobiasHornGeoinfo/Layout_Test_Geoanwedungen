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

public class SideActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side);

        loadStepPref2();
        final Button saveStepLength2 = (Button) findViewById(R.id.Save2);
        if(saveStepLength2 != null) {
            saveStepLength2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText editText = (EditText) findViewById(R.id.UserDistance2);


                    //saveStepPref2("editStepLength", editText.getText().toString());



                }
            });
        }




    }

    private void loadStepPref2() {
        EditText inputStepLength = (EditText) findViewById(R.id.UserDistance2);
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        String value2 = sp.getString("editStepLength", null);
        inputStepLength.setText(value2);
    }

    private void saveStepPref2(String key2, String value2){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString(key2, value2);
        edit.apply();
    }


    public void sendChangeView2(View view) {
        //Change view Back
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void ClickOnLog2(View view1) {
        EditText inputStepLength = (EditText) findViewById(R.id.UserDistance2);
        Float UserDistance2 = Float.valueOf(inputStepLength.getText().toString());
        Log.e("Log2", "Log2 = " + UserDistance2);
    }

/*    public float ReturnInputFromSide () {
        EditText inputStepLength = (EditText) findViewById(R.id.UserDistance2);
        Float UserDistance2 = Float.valueOf(inputStepLength.getText().toString());
        return UserDistance2;
    }*/

}