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
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.Toast;

public class DropdownList extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    Button botaoIr5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dropdown_list);

        botaoIr5 = findViewById(R.id.button_go6);
        botaoIr5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DropdownList.this, Lista.class);
                startActivity(i);
            }
        });

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String> (DropdownList.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent i1 = new Intent(DropdownList.this, MainActivity.class);
                startActivity(i1);
                return true;
            case R.id.item2:
                Intent i2 = new Intent(DropdownList.this, EditText.class);
                startActivity(i2);
                return true;
            case R.id.item3:
                Intent i3 = new Intent(DropdownList.this, ToggleButton.class);
                startActivity(i3);
                return true;
            case R.id.item4:
                Intent i4 = new Intent(DropdownList.this, DropdownList.class);
                startActivity(i4);
                return true;
            case R.id.item5:
                Intent i5 = new Intent(DropdownList.this, Lista.class);
                startActivity(i5);
                return true;
            case R.id.item6:
                Intent i6 = new Intent(DropdownList.this, TelaGoToTab_GoToGrid.class);
                startActivity(i6);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void showPopup(View view){
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.op1:
                Toast.makeText(this, "Você Selecionou 'Manhã'", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.op2:
                Toast.makeText(this, "Você Selecionou 'Tarde'", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.op3:
                Toast.makeText(this, "Você Selecionou 'Noite'", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}