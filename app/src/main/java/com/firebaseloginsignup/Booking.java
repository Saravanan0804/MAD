package com.firebaseloginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Booking extends AppCompatActivity {

    CheckBox ch1,ch2,ch3,ch4;
    Button order;
    TextView Bill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        ch1=findViewById(R.id.biriyani);
        ch2=findViewById(R.id.curdrice);
        ch3=findViewById(R.id.Sambar);
        ch4=findViewById(R.id.Koththu);
        order=findViewById(R.id.book);
        Bill=findViewById(R.id.bill);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total=0;


                if(ch1.isChecked()){
                    total=total+90;
                }

                if(ch2.isChecked()){
                    total=total+50;
                }

                if(ch3.isChecked()){
                    total=total+100;
                }

                if(ch4.isChecked()){
                    total=total+70;
                }

                Bill.setText("Your Bill is Rs "+ String.valueOf(total));
                Toast.makeText(Booking.this, "Booking Confirmed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}