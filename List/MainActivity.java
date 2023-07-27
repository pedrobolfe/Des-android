package com.example.appaula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] items = {
            "Angra dos Reis",
            "Rio de Janeiro",
            "Missal",
            "Curitiba",
            "Cascavel",
            "São Paulo",
            "Gramado",
            "Foz do Iguaçu",
            "Porto Alegre",
            "Belo Horizonte",
            "Salvador",
            "Fortaleza"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        // Criar um adaptador para a lista
        String[] itens;
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1, // layout da lista
                android.R.id.text1,// id do layout
                items // lista a ser passada
        );

        // adiciona adpter para a lista
        listLocais.setAdapter(adaptador);

        //adiciona clique na tela

        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorSelecionado = listLocais.getItemAtPosition(position).toString();
            }
        });
    }


}
