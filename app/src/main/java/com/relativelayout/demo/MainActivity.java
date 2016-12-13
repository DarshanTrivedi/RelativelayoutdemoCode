package com.relativelayout.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created By SpaceO Technologies on  12/12/2016
 */


public class MainActivity extends AppCompatActivity {

    private TextView tvuser;

    private EditText edtuser;

    private Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Declare View in initControls()


        initControls();


        // Set on click Listener in set Listner

        setListener();
    }


    private void initControls() {

        tvuser = (TextView) findViewById(R.id.tvuser);

        edtuser = (EditText) findViewById(R.id.edtuser);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);


    }


    private void setListener() {

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
