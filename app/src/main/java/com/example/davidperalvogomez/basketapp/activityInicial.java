package com.example.davidperalvogomez.basketapp;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activityInicial extends AppCompatActivity {
    private TextView tvLocal,tvVisitante,local,visitante;
    private Button boton1local,boton2local,boton3local,boton1visitante,boton2visitante,boton3visitante,botonrestarlocal,botonrestarvisitante,botonreset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_inicial);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_activity_inicial);
        Bundle bundle=this.getIntent().getExtras();


        tvLocal=(TextView)findViewById(R.id.textViewmlocal);
        tvVisitante=(TextView)findViewById(R.id.textViewmvisitante);
        local=(TextView)findViewById(R.id.textViewLocal);
        visitante=(TextView)findViewById(R.id.textViewVisitante);
        visitante.setText(bundle.getString("Visitante"));
        local.setText(bundle.getString("Local"));
        boton1local=(Button)findViewById(R.id.button1local);
        boton1local.setOnClickListener(new Button.OnClickListener() {
            public void onClick (View v) {
                String valorlocal=tvLocal.getText().toString();
                int valor = Integer.parseInt(valorlocal);
                valor=valor+1;
                String resultado=String.valueOf(valor);
                tvLocal.setText(resultado);

            }
        });


        boton2local=(Button)findViewById(R.id.button2local);
        boton2local.setOnClickListener(new Button.OnClickListener() {
            public void onClick (View v) {
                String valorlocal=tvLocal.getText().toString();
                int valor = Integer.parseInt(valorlocal);
                valor=valor+2;
                String resultado=String.valueOf(valor);
                tvLocal.setText(resultado);

            }
        });
        boton3local=(Button)findViewById(R.id.button3local);
        boton3local.setOnClickListener(new Button.OnClickListener() {
            public void onClick (View v) {
                String valorlocal=tvLocal.getText().toString();
                int valor = Integer.parseInt(valorlocal);
                valor=valor+3;
                String resultado=String.valueOf(valor);
                tvLocal.setText(resultado);

            }
        });
        boton1visitante=(Button)findViewById(R.id.button1visitante);
        boton1visitante.setOnClickListener(new Button.OnClickListener() {
            public void onClick (View v) {
                String valorlocal=tvVisitante.getText().toString();
                int valor = Integer.parseInt(valorlocal);
                valor=valor+1;
                String resultado=String.valueOf(valor);
                tvVisitante.setText(resultado);

            }
        });
        boton2visitante=(Button)findViewById(R.id.button2visitante);
        boton2visitante.setOnClickListener(new Button.OnClickListener() {
            public void onClick (View v) {
                String valorlocal=tvVisitante.getText().toString();
                int valor = Integer.parseInt(valorlocal);
                valor=valor+2;
                String resultado=String.valueOf(valor);
                tvVisitante.setText(resultado);

            }
        });
        boton3visitante=(Button)findViewById(R.id.button3visitante);
        boton3visitante.setOnClickListener(new Button.OnClickListener() {
            public void onClick (View v) {
                String valorlocal=tvVisitante.getText().toString();
                int valor = Integer.parseInt(valorlocal);
                valor=valor+3;
                String resultado=String.valueOf(valor);
                tvVisitante.setText(resultado);

            }
        });
        botonrestarlocal=(Button)findViewById(R.id.buttonrestar);
        botonrestarlocal.setOnClickListener(new Button.OnClickListener() {
            public void onClick (View v) {
                String valorlocal=tvLocal.getText().toString();
                int valor = Integer.parseInt(valorlocal);
                if(valor<=0){

                }
                else{
                    valor=valor-1;}
                String resultado=String.valueOf(valor);
                tvLocal.setText(resultado);

            }
        });
        botonrestarvisitante=(Button)findViewById(R.id.buttonrestarvi);
        botonrestarvisitante.setOnClickListener(new Button.OnClickListener() {
            public void onClick (View v) {
                String valorlocal=tvVisitante.getText().toString();
                int valor = Integer.parseInt(valorlocal);
                if(valor<=0){

                }
                else{
                    valor=valor-1;}
                String resultado=String.valueOf(valor);
                tvVisitante.setText(resultado);

            }
        });
        botonreset=(Button)findViewById(R.id.buttonReset);
        botonreset.setOnClickListener(new Button.OnClickListener() {
            public void onClick (View v) {
                tvLocal.setText("0");
                tvVisitante.setText("0");

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_inicial, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
