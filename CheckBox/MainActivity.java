package com.example.aulacheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBoxVerde;
    private CheckBox checkBoxAzul;
    private CheckBox checkBoxVermelho;
    private TextView textoResultado;
    private RadioButton radioButtonArroz;
    private RadioButton radioButtonFeijao;
    private RadioGroup radioGroupAlmoco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxVerde = findViewById(R.id.checkBoxVerde);
        checkBoxAzul = findViewById(R.id.checkBoxAzul);
        checkBoxVermelho = findViewById(R.id.checkBoxVermelho);
        textoResultado = findViewById(R.id.textoResultado);

        radioButtonArroz = findViewById(R.id.radioButtonArroz);
        radioButtonFeijao = findViewById(R.id.radioButtonFeijao);
        radioGroupAlmoco = findViewById(R.id.radioGroupAlmoco);

        radioButtonListener();
    }
    public void radioButton(){
        if (radioButtonArroz.isChecked()){
            textoResultado.setText("Arroz");
        }  else if(radioButtonFeijao.isChecked()){
            textoResultado.setText("Feijão");
        }
    }
    public void checkBox(){
        String texto = "";

        if (checkBoxVerde.isChecked()){
            texto += "Verde Selecionado - ";
        }
        if (checkBoxAzul.isChecked()){
            texto += "Azul Selecionado - ";
        }
        if (checkBoxVermelho.isChecked()){
            texto += "Vermelho Selecionado ";
        }
        textoResultado.setText(texto);
    }
    public void radioButtonListener(){
        radioGroupAlmoco.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonArroz){
                    textoResultado.setText("Arroz");
                } else if (checkedId == R.id.radioButtonFeijao){
                    textoResultado.setText("Feijão");
                }
            }
        });
    }

    public void enviar(View view) {
        //checkBox();
        //radioButton();
    }
}
