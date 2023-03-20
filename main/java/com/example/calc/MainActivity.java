package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int num1=0, num2=0;

    private EditText editNumber1;

    private EditText editNumber2;

    private TextView output;

    public boolean getNumbers() {
        editNumber1 = findViewById(R.id.editNumber1);
        editNumber2 = findViewById(R.id.editNumber2);
        output = findViewById(R.id.numberViewOutput);

        String stringNum1 = editNumber1.getText().toString();
        String stringNum2 = editNumber2.getText().toString();

        num1 = Integer.parseInt(stringNum1);
        num2 = Integer.parseInt(stringNum2);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addNumbers(View view){

        getNumbers();
        int result = num1+num2;
        output.setText(Integer.toString(result));

    }

    public void subtractNumbers(View view){

        getNumbers();
        int result = num1-num2;
        output.setText(Integer.toString(result));

    }

    public void multiplyNumbers(View view){

        getNumbers();
        int result = num1*num2;
        output.setText(Integer.toString(result));

    }

    public void divideNumbers(View view){

        getNumbers();
        int result = num1/num2;
        output.setText(Integer.toString(result));

    }
}