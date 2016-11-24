package com.example.a5alumno.menumanagermga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView pulsame_TxtView = (TextView) findViewById(R.id.textView2);
        //registerForContextMenu(pulsame_TxtView);
        pulsame_TxtView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                registerForContextMenu(view);
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuInflater = this.getMenuInflater();
        mMenuInflater.inflate(R.menu.main_menu, menu);
                return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id1:
                Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);
                return true;
            case R.id.idgato:
                Toast.makeText(this, "Gatete", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.idcaballo:
                Toast.makeText(this, "Cabaliño", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.idperrete:
                Toast.makeText(this, "Perrete", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.idlajarto:
                Toast.makeText(this, "Puta mierda de menu", Toast.LENGTH_SHORT).show();
                return true;
            default:
               return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater mContMenuInflater = this.getMenuInflater();
        mContMenuInflater.inflate(R.menu.main_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id1:
                Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);
                return true;
            case R.id.idgato:
                Toast.makeText(this, "Gatete again", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.idcaballo:
                Toast.makeText(this, "Cabaliño again", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.idperrete:
                Toast.makeText(this, "Perrete outra ves", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.idlajarto:
                Toast.makeText(this, "Puta mierda de menu contextual", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
