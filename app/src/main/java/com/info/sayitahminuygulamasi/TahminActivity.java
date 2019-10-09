package com.info.sayitahminuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class TahminActivity extends AppCompatActivity {
    private TextView textViewKalanHak, textViewYardim;
    private EditText editTextGirdi;
    private Button buttonTahmin;
    private int Sayac=5;
    private int rasgeleSayi;
    private int yorum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahmin);

        textViewKalanHak = findViewById(R.id.textViewKalanHak);
        textViewYardim =findViewById(R.id.textViewYardim);
        editTextGirdi = findViewById(R.id.editTextGirdi);
        buttonTahmin = findViewById(R.id.buttonTahmin);



        Random r =new Random();
        rasgeleSayi = r.nextInt(101);

        Log.e("tahmin",String.valueOf(rasgeleSayi));
        buttonTahmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Sayac = Sayac - 1;

                int tahmin = Integer.parseInt(editTextGirdi.getText().toString());


                if (Sayac !=0){

                    if (tahmin == rasgeleSayi){
                        Intent i = new Intent(TahminActivity.this,SonucActivity.class);
                        i.putExtra("sonuc",true);
                        startActivity(i);
                        finish();
                    }
                    switch (Sayac){
                        case 4:
                            if (tahmin > rasgeleSayi){

                                textViewYardim.setText("Azalt");
                                yorum=1;
                            }
                            if (tahmin < rasgeleSayi){

                                textViewYardim.setText("Arttır");
                                yorum=2;
                            }
                            break;
                        case 3:
                            if (tahmin > rasgeleSayi && yorum==1){

                                textViewYardim.setText("Azalt dedik ya sana niye azaltmıyon :)");
                                yorum=3;
                            }
                            if (tahmin < rasgeleSayi && yorum==1){

                                textViewYardim.setText("Arttır");
                                yorum=4;
                            }
                            if (tahmin < rasgeleSayi && yorum == 2){

                                textViewYardim.setText("Arttır dedik ya sana niye arttırmıyon :)");
                                yorum=5;
                            }
                            if (tahmin > rasgeleSayi && yorum == 2){

                                textViewYardim.setText("Azalt");
                                yorum=6;
                            }
                            break;

                        case 2:
                            if (tahmin > rasgeleSayi && yorum == 3){

                                textViewYardim.setText("Azalt pok yiyesice azalt :D");
                                yorum=7;
                            }
                            if (tahmin < rasgeleSayi && yorum == 3){

                                textViewYardim.setText("Arttır");
                                yorum=8;
                            }
                            if (tahmin > rasgeleSayi && yorum == 4){

                                textViewYardim.setText("Azalt arkadaşım azalt :D");
                                yorum=9;
                            }
                            if (tahmin < rasgeleSayi && yorum == 4){

                                textViewYardim.setText("Arttır dedik ya sana niye arttırmıyon :) :D");
                                yorum=10;
                            }
                            if (tahmin > rasgeleSayi && yorum == 5){

                                textViewYardim.setText("Azalt");
                                yorum=11;
                            }
                            if (tahmin < rasgeleSayi && yorum == 5){

                                textViewYardim.setText("Arttır pok yiyesice arttır :D");
                                yorum=12;
                            }
                            if (tahmin > rasgeleSayi && yorum == 6){

                                textViewYardim.setText("Azalt dedik ya sana niye azaltmıyon :)");
                                yorum=13;
                            }
                            if (tahmin < rasgeleSayi && yorum == 6){

                                textViewYardim.setText("Arttır arkadaşım arttır :D");
                                yorum=14;
                            }
                            break;

                        case 1:
                            if (tahmin > rasgeleSayi && yorum==7){

                                textViewYardim.setText("Dedik sana o kadar azalt diye son hakkın düzgün tahmin et god kafalı");

                            }
                            if (tahmin < rasgeleSayi && yorum==7){

                                textViewYardim.setText("Arttır");
                            }
                            if (tahmin > rasgeleSayi && yorum==8){

                                textViewYardim.setText("Azalt arkadaşım azalt :D");
                            }
                            if (tahmin < rasgeleSayi && yorum==8){

                                textViewYardim.setText("Arttır dedik ya sana niye arttırmıyon :)");
                            }
                            if (tahmin > rasgeleSayi && yorum==9){

                                textViewYardim.setText("Son hak god kafalı azalt");
                            }
                            if (tahmin < rasgeleSayi && yorum==9){

                                textViewYardim.setText("Arttır arkadaşım arttır");
                            }
                            if (tahmin > rasgeleSayi && yorum==10){

                                textViewYardim.setText("azalt dostum azalt az kaldı bak");
                            }
                            if (tahmin < rasgeleSayi && yorum==10){

                                textViewYardim.setText("İt sıçmağa o kadar arttır diyoz sana");
                            }
                            if (tahmin > rasgeleSayi && yorum==11){

                                textViewYardim.setText("Azalt dedik ya sana niye azaltmıyon :)");
                            }
                            if (tahmin < rasgeleSayi && yorum==11){

                                textViewYardim.setText("Tipini sevdiğim arttır da");
                            }
                            if (tahmin > rasgeleSayi && yorum==12){

                                textViewYardim.setText("Azalt");
                            }
                            if (tahmin < rasgeleSayi && yorum==12){

                                textViewYardim.setText("Dedik sana o kadar arttır diye son hakkın düzgün tahmin et god kafalı");
                            }
                            if (tahmin > rasgeleSayi && yorum==13){

                                textViewYardim.setText("Son hakkın god kafalı düzgün tahmin et azaltacan da");
                            }
                            if (tahmin < rasgeleSayi && yorum==13){

                                textViewYardim.setText("Uy nenem da arttır da bul sayıyı");
                            }
                            if (tahmin > rasgeleSayi && yorum==14){

                                textViewYardim.setText("aferim sana sırayı bozmadın arttır azalt arttır azalt bu şekil devam son hakkın doğru azalt bakım ;)");
                                textViewYardim.setTextSize(20);
                            }
                            if (tahmin < rasgeleSayi && yorum==14){

                                textViewYardim.setText("La totoş arttır da bul sayıyı da");
                            }
                            break;
                    }
                        textViewKalanHak.setText("Kalan Hak : "+Sayac);


                }else{

                    Intent i = new Intent(TahminActivity.this,SonucActivity.class);
                    i.putExtra("sonuc",false);
                    startActivity(i);
                    finish();
                }
                editTextGirdi.setText("");
            }
        });
    }
}
