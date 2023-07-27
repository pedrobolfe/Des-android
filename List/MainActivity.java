package com.example.appaula;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] items = {
            "Tópicos Especiais de Informatica",
            "Redes de Computadores",
            "Programção Web",
            "Programção orientada a objetos",
            "Biologia",
            "Português",
            "Inglês",
            "Matemática",
            "Química",
            "Hístoria",
            "Física",
            "Sociologia",
            "Filosofia",
            "Geografia",
            "Projeto de Conclusão de Curso"
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
//              Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_SHORT).show();
                dialog(view, valorSelecionado);
            }
        });

    }

    public void dialog(View view, String materia){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //configurar titulo e mensagem
        dialog.setTitle("Matricula");
        dialog.setMessage("Deseja se matricular na matéria " + materia);

        //configurar cancelamento do alert dialog
        dialog.setCancelable(false);

        //configurar icone
        dialog.setIcon(android.R.drawable.ic_btn_speak_now);

        //configurar açoes para sim e nâo
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Mátricula foi feita " + materia, Toast.LENGTH_SHORT).show();

            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Mátricula não foi feita ", Toast.LENGTH_SHORT).show();

            }
        });
        dialog.create();
        dialog.show();
    }
}
