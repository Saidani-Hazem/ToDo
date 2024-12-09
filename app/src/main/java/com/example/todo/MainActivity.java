package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText v1, v2, rt;
    Button btn,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = findViewById(R.id.v1);
        v2 = findViewById(R.id.v2);
        rt = findViewById(R.id.rt);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = v1.getText().toString();
                String num2 = v2.getText().toString();
                    int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
                    rt.setText(String.valueOf(sum));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                rt.setText("");
                v1.setText("");
                v2.setText("");
            }
        });
    }
}
