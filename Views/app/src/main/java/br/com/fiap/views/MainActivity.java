package br.com.fiap.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkEstouAprendendo;
    RadioGroup rdgDificuldade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkEstouAprendendo = findViewById(R.id.chlEstouAprendendo);
        rdgDificuldade = findViewById(R.id.rdgDificuldade);

    }

    public void salvar(View view) {
        boolean checado = chkEstouAprendendo.isChecked();
        Toast.makeText(this,
                       "Estou aprendendo?" + checado,
                        Toast.LENGTH_LONG).show();



        String msg="";
        int id = rdgDificuldade.getCheckedRadioButtonId();



        switch (id){
            case R.id.rdbFacil:
                msg= getString(R.string.facil_selecionado);
                break;

            case R.id.rdbMedio:
                msg=getString(R.string.medio_selecionado);
                break;
            case R.id.rdbDificil:
                msg=getString(R.string.dificil_selecionado);
                break;
            default:
                msg =getString(R.string.nada_selecionado);
        }


        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }


}
