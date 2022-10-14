package com.develovit.sita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DetailSidang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sidang);


    }

    public void dospeng(View view) {
        Intent dospenglist= new Intent (this, Dopsem.class);
        startActivity(dospenglist);
    }
}