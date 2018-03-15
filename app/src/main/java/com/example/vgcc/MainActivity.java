package com.example.vgcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){//options menu; displays an about page and a back button
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_BackButton:
                finish();
                return true;
            case R.id.menu_about:
                Intent aboutpage = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutpage);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void To_Completed_Games(View view){
        Intent completed_games = new Intent(MainActivity.this, Completed_Activity.class);
        startActivity(completed_games);
    }

    public void To_Backlogged_Games(View view){
        Intent backlogged_games = new Intent(MainActivity.this, Backlog_Activity.class);
        startActivity(backlogged_games);
    }

    public void To_Wishlisted_Games(View view){
        Intent wishlisted_games = new Intent(MainActivity.this, Wishlist_Activity.class);
        startActivity(wishlisted_games);
    }
}
