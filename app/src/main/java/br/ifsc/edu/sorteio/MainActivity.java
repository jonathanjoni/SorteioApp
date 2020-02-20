package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText NumInicialC, NumFinalC;
    TextView ResultadoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumInicialC = findViewById(R.id.NumInicial);
        NumFinalC   = findViewById(R.id.NumFinal);
        ResultadoC  = findViewById(R.id.Resultado);
    }

    public void Sortear(View view) {

        int inicial = Integer.parseInt(NumInicialC.getText().toString());

        ResultadoC.setText(Integer.toString(inicial));
    }
}
