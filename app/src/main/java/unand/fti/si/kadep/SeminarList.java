package com.develovit.sita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerAdapter recyclerAdapter;
    private RecyclerView recyclerView;
    private ArrayList<DataRecyclerView> listdata;
    private GridLayoutManager layoutmanager;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutmanager=new GridLayoutManager(getApplicationContext(),1);
        layoutmanager.setOrientation(GridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutmanager);
        listdata = new ArrayList<DataRecyclerView>();
        recyclerAdapter = new RecyclerAdapter(this,listdata);
        recyclerView.setAdapter(recyclerAdapter);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        show();
    }

    void show(){

        listdata.add(new DataRecyclerView("Pengembangan Aplikasi Perpustakaan","Silvia","Yudi Hermandi, S.Kom, M.Ti",getResources().getDrawable(R.drawable.profil12)));
        recyclerAdapter.notifyDataSetChanged();

        listdata.add(new DataRecyclerView("Pembangunan Sistem Informasi Cafe","Raidha","Yaman Khaeruzzaman, M.Sc",getResources().getDrawable(R.drawable.profil11)));
        recyclerAdapter.notifyDataSetChanged();

        listdata.add(new DataRecyclerView("Automatisasi Smart Home","Zaim","Yaman Khaeruzzaman, M.Sc",getResources().getDrawable(R.drawable.profil6)));
        recyclerAdapter.notifyDataSetChanged();

        listdata.add(new DataRecyclerView("Rekayasa Perangkat Lunak","Nada","Yudi Hermandi, S.Kom, M.Ti",getResources().getDrawable(R.drawable.profil7)));
        recyclerAdapter.notifyDataSetChanged();

        listdata.add(new DataRecyclerView("Automatisasi Smart Home","Hilmi","Yaman Khaeruzzaman, M.Sc",getResources().getDrawable(R.drawable.profil8)));
        recyclerAdapter.notifyDataSetChanged();

        listdata.add(new DataRecyclerView("Pengembangan Aplikasi Perpustakaan","Silvia","Yudi Hermandi, S.Kom, M.Ti",getResources().getDrawable(R.drawable.profil9)));
        recyclerAdapter.notifyDataSetChanged();

        listdata.add(new DataRecyclerView("Automatisasi Smart Home","Muhammad A R","Yaman Khaeruzzaman, M.Sc",getResources().getDrawable(R.drawable.profil2)));
        recyclerAdapter.notifyDataSetChanged();
    }

    public void detailsid(View view) {
        Intent detailsidlist= new Intent (this, Sidanglist.class);
        startActivity(detailsidlist);
    }
}