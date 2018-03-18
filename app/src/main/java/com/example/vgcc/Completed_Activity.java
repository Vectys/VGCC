package com.example.vgcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Completed_Activity extends AppCompatActivity {
    ListView games_list;
    ArrayAdapter<String> listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_);
        games_list = (ListView) findViewById(R.id.completed_games_list);
        ArrayList<String> GameList = new ArrayList<String>();


    }
    public boolean onCreateOptionsMenu(Menu menu){//options menu; displays an about page and a back button
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()){
            case R.id.menu_BackButton:
                finish();
                return true;
            case R.id.menu_about:
                Intent aboutpage = new Intent(Completed_Activity.this, AboutActivity.class);
                startActivity(aboutpage);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
