package br.ufc.quixada.dadm.entrega01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Som extends AppCompatActivity {
    MediaPlayer player;
    Button botaoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som);

        player = MediaPlayer.create (this, R.raw.mariobros);

        botaoBack = findViewById(R.id.button_back);
        botaoBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Som.this,ToggleButton.class);
                startActivity(i);
            }
        });
    }

    public void play(View v){

        player.start();
    }

    public void stop(View v){
        player.stop();
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
                Intent i1 = new Intent(Som.this, MainActivity.class);
                startActivity(i1);
                return true;
            case R.id.item2:
                Intent i2 = new Intent(Som.this, EditText.class);
                startActivity(i2);
                return true;
            case R.id.item3:
                Intent i3 = new Intent(Som.this, ToggleButton.class);
                startActivity(i3);
                return true;
            case R.id.item4:
                Intent i4 = new Intent(Som.this, DropdownList.class);
                startActivity(i4);
                return true;
            case R.id.item5:
                Intent i5 = new Intent(Som.this, Lista.class);
                startActivity(i5);
                return true;
            case R.id.item6:
                Intent i6 = new Intent(Som.this, TelaGoToTab_GoToGrid.class);
                startActivity(i6);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}