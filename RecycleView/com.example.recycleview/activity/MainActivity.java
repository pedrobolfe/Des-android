package com.example.recycleview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.recycleview.R;
import com.example.recycleview.adapter.Adapter;
import com.example.recycleview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    public void criarFilmes(){
        Filme filme = new Filme("Homem Aranha", "ação", "2022");
        this.listaFilmes.add(filme);

        filme = new Filme("Mulher Maravilha", "ação", "2019");
        this.listaFilmes.add(filme);

        filme = new Filme("Matrix", "ficção", "2002");
        this.listaFilmes.add(filme);

        filme = new Filme("Forrest Gump", "drama", "1994");
        this.listaFilmes.add(filme);

        filme = new Filme("Harry Potter", "ficção", "2004");
        this.listaFilmes.add(filme);

        filme = new Filme("Guardiões da Galaxia: Vol 3", "ação", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("Deadpool", "ação", "2019");
        this.listaFilmes.add(filme);
    }




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //listar os filmes
        this.criarFilmes();

        //Configurar adapter
        Adapter adapter = new Adapter(listaFilmes);



        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter); //criar adapter
    }

}
