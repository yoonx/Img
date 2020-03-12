package br.ifsc.edu.img;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IMC extends AppCompatActivity {
    ImageView imageView;
    List<Integer> Lista_img;
    int posicaoimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);

        Lista_img = Arrays.asList(
                R.drawable.cachorro,
                R.drawable.patinho,
               R.drawable.porquinho,
                R.drawable.gardem,
                R.drawable.happy);
        posicaoimg = 0;
    }

    public void mudaImagem (View view){
        if(posicaoimg<Lista_img.size()-1){
              imageView.setImageResource(Lista_img.get(posicaoimg));
        }else{
           posicaoimg=0;
          imageView.setImageResource(Lista_img.get(posicaoimg));
        }
          posicaoimg++;
    }
}
