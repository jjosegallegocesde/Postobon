package com.example.postobon;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListaAdaptador extends RecyclerView.Adapter<ListaAdaptador.viewHolder> {

    ArrayList<Trabajador> listadeDatos;

    public ListaAdaptador(ArrayList<Trabajador> listadeDatos) {
        this.listadeDatos = listadeDatos;
    }

    @NonNull
    @Override
    public ListaAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaDelItemLista= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lista,parent,false);

        return new viewHolder(vistaDelItemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaAdaptador.viewHolder holder, int position) {
        holder.actualizarDatos(listadeDatos.get(position));

    }

    @Override
    public int getItemCount() {
        return listadeDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreTrabajador;
        ImageView fotoTrabajador;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombreTrabajador=itemView.findViewById(R.id.nombrePerfil);
            fotoTrabajador=itemView.findViewById(R.id.fotoPerfil);
        }

        public void actualizarDatos(Trabajador trabajador) {
            nombreTrabajador.setText(trabajador.getNombreTrabajador());
            fotoTrabajador.setImageResource(trabajador.getFotoTrabajador());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(itemView.getContext(),MainActivity.class);
                    intent.putExtra("datosTrabajador",trabajador);
                    itemView.getContext().startActivity(intent);

                }
            });


        }
    }
}
