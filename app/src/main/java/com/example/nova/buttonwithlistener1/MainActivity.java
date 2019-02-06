package com.example.nova.buttonwithlistener1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_id).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

                Toast.makeText(this, "Done!!!", Toast.LENGTH_SHORT).show();
    }
}
