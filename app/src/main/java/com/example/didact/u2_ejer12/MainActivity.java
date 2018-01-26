package com.example.didact.u2_ejer12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declarar

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);

        //Texto

        tv1.setText("Haz click");
        tv2.setText("Haz click");
        tv3.setText("Haz click");
        tv4.setText("Haz click");



    } //FIN OnCreate

    public void imgAvionPapel (View view){
        tv1.setText("Has pulsado en el Avion de Papel");
    }
    public void imgNave (View view){
        tv2.setText("Has pulsado en el Cohete");
    }
    public void imgPC (View view){
        tv3.setText("Has pulsado en el Ordenador");
    }
    public void imgTienda (View view){
        tv4.setText("Has pulsado en la Tienda");
    }
    public void imgDelete (View view){
        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
        tv4.setText("");
    }


} //FIN ActivityMain
