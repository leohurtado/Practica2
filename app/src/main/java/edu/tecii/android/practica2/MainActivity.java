package edu.tecii.android.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText cant;
    private EditText tasa;
    private EditText periodos;
    private EditText interes;
    private Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cant = (EditText)findViewById(R.id.txtCapital);
        tasa = (EditText)findViewById(R.id.txtTasa);
        periodos = (EditText)findViewById(R.id.txtPeriodos);
        interes = (EditText)findViewById(R.id.txtInteres);
        calc = (Button)findViewById(R.id.btnCalcInt);
    }
    public void calcular (View v){
        String c = cant.getText().toString();
        double ca = Double.parseDouble(c);
        String t = tasa.getText().toString();
        double ta = Double.parseDouble(t);
        String p = periodos.getText().toString();
        double pe = Double.parseDouble(p);
        double monto = ca + Math.pow(1+(ta/100),pe);
        String mon = "" + monto;
        interes.setText(mon);
    }
}
