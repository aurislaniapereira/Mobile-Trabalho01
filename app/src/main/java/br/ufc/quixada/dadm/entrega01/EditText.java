package br.ufc.quixada.dadm.entrega01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class EditText extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    List<String> names;
    Button botaoIr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        botaoIr2 = findViewById(R.id.button_go2);
        botaoIr2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EditText.this,ToggleButton.class);
                startActivity(i);
            }
        });

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        names = new ArrayList<>();
            names.add("Acre");
            names.add("Alagoas");
            names.add("Amapá");
            names.add("Amazonas");
            names.add("Bahia");
            names.add("Ceara");
            names.add("Distrito Federal");
            names.add("Espirito Santo");
            names.add("Goias");
            names.add("Maranhao");
            names.add("Mato Grosso do Sul");
            names.add("Minas Gerais");
            names.add("Para");
            names.add("Paraiba");
            names.add("Parana");
            names.add("Pernambuco");
            names.add("Piaui");
            names.add("Rio de Janeiro");
            names.add("Rio Grande do Norte");
            names.add("Rio Grande do Sul");
            names.add("Rondonia");
            names.add("Roraima");
            names.add("Santa Catarina");
            names.add("Sao Paulo");
            names.add("Sergipe");
            names.add("Tocantins");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1, names);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(2);


        final RadioButton masc = (RadioButton) findViewById(R.id.radioButtomM);
        RadioButton fem = (RadioButton) findViewById(R.id.radioButtomF);
        Button ok = (Button) findViewById(R.id.play);

        ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(masc.isChecked()){
                    Toast.makeText(getApplicationContext(), "elemento masculino marcado!", Toast.LENGTH_SHORT).show();
                }
                if (fem.isChecked()){
                    Toast.makeText(getApplicationContext(), "elemento feminino marcado!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent i1 = new Intent(EditText.this, MainActivity.class);
                startActivity(i1);
                return true;
            case R.id.item2:
                Intent i2 = new Intent(EditText.this, EditText.class);
                startActivity(i2);
                return true;
            case R.id.item3:
                Intent i3 = new Intent(EditText.this, ToggleButton.class);
                startActivity(i3);
                return true;
            case R.id.item4:
                Intent i4 = new Intent(EditText.this, DropdownList.class);
                startActivity(i4);
                return true;
            case R.id.item5:
                Intent i5 = new Intent(EditText.this, Lista.class);
                startActivity(i5);
                return true;
            case R.id.item6:
                Intent i6 = new Intent(EditText.this, TelaGoToTab_GoToGrid.class);
                startActivity(i6);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

}