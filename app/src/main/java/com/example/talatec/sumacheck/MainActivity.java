package com.example.talatec.sumacheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText varTxtNum1;
    EditText varTxtNum2;
    RadioButton varRdSuma;
    RadioButton varRdResta;
    RadioButton varRdMultiplicacion;
    RadioButton varRdDivision;
    Button varButton;
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Log.e("PRUEBAS","Mi app se esta iniciando");
        //Toast.makeText(this,"paso algo",Toast.LENGTH_SHORT).show();

        varTxtNum1 = (EditText) findViewById(R.id.txtNum1);
        varTxtNum2 = (EditText) findViewById(R.id.txtNum2);

        varRdSuma = (RadioButton) findViewById(R.id.rdSuma);
        varRdResta = (RadioButton) findViewById(R.id.rdResta);

        varRdMultiplicacion = (RadioButton) findViewById(R.id.rdMult);
        varRdDivision = (RadioButton) findViewById(R.id.rdDiv);

        varButton = (Button) findViewById(R.id.btnOperacion);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        //Evento del boton

        varButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                double resultado = 0;
                double num1 =Double.parseDouble(varTxtNum1.getText().toString());
                double num2 =Double.parseDouble(varTxtNum2.getText().toString());
                if(varRdSuma.isChecked()){
                    resultado = num1 + num2;
                }else if(varRdResta.isChecked()){
                    resultado = num1-num2;
                }else if(varRdMultiplicacion.isChecked()){
                    resultado = num1 * num2;
                }else if(varRdDivision.isChecked()){
                    resultado = num1 / num2;
                }

                txtResultado.setText("El resultado es: "+resultado);

            }
        });

    }



}
