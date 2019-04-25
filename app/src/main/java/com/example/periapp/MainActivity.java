package com.example.periapp;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText buscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT > 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        setContentView(R.layout.activity_main);



    }
    public void elemento(View view){
        btn=findViewById(view.getId());
        int k=((ColorDrawable)btn.getBackground()).getColor();
        String element= btn.getText().toString();
        element=element.replace("btn","");
        Intent elemento=new Intent(this,PantallaElemento.class);
        elemento.putExtra("element",element);
        elemento.putExtra("Color",k);
        System.out.println(k);
        int k2= btn.getCurrentTextColor();
        elemento.putExtra("ColorText",k2);
        startActivity(elemento);
    }
    public  void Buscar(View view){

        buscar=findViewById(R.id.Buscar);
        String elem=buscar.getText().toString();
        if(!elem.isEmpty()){

            AdminSqlLiteOpenHelper admin= new AdminSqlLiteOpenHelper(this, "elementos",null,1);
            SQLiteDatabase db=admin.getWritableDatabase();
            Cursor fila=db.rawQuery("Select simbolo_elem from elemento where simbolo_elem='"+elem+"'",null);
            if(fila.moveToFirst()){

                ArrayList<Button> btns=Vector();
                String p=fila.getString(0);
                Toast.makeText(this,p,Toast.LENGTH_SHORT).show();

                for (int i=0;i<btns.size();i++){
                    String k=btns.get(i).getText().toString();
                    if(k.equalsIgnoreCase(p)){
                        elemento(btns.get(i));
                    }
                }

            }
            else{
                fila=db.rawQuery("Select simbolo_elem from elemento where nom_elem='"+elem+"'",null);
                if(fila.moveToFirst()){
                    ArrayList<Button> btns=Vector();
                    for (int i=0;i<btns.size();i++){
                        if(btns.get(i).getText().toString().equalsIgnoreCase(fila.getString(0))){
                            elemento(btns.get(i));
                        }
                    }

                }


            }


        }
        else{
            Toast.makeText(this,"Escribir algo en la barra de busqueda",Toast.LENGTH_SHORT).show();
        }





    }

    public ArrayList<Button> Vector(){
        ArrayList<Button> btns=new ArrayList<Button>();
        btns.add((Button) findViewById(R.id.btnAc));
        btns.add((Button) findViewById(R.id.btnAg));
        btns.add((Button) findViewById(R.id.btnAm));
        btns.add((Button) findViewById(R.id.btnAr));
        btns.add((Button) findViewById(R.id.btnAt));
        btns.add((Button) findViewById(R.id.btnAu));
        btns.add((Button) findViewById(R.id.btnB));
        btns.add((Button) findViewById(R.id.btnBe));
        btns.add((Button) findViewById(R.id.btnBh));
        btns.add((Button) findViewById(R.id.btnBi));
        btns.add((Button) findViewById(R.id.btnBk));
        btns.add((Button) findViewById(R.id.btnBr));
        btns.add((Button) findViewById(R.id.btnC));
        btns.add((Button) findViewById(R.id.btnCa11));
        btns.add((Button) findViewById(R.id.btnCa12));
        btns.add((Button) findViewById(R.id.btnCa48));
        btns.add((Button) findViewById(R.id.btnCAs));
        btns.add((Button) findViewById(R.id.btnCd));
        btns.add((Button) findViewById(R.id.btnCe));
        btns.add((Button) findViewById(R.id.btnCf));
        btns.add((Button) findViewById(R.id.btnCl));
        btns.add((Button) findViewById(R.id.btnCm));
        btns.add((Button) findViewById(R.id.btnCn));
        btns.add((Button) findViewById(R.id.btnCo));
        btns.add((Button) findViewById(R.id.btnCR));
        btns.add((Button) findViewById(R.id.btnCu));
        btns.add((Button) findViewById(R.id.btnDb));
        btns.add((Button) findViewById(R.id.btnDs));
        btns.add((Button) findViewById(R.id.btnDy));
        btns.add((Button) findViewById(R.id.btnEr));
        btns.add((Button) findViewById(R.id.btnEs));
        btns.add((Button) findViewById(R.id.btnEu));
        btns.add((Button) findViewById(R.id.btnF));
        btns.add((Button) findViewById(R.id.btnFe));
        btns.add((Button) findViewById(R.id.btnFl));
        btns.add((Button) findViewById(R.id.btnFm));
        btns.add((Button) findViewById(R.id.btnGd));
        btns.add((Button) findViewById(R.id.H));
        btns.add((Button) findViewById(R.id.btnH4));
        btns.add((Button) findViewById(R.id.btnH5));
        btns.add((Button) findViewById(R.id.btnH6));
        btns.add((Button) findViewById(R.id.btnH7));
        btns.add((Button) findViewById(R.id.btnH11));
        btns.add((Button) findViewById(R.id.btnH12));
        btns.add((Button) findViewById(R.id.btnH13));
        btns.add((Button) findViewById(R.id.btnHe));
        btns.add((Button) findViewById(R.id.btnHf));
        btns.add((Button) findViewById(R.id.btnHg));
        btns.add((Button) findViewById(R.id.btnHo));
        btns.add((Button) findViewById(R.id.btnHs));
        btns.add((Button) findViewById(R.id.btnI));
        btns.add((Button) findViewById(R.id.btnIn));
        btns.add((Button) findViewById(R.id.btnIr));
        btns.add((Button) findViewById(R.id.btnK));
        btns.add((Button) findViewById(R.id.btnKr));
        btns.add((Button) findViewById(R.id.btnLA));
        btns.add((Button) findViewById(R.id.btnLr));
        btns.add((Button) findViewById(R.id.btnLu));
        btns.add((Button) findViewById(R.id.btnLv));
        btns.add((Button) findViewById(R.id.btnMc));
        btns.add((Button) findViewById(R.id.btnMd));
        btns.add((Button) findViewById(R.id.btnMg));
        btns.add((Button) findViewById(R.id.btnMn));
        btns.add((Button) findViewById(R.id.btnMt));
        btns.add((Button) findViewById(R.id.btnMu));
        btns.add((Button) findViewById(R.id.btnN));
        btns.add((Button) findViewById(R.id.btnNa));
        btns.add((Button) findViewById(R.id.btnNb));
        btns.add((Button) findViewById(R.id.btnNd));
        btns.add((Button) findViewById(R.id.btnNe));
        btns.add((Button) findViewById(R.id.btnNh));
        btns.add((Button) findViewById(R.id.btnNi));
        btns.add((Button) findViewById(R.id.btnNe));
        btns.add((Button) findViewById(R.id.btnNd));
        btns.add((Button) findViewById(R.id.btnNo));
        btns.add((Button) findViewById(R.id.btnNp));
        btns.add((Button) findViewById(R.id.btnO));
        btns.add((Button) findViewById(R.id.btnOg));
        btns.add((Button) findViewById(R.id.btnOs));
        btns.add((Button) findViewById(R.id.btnP));
        btns.add((Button) findViewById(R.id.btnPa));
        btns.add((Button) findViewById(R.id.btnPb));
        btns.add((Button) findViewById(R.id.btnPd));
        btns.add((Button) findViewById(R.id.btnPm));
        btns.add((Button) findViewById(R.id.btnPo));
        btns.add((Button) findViewById(R.id.btnPr));
        btns.add((Button) findViewById(R.id.btnPt));
        btns.add((Button) findViewById(R.id.btnPu));
        btns.add((Button) findViewById(R.id.btnRe));
        btns.add((Button) findViewById(R.id.btnRf));
        btns.add((Button) findViewById(R.id.btnRg));
        btns.add((Button) findViewById(R.id.btnRh));
        btns.add((Button) findViewById(R.id.btnRn));
        btns.add((Button) findViewById(R.id.btnRu));
        btns.add((Button) findViewById(R.id.btnS));
        btns.add((Button) findViewById(R.id.btnSb));

        btns.add((Button) findViewById(R.id.btnSc));
        btns.add((Button) findViewById(R.id.btnSee));
        btns.add((Button) findViewById(R.id.btnSg));
        btns.add((Button) findViewById(R.id.btnSi));
        btns.add((Button) findViewById(R.id.btnSm));
        btns.add((Button) findViewById(R.id.btnSb));
        btns.add((Button) findViewById(R.id.btnSn));
        btns.add((Button) findViewById(R.id.btnTa));
        btns.add((Button) findViewById(R.id.btnTb));
        btns.add((Button) findViewById(R.id.btnTc));
        btns.add((Button) findViewById(R.id.btnTe));
        btns.add((Button) findViewById(R.id.btnTh));
        btns.add((Button) findViewById(R.id.btnTi));
        btns.add((Button) findViewById(R.id.btnTl));
        btns.add((Button) findViewById(R.id.btnTm));
        btns.add((Button) findViewById(R.id.btnTs));
        btns.add((Button) findViewById(R.id.btnU));
        btns.add((Button) findViewById(R.id.btnV));
        btns.add((Button) findViewById(R.id.btnW));
        btns.add((Button) findViewById(R.id.btnXe));
        btns.add((Button) findViewById(R.id.btnY));
        btns.add((Button) findViewById(R.id.btnYb));
        btns.add((Button) findViewById(R.id.btnZn));
        btns.add((Button) findViewById(R.id.btnZr));







        return btns;
    }
}
