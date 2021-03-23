package com.walkiriaapps.alarmmanagersampl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toast.makeText(this,"Main2Activity",Toast.LENGTH_LONG).show();
        Log.d("WALKIRIA", " Main2Activity");
    }
}
