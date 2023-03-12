package com.example.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderDetailActivity extends AppCompatActivity {

    private static  final String EXTRA_USER_NAME = "userName";
    private static  final String EXTRA_DRINK = "drink";
    private static  final String EXTRA_DRINK_TYPE = "drinkType";
    private static  final String EXTRA_ADDITIVES = "additives";

    private TextView textViewName;
    private TextView textViewDrink;
    private TextView textViewDrinkType;
    private TextView textViewAdditives;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);
        initView();
        insertText();
    }

    public static Intent newIntent(Context context,
                                   String userName,
                                   String drink,
                                   String drinkType,
                                   String additives){
        Intent intent = new Intent(context, OrderDetailActivity.class);
        intent.putExtra(EXTRA_USER_NAME, userName);
        intent.putExtra(EXTRA_DRINK, drink);
        intent.putExtra(EXTRA_DRINK_TYPE, drinkType);
        intent.putExtra(EXTRA_ADDITIVES, additives);
        return intent;
    }

    private void initView(){
        textViewName = findViewById(R.id.textViewName);
        textViewDrink = findViewById(R.id.textViewDrink);
        textViewDrinkType = findViewById(R.id.textViewDrinkType);
        textViewAdditives = findViewById(R.id.textViewAdditives);
    }

    private void insertText(){
        textViewName.setText(getIntent().getStringExtra(EXTRA_USER_NAME));
        textViewDrink.setText(getIntent().getStringExtra(EXTRA_DRINK));
        textViewDrinkType.setText(getIntent().getStringExtra(EXTRA_DRINK_TYPE));
        textViewAdditives.setText(getIntent().getStringExtra(EXTRA_ADDITIVES));

    }

}