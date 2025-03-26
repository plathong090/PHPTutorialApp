package com.example.phptutorial;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "database.db";
    private static final int DATABASE_VERSION = 2;

    public static final String User_table = "User_table";
    public static final String UserId_Column = "UserId";
    public static final String Column_Username = "Username";
    public static final String Column_Password = "Password";

    private static final String CREATE_TABLE_USER = "CREATE TABLE " + User_table +
            " (" + UserId_Column + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            Column_Username + " TEXT, " +
            Column_Password + " TEXT);";

    public static final String Quiz_table = "Quiz_table";
    public static final String QuizId_Column = "QuizId";
    public static final String Quizname_Column = "Quizname";
    private static final String CREATE_TABLE_QUIZ = "CREATE TABLE " + Quiz_table +
            " (" + QuizId_Column + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            Quizname_Column + " TEXT);";

    public static final String Score_table = "Score_table";
    public static final String Column_ScoreId = "ScoreId";
    public static final String Column_UserId = "UserId";
    public static final String Column_QuizId = "QuizId";
    public static final String Column_Score = "Score";
    private static final String CREATE_TABLE_SCORE = "CREATE TABLE " + Score_table +
            " (" + Column_ScoreId + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            Column_UserId + " INTEGER , " +
            Column_QuizId + " INTEGER , " +
            Column_Score + " INTEGER);";

    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_USER);
        db.execSQL(CREATE_TABLE_QUIZ);
        db.execSQL(CREATE_TABLE_SCORE);

        String insertQuiz = "INSERT INTO " + Quiz_table + " ( " + Quizname_Column + " ) VALUES " +
                " ('Quiz1') , ('Quiz2') , ('Quiz3') , ('Quiz4') , ('Quiz5') , ('Quiz6') ," +
                " ('Quiz7') , ('Quiz8') , ('Quiz9') , ('Quiz10') , ('Quiz11') , ('Quiz12') ; ";
        db.execSQL(insertQuiz);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + CREATE_TABLE_USER);
        db.execSQL("DROP TABLE IF EXISTS " + CREATE_TABLE_QUIZ);
        db.execSQL("DROP TABLE IF EXISTS " + CREATE_TABLE_SCORE);
        onCreate(db);
    }

    public boolean insertuser(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Column_Username, username);
        values.put(Column_Password, password);

        long result = db.insert(User_table, null, values);
        db.close();
        if (result == -1) return false;
        else return true;
    }

    public Cursor getuser(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor read = db.rawQuery("SELECT " + Column_UserId + "," + Column_Username + " FROM " + User_table +
                " WHERE " + Column_Username + " =? AND " +
                Column_Password + " =?" , new String[]{username,password});
        return (read != null && read.moveToFirst()) ? read : null;
    }
}
