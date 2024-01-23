package com.example.alcoolgasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {
            "Angra dos Reis",
            "Caldas Novas",
            "Buenos Aires",
            "Paris"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listView);
        //Criar Adapter
        ArrayAdapter<String> adapter_ = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, android.R.id.text1,
                itens
        );

        listLocais.setAdapter(adapter_);

        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), listLocais.getItemAtPosition(i).toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}