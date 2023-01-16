package com.example.nutoat;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

    public class DbHelper extends SQLiteOpenHelper {
        private static final int DATABASE_VERSION = 1;
        private static final String DATABASE_NAME = "NutOat.db";
        private static final String TABLE_NAME = "InformationStudent";
        private static final String COLUMN_ID = "id";
        private static final String COLUMN_Name = "name";
        private static final String COLUMN_TS = "time_stamp";
        private static final String COLUMN_Pass = "password";
        private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS "
                + TABLE_NAME
                + "(" + COLUMN_ID
                + " INTEGER PRIMARY KEY, " + COLUMN_Name + " TEXT, " + COLUMN_Pass + " INTEGER, " + COLUMN_TS + " TEXT)";

        private static final String CREATE_UNIQUE_INDEX = "CREATE UNIQUE INDEX IF NOT EXISTS "
                + COLUMN_Name
                + " ON " + TABLE_NAME
                + "(" + COLUMN_Name + ")";

        public DbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }
        @Override
        public  void onCreate(android.database.sqlite.SQLiteDatabase db) {
            db.execSQL(CREATE_TABLE);
            db.execSQL(CREATE_UNIQUE_INDEX);
        }
        @Override
        public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(db);
        }
        public void addVisitor(Visitor visitor){
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put(COLUMN_Name, visitor.getName());

            cv.put(COLUMN_TS, visitor.getTime_stamp());
            db.insert(TABLE_NAME, null, cv);
            db.close();
        }
        public List <String>getVisitor(String COL){
            List<String> list = new ArrayList<>();
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.rawQuery(String.format("SELECT %s FROM %s", COL, TABLE_NAME), null);
            if (cursor.moveToFirst()){
                do {
                    list.add(cursor.getString(0));
                }while (cursor.moveToNext());
            }
            cursor.close();
            db.close();
            return list;
        }
    }
