package com.info.sayitahminuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SonucActivity extends AppCompatActivity {
    private ImageView imageViewSonuc;
    private TextView textViewSonuc;
    private Button buttonTekrar;
    private boolean sonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);
        imageViewSonuc = findViewById(R.id.imageViewSonuc);
        textViewSonuc = findViewById(R.id.textViewSonuc);
        buttonTekrar = findViewById(R.id.buttonTekrar);

        sonuc = getIntent().getBooleanExtra("sonuc",false);
        if (sonuc) {
            imageViewSonuc.setImageResource(R.drawable.ic_mood);
            textViewSonuc.setText("Kazandık pok yiyesice");
        }else {
            imageViewSonuc.setImageResource(R.drawable.ic_sentiment_very_dissatisfied);
            textViewSonuc.setText("Sana o kadar söyledik nerde sakalımız yok ki sözümüz dinlensin dön baştan oyna bu sefer doru bil");
            textViewSonuc.setTextColor(Color.GREEN);
            textViewSonuc.setTextSize(20);
        }
        buttonTekrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SonucActivity.this,TahminActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
