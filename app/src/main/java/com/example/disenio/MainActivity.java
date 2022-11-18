package com.example.disenio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void siguiente(View view){
        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        EditText txtU = findViewById(R.id.edt1);
        objUsuarioDTO.setUsuario(txtU.getText().toString());
        System.out.println(objUsuarioDTO.getUsuario());
        if(objUsuarioDTO.getUsuario().equals("Leoncio")){
            Intent siguiente = new Intent(this, SegundoActivity.class);
            startActivity(siguiente);
        }else{
            Intent siguiente = new Intent(this, TercerActivity.class);
            startActivity(siguiente);
        }
    }
}