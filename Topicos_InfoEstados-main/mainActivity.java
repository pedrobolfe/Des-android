package com.example.appmaps;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    public TextView estado;
    public PhotoView imagem;
    public TextView idh;
    public TextView populacao;
    public TextView densidade;
    public TextView area;
    public TextView municipios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        estado = (TextView) findViewById(R.id.estado);

        imagem = (PhotoView) findViewById(R.id.imagem);

        populacao = (TextView) findViewById(R.id.populacao);

        densidade = (TextView) findViewById(R.id.densidade);

        area = (TextView) findViewById(R.id.area);

        municipios = (TextView) findViewById(R.id.municipios);

        idh = (TextView) findViewById(R.id.idh);

    }
    public void pesquisar(View view){

        String estado1 = estado.getText().toString();

        String PARANA = "parana";

        if (estado1.toLowerCase().equals("paraná")  || estado1.toLowerCase().equals("pr")){

            imagem.setImageResource(R.drawable.pr);

            idh.setText("IDH: 0,749 [2010]");

            area.setText("Área territorial: 199.298,981 km² [2022]\n");
            densidade.setText("Densidade demográfica: 52,40 hab/km² [2010]");
            municipios.setText("Número municípios: 284");
            populacao.setText("População estimada: 11.597.484 pessoas [2021]");
        }
        if (estado1.toLowerCase().equals("santa catarina")  || estado1.toLowerCase().equals("sc")){

            imagem.setImageResource(R.drawable.sc);
            idh.setText("IDH: 0,774   [2010]");
            area.setText("Área territorial: 95.730,690km² [2022]");
            densidade.setText("Densidade demográfica: 65,29 hab/km²  [2010]");
            municipios.setText("Número municípios: 295");
            populacao.setText("População estimada: 7.338.473 pessoas [2021]");
        }
        if (estado1.toLowerCase().equals("rio grande do sul")  || estado1.toLowerCase().equals("rs")){

            imagem.setImageResource(R.drawable.rs);
            idh.setText("IDH: 0,746   [2010]");
            area.setText("Área territorial: 281.707,151km²   [2022]");
            densidade.setText("Densidade demográfica: 39,79 hab/km²   [2010]");
            municipios.setText("Número municípios: 497");
            populacao.setText("População estimada: 11.466.630 pessoas   [2021]");
        }
    }

}
