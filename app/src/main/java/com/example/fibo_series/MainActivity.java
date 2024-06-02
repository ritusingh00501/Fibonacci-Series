package com.example.fibo_series;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText T = (EditText) findViewById(R.id.num);
        TextView Result = (TextView) findViewById(R.id.textView2);
        Button B1 = (Button) findViewById(R.id.btn);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = 0, n2 = 1, n3, i, num;

                num = Integer.parseInt(T.getText().toString().trim());
                Result.setText("Fibonacci series is ");
                Toast.makeText(MainActivity.this, "Fibonacci series is", Toast.LENGTH_SHORT).show();
                Result.setText(n1);
                Result.setText(n2);
                for (i = 2; i < num; ++i)  //loop starts from 2 because 0 and 1 are already printed
                {
                    n3 = n1 + n2;
                    Result.setText(n3);
                    n1 = n2;
                    n2 = n3;
                }
            }
        });
    }
}
