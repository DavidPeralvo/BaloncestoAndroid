package com.example.davidperalvogomez.basketapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    public void send(View view){
        EditText local=(EditText)findViewById(R.id.editTextLoc);
        EditText visitante=(EditText)findViewById(R.id.editTextVisit);
        Intent intent=new Intent(MainActivity.this, activityInicial.class);
        Bundle localb=new Bundle();
        Bundle visitanteb=new Bundle();
        visitanteb=new Bundle();
        visitanteb.putString("Visitante",visitante.getText().toString());
        localb.putString("Local", local.getText().toString());
        intent.putExtras(visitanteb);
        intent.putExtras(localb);
        startActivity(intent);

    }





}
