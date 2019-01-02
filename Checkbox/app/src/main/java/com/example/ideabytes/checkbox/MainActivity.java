package com.example.ideabytes.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox ch1,ch2,ch3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onClick();
    }

    public void onClick(){

        ch1=findViewById(R.id.check1);
        ch2=findViewById(R.id.check2);
        ch3=findViewById(R.id.check3);
        b1=findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int total_amout=0;
                StringBuilder result=new StringBuilder();
                if (ch1.isChecked()||ch2.isChecked()||ch3.isChecked()) {
                    result.append("Selected items: ");
                    if (ch1.isChecked()) {
                        result.append("\nMutton Rs.500");
                        total_amout += 500;
                    }
                    if (ch2.isChecked()) {
                        result.append("\nChicken Rs.150");
                        total_amout += 150;
                    }
                    if (ch3.isChecked()) {
                        result.append("\nFish Rs.200");
                        total_amout += 200;
                    }
                    result.append("\nTotal: Rs." + total_amout);
                    Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
                }
                else
                {
                    result.append("items not selcted");
                    Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
