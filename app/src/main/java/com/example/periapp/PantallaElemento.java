package com.example.periapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PantallaElemento extends AppCompatActivity {
    private TextView simbolo;
    private TextView Desc;
    private TextView Aplic;
    private TextView Periodo;
    private TextView Bloque;
    private TextView Tipo;
    private TextView Grupo;
    private TextView Paises;
    private TextView Titulo;
    private TextView Titulo2;
    private TextView Middle;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_elemento);
        simbolo=(TextView)findViewById(R.id.Elemento);
        Desc=(TextView)findViewById(R.id.Elemento2);
        Aplic=findViewById(R.id.Informacion);
        Periodo=findViewById(R.id.Periodo);
        Bloque=findViewById(R.id.bloque);
        Grupo=findViewById(R.id.Grupo);
        Tipo=findViewById(R.id.tipo);
        Paises=findViewById(R.id.informacion2);
        Titulo=findViewById(R.id.Pais);
        Titulo2=findViewById(R.id.Titulo);
        Middle=findViewById(R.id.middle);
        String dato=getIntent().getStringExtra("element");
        int color=0;
        int color2=0;
        color=getIntent().getIntExtra("Color",color);
        color2=getIntent().getIntExtra("ColorText",color2);

        simbolo.setText(dato);
        simbolo.setBackgroundColor(color);
        simbolo.setTextColor(color2);
        Desc.setBackgroundColor(color);
        Titulo.setBackgroundColor(color);
        Titulo2.setBackgroundColor(color);
        Middle.setBackgroundColor(color);

        //Toast.makeText(this,""+color2,Toast.LENGTH_SHORT).show();
        System.out.println("hola");


        AdminSqlLiteOpenHelper admin= new AdminSqlLiteOpenHelper(this, "elementos",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        Cursor fila=db.rawQuery("Select msAto_elem,nom_elem,tipo_elem,grupo_elem,periodo_elem,bloque_elem from elemento where simbolo_elem='"+dato+"'",null);
        if(fila.moveToFirst()){
            //Toast.makeText(this,"Encontrado",Toast.LENGTH_SHORT).show();
            Desc.setText(fila.getString(1)+"\n"+fila.getString(0));
            if(!fila.getString(2).equalsIgnoreCase("Null")){
            Tipo.setText(fila.getString(2));}
            else{
                Tipo.setText("");
            }
            Grupo.setText("Grupo: "+fila.getString(3));
            Periodo.setText("Periodo: "+fila.getString(4));
            Bloque.setText("Bloque: "+fila.getString(5));


        }

        fila=db.rawQuery("Select apli_apli from aplicaciones where simbolo_elem='"+dato+"'",null);
        String apli="";
        while(fila.moveToNext()){
            apli+="\n";
            apli+=fila.getString(0)+"\n";
        }
        Aplic.setText(apli);
        fila=db.rawQuery("Select pais_pais from Paises where simbolo_elem='"+dato+"'",null);
        String paises="";
        while(fila.moveToNext()){
            paises+=" \n";
            paises+=fila.getString(0)+"\n";
        }
        Paises.setText(paises);




    }
    public void back(View view){
        Intent back=new Intent(this,MainActivity.class);
        startActivity(back);
    }

}
