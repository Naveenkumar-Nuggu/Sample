package com.example.s531373.tipme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Sample extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        Intent intent =getIntent();
    }
}
