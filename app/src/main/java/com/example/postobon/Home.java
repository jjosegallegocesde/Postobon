package com.example.postobon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    //ATRIBUTOS
    ArrayList<Trabajador> listadeTrabajadores= new ArrayList<>();
    RecyclerView listadoGrafico;

    //METODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listadoGrafico=findViewById(R.id.listado);
        listadoGrafico.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crearLista();
        ListaAdaptador adaptador= new ListaAdaptador(listadeTrabajadores);
        listadoGrafico.setAdapter(adaptador);

    }

    private void crearLista(){

        listadeTrabajadores.add(new Trabajador("Sandra perez",R.drawable.avatar1));
        listadeTrabajadores.add(new Trabajador("Raul Motoa",R.drawable.avatar2));
        listadeTrabajadores.add(new Trabajador("Martha Nielsen",R.drawable.avatar3));
        listadeTrabajadores.add(new Trabajador("Byron Mosquera",R.drawable.avatar4));

    }


}