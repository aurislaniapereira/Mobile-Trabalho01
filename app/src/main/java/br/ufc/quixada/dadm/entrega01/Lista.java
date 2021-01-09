package br.ufc.quixada.dadm.entrega01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista extends AppCompatActivity {
    Button buttonAddNames;
    EditText editNames;
    ListView listOfNames;
    Button botaoIr6;

    List<String> friends = new ArrayList<String>();

    String [] startingList = {"Pedro", "Emy", "Cris", "Lu"};

    ArrayAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        botaoIr6 = findViewById(R.id.button_go6);
        botaoIr6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Lista.this, TelaGoToTab_GoToGrid.class);
                startActivity(i);
            }
        });

        buttonAddNames = findViewById(R.id.buttonAddNames);
        editNames = findViewById(R.id.editTextNames);
        listOfNames = findViewById(R.id.myList);

        friends = new ArrayList<String>(Arrays.asList(startingList));
        ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, friends);

        listOfNames.setAdapter(ad);

        buttonAddNames.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String newName = editNames.getText().toString();
                friends.add(newName);
                Collections.sort(friends);

                ad.notifyDataSetChanged();
            }
        });

        listOfNames.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Lista.this, "pos=" + position + "name= " + friends.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
