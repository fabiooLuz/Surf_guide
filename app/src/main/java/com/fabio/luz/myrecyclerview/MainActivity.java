package com.fabio.luz.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images [] ={R.drawable.grumari,R.drawable.prainha,R.drawable.macumba,
    R.drawable.canto,R.drawable.reserva,R.drawable.barra,R.drawable.arpex,R.drawable.itacoatiara,R.drawable.itauna,
    R.drawable.pgarraial,R.drawable.praiadoforte,R.drawable.geriba,R.drawable.lopesmendes,R.drawable.cepilhoparaty};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.locais);
        s2 = getResources().getStringArray(R.array.descricao);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL ));

    }
}