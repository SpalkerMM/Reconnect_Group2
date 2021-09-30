package com.example.kampus_merdeka1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class status2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickSubmit(View view) {

        final TextView nameView = findViewById(R.id.nameView);
        final EditText inputName = findViewById(R.id.inputName);
        final String nameValue = inputName.getText().toString();
        nameView.setText(nameValue);

        final TextView emailView = findViewById(R.id.emailView);
        final EditText inputEmail = findViewById(R.id.inputEmail);
        final String emailValue = inputEmail.getText().toString();
        emailView.setText(emailValue);

        final TextView numberView = findViewById(R.id.numberView);
        final EditText inputNumber = findViewById(R.id.inputNumber);
        final String phonelValue = inputNumber.getText().toString();
        numberView.setText(phonelValue);

    }


}