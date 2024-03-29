package com.example.wishes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cart extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        button1 = (Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOrderSummary();
            }
        });

        button2 = (Button)findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });

    }

    public void openOrderSummary(){
        Intent intent = new Intent(this, OrderSummary.class);
        startActivity(intent);
    }

    public void openMenu(){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }


}
