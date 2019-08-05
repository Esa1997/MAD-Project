package com.example.wishes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeliveryFour extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_four);

        button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDeliveryDetails3();
            }
        });

        button2 = (Button) findViewById(R.id.button7);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDeliveryDetails2();
            }
        });
    }

    public void openDeliveryDetails3() {
        Intent intent = new Intent(this, DeliveryThree.class);
        startActivity(intent);
    }

    public void openDeliveryDetails2() {
        Intent intent = new Intent(this, DeliveryThree.class);
        startActivity(intent);
    }
}
