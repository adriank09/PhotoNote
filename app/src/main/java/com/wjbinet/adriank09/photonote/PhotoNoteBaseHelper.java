package com.wjbinet.adriank09.photonote;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.wjbinet.adriank09.photonote.PhotoNoteDbSchema.PhotoNoteTable;

/**
 * Created by adriank09 on 2/19/2017.
 */

/*
*   Custom BaseHelper for SQLite to automatically create or upgrade DB
*
*
 */

public class PhotoNoteBaseHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "photoNoteBase.db";

    public PhotoNoteBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + PhotoNoteTable.NAME + "(" +
                " _id integer primary key autoincrement, " +
                PhotoNoteTable.Cols.UUID + ", " +
                PhotoNoteTable.Cols.TITLE + ", " +
                PhotoNoteTable.Cols.DATECREATED
                + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
