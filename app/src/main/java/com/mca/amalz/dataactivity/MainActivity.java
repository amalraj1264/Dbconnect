package com.mca.amalz.dataactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5, e6, e7;
    Button but1;
    String s1, s2, s3, s4, s5, s6, s7;
    NewDb newdb = new NewDb(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.empcode);
        e2 = (EditText) findViewById(R.id.empname);
        e3 = (EditText) findViewById(R.id.mobnum);
        e4 = (EditText) findViewById(R.id.emmail);
        e5 = (EditText) findViewById(R.id.designation);
        e6 = (EditText) findViewById(R.id.salary);
        e7 = (EditText) findViewById(R.id.cName);
        but1 = (Button) findViewById(R.id.subbutton);


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                s3 = e3.getText().toString();
                s4 = e4.getText().toString();
                s5 = e5.getText().toString();
                s6 = e6.getText().toString();
                s7 = e7.getText().toString();
                Log.d("empcode", s1);
                Log.d("empname", s2);
                Log.d("mobnum", s3);
                Log.d("email", s4);
                Log.d("Designation", s5);
                Log.d("Salary", s6);
                Log.d("cname", s7);
                boolean result = newdb.insertdata(s1, s2, s3, s4, s5, s6, s7);
                if (result == true) {
                    Toast.makeText(getApplicationContext(), "Inserted Successfully", Toast.LENGTH_SHORT).show();

                } else
                    {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();

                }
            }

        });
    }
}
