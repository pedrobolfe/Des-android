package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name1 = findViewById(R.id.textResultado);
        name2 = findViewById(R.id.textResultado);
        textResult = findViewById(R.id.textResultado);

    }
    public void jogar (View View){
        Button button =findViewById(R.id.button);
        Random random = new Random();

        int numAleatorioJog1 = random.nextInt(3);
        int numAleatorioJog2 = random.nextInt(3);

        ImageView papelJog1 = findViewById(R.id.papelJog1);
        ImageView papelJog2 = findViewById(R.id.papelJog2);

        ImageView pedraJog1 = findViewById(R.id.pedraJog1);
        ImageView pedraJog2 = findViewById(R.id.pedraJog2);

        ImageView tesouraJog1 = findViewById(R.id.tesouraJog1);
        ImageView tesouraJog2 = findViewById(R.id.tesouraJog2);

        ImageView imageView = null;
        if (numAleatorioJog1 == 1) {
            imageView.setImageResource(R.drawable.papel);
            pedraJog1.setImageDrawable(null);
            tesouraJog1.setImageDrawable(null);
        } else if (numAleatorioJog1 == 2) {
            imageView.setImageResource(R.drawable.pedra);
            papelJog1.setImageDrawable(null);
            tesouraJog1.setImageDrawable(null);
        } else {
            imageView.setImageResource(R.drawable.tesoura);
            papelJog1.setImageDrawable(null);
            pedraJog1.setImageDrawable(null);
        }

        if (numAleatorioJog2 == 1) {
            imageView.setImageResource(R.drawable.papel);
            pedraJog2.setImageDrawable(null);
            tesouraJog2.setImageDrawable(null);
        } else if (numAleatorioJog2 == 2) {
            imageView.setImageResource(R.drawable.pedra);
            papelJog2.setImageDrawable(null);
            tesouraJog2.setImageDrawable(null);
        } else {
            imageView.setImageResource(R.drawable.tesoura);
            papelJog2.setImageDrawable(null);
            pedraJog2.setImageDrawable(null);
        }
//        Pedra perde para papel[1] e ganha para tesoura[3]
//        Papel perde para tesoura[3] e ganha para pedra[2]
//        Tesoura perde para pedra[2] e ganha para papel[1]
        //int[] images = {R.drawable.papel, R.drawable.tesoura, R.drawable.pedra};
        if(((numAleatorioJog1 == 3) && (numAleatorioJog2 == 1)) || ((numAleatorioJog1 == 2) && (numAleatorioJog2 == 3)) || ((numAleatorioJog1 == 1) && (numAleatorioJog2 == 2))){
            textResult = name1;
        }else if(numAleatorioJog1 != numAleatorioJog2){
            textResult = name2;
        }



    }
}
