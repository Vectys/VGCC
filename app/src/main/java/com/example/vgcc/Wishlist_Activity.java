package com.example.vgcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Wishlist_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist_);
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
            case R.id.menu_about:
                Intent aboutpage = new Intent(Wishlist_Activity.this, AboutActivity.class);
                startActivity(aboutpage);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
