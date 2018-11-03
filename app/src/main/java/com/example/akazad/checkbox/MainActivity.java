package com.example.akazad.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.StringBuilder.*;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editTextId);
        textView1=findViewById(R.id.resultId);
        textView1.setText("Hello Android");

    }

    public void ChangeText(View view) {
           String text= editText1.getText().toString();
          // textView1.setText("Value is "+text);
        if (text.isEmpty()){

            editText1.setError("Please provide a valid positive number");
            return;

        }
           int number=Integer.parseInt(text);
           textView1.setText(String.valueOf("Your number of "+number));
            editText1.setText("");
        Toast.makeText(getApplicationContext(), text.toString(), Toast.LENGTH_LONG).show();
    }
}
