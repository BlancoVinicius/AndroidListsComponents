package com.example.alcoolgasolina.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alcoolgasolina.R;
import com.example.alcoolgasolina.model.Filme;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Filme> listaFilmes;
    private Context context;

    public Adapter(List<Filme> listaFilmes, Context context) {
        this.listaFilmes = listaFilmes;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapterlista, parent, false);
        return new MyViewHolder(itemLista, context);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titulo.setText(listaFilmes.get(position).getTitulo());
        holder.genero.setText(listaFilmes.get(position).getGenero());
        holder.ano.setText(listaFilmes.get(position).getAno());
    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo, ano, genero;
        public MyViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            titulo = itemView.findViewById(R.id.txtTitulo);
            ano = itemView.findViewById(R.id.txtAno);
            genero = itemView.findViewById(R.id.txtGenero);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView  p = view.findViewById(R.id.txtTitulo);
                    Toast.makeText(context, p.getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
