package br.ufc.quixada.dadm.entrega01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToggleButton extends AppCompatActivity {
    Button botaoIr3;
    Button botaoIr4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        botaoIr3 = findViewById(R.id.button_go3);
        botaoIr3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ToggleButton.this,Som.class);
                startActivity(i);
            }
        });

        botaoIr4 = findViewById(R.id.button_go6);
        botaoIr4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ToggleButton.this,DropdownList.class);
                startActivity(i);
            }
        });

        Button blong = (Button) findViewById(R.id.button_long);
        blong.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(),
                        "Você conseguiu um clique longo :)", 2000).show();
                return true;
            }
        });
        blong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "Esse clique não foi tão longo :(",
                        1000).show();
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
                Intent i1 = new Intent(ToggleButton.this, MainActivity.class);
                startActivity(i1);
                return true;
            case R.id.item2:
                Intent i2 = new Intent(ToggleButton.this, EditText.class);
                startActivity(i2);
                return true;
            case R.id.item3:
                Intent i3 = new Intent(ToggleButton.this, ToggleButton.class);
                startActivity(i3);
                return true;
            case R.id.item4:
                Intent i4 = new Intent(ToggleButton.this, DropdownList.class);
                startActivity(i4);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

}
