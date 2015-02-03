package com.boonstudio.optimusprime.loool;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {

    //To Initialize a button
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //Set the Layout to main.xml
        setContentView(R.layout.main);

      //This code will add the button method
        addListenerOnButton();
    }

 //Listener will be added to the button.
 // It will "Listen" to the click that the user will input so as to do something
    public void addListenerOnButton() {

        final Context context = this;

//We will specify the button we want to listen to"

        button = (Button) findViewById(R.id.btn1);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Megatron.class);
                startActivity(intent);

            }

        });

    }}
