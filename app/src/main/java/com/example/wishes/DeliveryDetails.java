package com.example.wishes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeliveryDetails extends AppCompatActivity {
    private  Button button1;
    private  Button button2;
    EditText  et_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_details);



        button2 = (Button) findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenu();
            }
        });

        //drop Down
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.city,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
   /* spinner.setOnItemSelectedListener(this);
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String text = parent.getItemAtPosition(position).toString();
            Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }  */

        //email validation
        et_email=(EditText)findViewById(R.id.editText5);
        button1 =(Button)findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String validemail = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +"\\@" +"[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +"(" +"\\." +"[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +")+";


                String editText5 = et_email.getText().toString();
                Matcher matcher = Pattern.compile(validemail).matcher(editText5);



                if(!matcher.matches()){
                    //Toast.makeText(getApplicationContext(),"valid Email Address",Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),"Enter valid Email Address",Toast.LENGTH_LONG).show();


                }
                else{

                    //Toast.makeText(getApplicationContext(),"Enter valid Email Address",Toast.LENGTH_LONG).show();
                    button1 = (Button) findViewById(R.id.button4);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            openCart();
                        }
                    });
                }



            }
        });


    }

    public void openCart(){
        Intent intent = new Intent(this, Cart.class);
        startActivity(intent);
    }

    public void openMenu(){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}
