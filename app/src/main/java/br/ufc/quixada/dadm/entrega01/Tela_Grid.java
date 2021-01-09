package br.ufc.quixada.dadm.entrega01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Tela_Grid extends AppCompatActivity {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    Adapter adapter;
    Button botaoBack2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela__grid);

        botaoBack2 = findViewById(R.id.button_back2);
        botaoBack2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tela_Grid.this, TelaGoToTab_GoToGrid.class);
                startActivity(i);
            }
        });

        dataList = findViewById(R.id.dataList);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("First item");
        titles.add("Second item");
        titles.add("Third item");
        titles.add("Fourth item");

        images.add(R.drawable.ic_android);
        images.add(R.drawable.ic_baseline_add_shopping_cart_24);
        images.add(R.drawable.ic_baseline_accessible);
        images.add(R.drawable.ic_baseline_add_reaction_24);

        adapter = new Adapter(this, titles, images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4, GridLayoutManager.HORIZONTAL, false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
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
                Intent i1 = new Intent(Tela_Grid.this, MainActivity.class);
                startActivity(i1);
                return true;
            case R.id.item2:
                Intent i2 = new Intent(Tela_Grid.this, EditText.class);
                startActivity(i2);
                return true;
            case R.id.item3:
                Intent i3 = new Intent(Tela_Grid.this, ToggleButton.class);
                startActivity(i3);
                return true;
            case R.id.item4:
                Intent i4 = new Intent(Tela_Grid.this, DropdownList.class);
                startActivity(i4);
                return true;
            case R.id.item5:
                Intent i5 = new Intent(Tela_Grid.this, Lista.class);
                startActivity(i5);
                return true;
            case R.id.item6:
                Intent i6 = new Intent(Tela_Grid.this, TelaGoToTab_GoToGrid.class);
                startActivity(i6);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}