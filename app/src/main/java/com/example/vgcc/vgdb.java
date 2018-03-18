package com.example.vgcc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.Cursor;


/**
 * Created by User on 3/3/2018.
 */

public class vgdb extends SQLiteOpenHelper {
    private static final String name = "vgdb.db";
    public static final String TABLE_NAME = "Completed Games";
    public static final String COLUMN_NAME = "Name of Game";
    public static final String COLUMN_HOURS ="Hours Played";
    public vgdb(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE = "CREATE TABLE" + TABLE_NAME + "(" + COLUMN_NAME  +
                "STRING PRIMARY KEY" + COLUMN_HOURS +"INTEGER)";
        sqLiteDatabase.execSQL(CREATE_TABLE);

    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        onCreate(sqLiteDatabase);
    }

}
