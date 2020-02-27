package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Sortear(View view) {

        TextView textView = findViewById(R.id.texView);
        EditiText editiTextInicial = findViewById(R.id.editTextInicial);
        EditiText editiInicial = findViewById(R.id.editTextInicial);

        int valorInicial = Integer.parseInt(editTextInicial.getText().toString());
        int valorFinal = Integer.parseInt(editiTextInicial.getText().toString());
        int numeroSorteado = new Random().nextInt(boud:valorFinal-valorInicial)+valorFinal);
    }
}
