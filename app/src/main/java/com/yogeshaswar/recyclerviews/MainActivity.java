package com.yogeshaswar.recyclerviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    Intent iRVOne, iRVTwo, iRVThree, iRVFour, iRVFive, iRVSix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iRVOne = new Intent(MainActivity.this, NormalRV.class);
        initiateUi();
        btnClickHandler();
    }

    private void btnClickHandler() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BtnOne Clicked", Toast.LENGTH_SHORT).show();

                startActivity(iRVOne);
//                finish();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BtnTwo Clicked", Toast.LENGTH_SHORT).show();
                iRVTwo = new Intent(MainActivity.this, NormalRV.RVTwo.class);
                startActivity(iRVTwo);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "btn3 Clicked", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, RVThree.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "btn4 Clicked", Toast.LENGTH_SHORT).show();
                iRVFour = new Intent(MainActivity.this, RVFour.class);
                startActivity(iRVFour);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "btn5 Clicked", Toast.LENGTH_SHORT).show();
                iRVFive = new Intent(MainActivity.this, RVFive.class);
                startActivity(iRVFive);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "btn6 Clicked", Toast.LENGTH_SHORT).show();
                iRVSix = new Intent(MainActivity.this, RVSix.class);
                startActivity(iRVSix);
            }
        });
    }

    private void initiateUi() {
        btn1 = findViewById(R.id.btn_one);
        btn2 = findViewById(R.id.btn_two);
        btn3 = findViewById(R.id.btn_three);
        btn4 = findViewById(R.id.btn_four);
        btn5 = findViewById(R.id.btn_five);
        btn6 = findViewById(R.id.btn_six);
    }
}