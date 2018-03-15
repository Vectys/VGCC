package com.example.vgcc;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.AlertDialog;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    public boolean onCreateOptionsMenu(Menu menu){//options menu; displays an about page and a back button
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.backmenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.BackButton:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
