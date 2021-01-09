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

public class TelaGoToTab_GoToGrid extends AppCompatActivity {
    Button botaoIrGrid;
    Button botaoIrTabs;
    Button botaoback4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_go_to_tab__go_to_grid);

        botaoback4 = findViewById(R.id.buttonback4);
        botaoback4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaGoToTab_GoToGrid.this,Lista.class);
                startActivity(i);
            }
        });

        botaoIrGrid = findViewById(R.id.button_goGrid);
        botaoIrGrid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaGoToTab_GoToGrid.this,Tela_Grid.class);
                startActivity(i);
            }
        });

        botaoIrTabs = findViewById(R.id.button_goTabs);
        botaoIrTabs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaGoToTab_GoToGrid.this,Tela_Tabs.class);
                startActivity(i);
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
                Intent i1 = new Intent(TelaGoToTab_GoToGrid.this, MainActivity.class);
                startActivity(i1);
                return true;
            case R.id.item2:
                Intent i2 = new Intent(TelaGoToTab_GoToGrid.this, EditText.class);
                startActivity(i2);
                return true;
            case R.id.item3:
                Intent i3 = new Intent(TelaGoToTab_GoToGrid.this, ToggleButton.class);
                startActivity(i3);
                return true;
            case R.id.item4:
                Intent i4 = new Intent(TelaGoToTab_GoToGrid.this, DropdownList.class);
                startActivity(i4);
                return true;
            case R.id.item5:
                Intent i5 = new Intent(TelaGoToTab_GoToGrid.this, Lista.class);
                startActivity(i5);
                return true;
            case R.id.item6:
                Intent i6 = new Intent(TelaGoToTab_GoToGrid.this, TelaGoToTab_GoToGrid.class);
                startActivity(i6);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}