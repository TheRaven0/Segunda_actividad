package com.example.kevm.segunda_actividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton = (Button) findViewById(R.id.btn1);
    public View.OnClickListener listenerBoton = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent segunda = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(segunda);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton.setOnClickListener(listenerBoton);
    }
}
