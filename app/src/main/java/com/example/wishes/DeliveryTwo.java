package com.example.wishes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeliveryTwo extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_two);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDeliveryDetails3();
            }
        });
    }

    public void openDeliveryDetails3() {
        Intent intent = new Intent(this, DeliveryFour.class);
        startActivity(intent);
    }
}
