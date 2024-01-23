package com.example.alcoolgasolina.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.alcoolgasolina.R;
import com.example.alcoolgasolina.adapter.Adapter;
import com.example.alcoolgasolina.model.Filme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyRecycleView extends AppCompatActivity {

    private RecyclerView recycleView;
    private List<Filme> listaFilmes = Arrays.asList(
            new Filme("Titanic", "Romance", "2010"),
            new Filme("Parque Dinossauors", "Aventura", "2000"),
            new Filme("Lagoa azul", "Aventura", "1995")
            );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        recycleView = findViewById(R.id.recyclerView);

        //configure o adapter
        Adapter adp = new Adapter(listaFilmes, getApplicationContext());


        //configure o layout maneger
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recycleView.setLayoutManager(layoutManager);
        recycleView.setHasFixedSize(true); //para melhorar a performace
        recycleView.setAdapter(adp);

    }
}