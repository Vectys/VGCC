package com.example.vgcc;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class add_game extends AppCompatActivity {
    private EditText e_hours_played;
    private EditText e_game_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_game);
        e_hours_played = findViewById(R.id.hours_played);
        e_game_name = findViewById(R.id.game_name);
    }

    public void save_game(){
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.backmenu, menu);
        return true;
    }

    public boolean OnOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.BackButton:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
