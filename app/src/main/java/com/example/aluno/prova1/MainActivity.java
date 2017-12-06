package com.example.aluno.prova1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edusuario;
    CheckBox chbsoftware,chbcomercial,chbdesign,chbmobile,chbinfor,chbempreendedorismo,chbdireitoetica;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edusuario= (EditText) findViewById(R.id.edusuario);
        chbsoftware = (CheckBox) findViewById(R.id.chbsoftware);
        chbcomercial= (CheckBox) findViewById(R.id.chbcomercial);
        chbdesign= (CheckBox) findViewById(R.id.chbdesign);
        chbmobile= (CheckBox) findViewById(R.id.chbmobile);
        chbinfor=(CheckBox) findViewById(R.id.chbinfor);
        chbempreendedorismo=(CheckBox) findViewById(R.id.chbempreendedorismo);
        chbdireitoetica=(CheckBox) findViewById(R.id.chbdireitoetica);
        btn= (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //O professor Fabricio pediu pra fazer um comentário
                String nome= edusuario.getText().toString();
                float total = 0;
                if (chbsoftware.isChecked())
                    total += 1;
                if (chbcomercial.isChecked())
                    total += 1;
                if (chbdesign.isChecked())
                    total += 1;
                if (chbmobile.isChecked())
                    total += 1;
                if (chbinfor.isChecked())
                    total += 1;
                if (chbempreendedorismo.isChecked())
                    total += 1;
                if (chbdireitoetica.isChecked())
                    total += 1;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(
                        MainActivity.this);
                dialogo.setTitle("Confirmar");
                dialogo.setMessage("O(a) discente " +nome+ " está matriculado(a) em " +total+ " disciplina(s).");
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }
}
