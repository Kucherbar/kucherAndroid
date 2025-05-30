package com.example.kucherandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DBMatches {

    public static final String TABLE_NAME = "matches";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_TEAM_2 = "team_2";
    public static final String COLUMN_TEAM_1 = "team_1";
    public static final String COLUMN_POINT_2 = "point_2";
    public static final String COLUMN_POINT_1 = "point_1";
    public static final int NUM_COLUMN_ID = 0;
    public static final int NUM_COLUMN_TEAM_2 = 1;
    public static final int NUM_COLUMN_TEAM_1 = 2;
    public static final int NUM_COLUMN_POINT_2 = 3;
    public static final int NUM_COLUMN_POINT_1 = 4;

    private SQLiteDatabase db;
    public DBMatches(Context context) {
        DBHelper dbh = new DBHelper(context);
        db = dbh.getWritableDatabase();
    }


    public long Insert(Match m) {
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_TEAM_1, m.getTeam1());
        cv.put(COLUMN_POINT_1, m.getPoint1());
        cv.put(COLUMN_TEAM_2, m.getTeam2());
        cv.put(COLUMN_POINT_2, m.getPoint2());
        int id = (int) db.insert(TABLE_NAME, null, cv);
        m.setId(id);
        return id;
    }
    public Match select(long id) {
        Cursor mCursor = db.query(TABLE_NAME, null, COLUMN_ID + " = ?", new String[]{String.valueOf(id)}, null, null, null);

        mCursor.moveToFirst();
        String TeamHome = mCursor.getString(NUM_COLUMN_TEAM_1);
        String TeamGuest = mCursor.getString(NUM_COLUMN_TEAM_2);
        int GoalsHome = mCursor.getInt(NUM_COLUMN_POINT_1);
        int GoalsGuest=mCursor.getInt(NUM_COLUMN_POINT_2);
        return new Match((int)id, TeamHome, TeamGuest, GoalsHome,GoalsGuest);
    }

    public ArrayList<Match> selectAll() {
        Cursor mCursor = db.query(TABLE_NAME, null, null, null, null, null, null);

        ArrayList<Match> arr = new ArrayList<Match>();
        mCursor.moveToFirst();
        if (!mCursor.isAfterLast()) {
            do {
                long id = mCursor.getLong(NUM_COLUMN_ID);
                String TeamHome = mCursor.getString(NUM_COLUMN_TEAM_1);
                String TeamGuest = mCursor.getString(NUM_COLUMN_TEAM_2);
                int GoalsHome = mCursor.getInt(NUM_COLUMN_POINT_1);
                int GoalsGuest=mCursor.getInt(NUM_COLUMN_POINT_2);
                arr.add(new Match((int)id, TeamHome, TeamGuest, GoalsHome,GoalsGuest));
            } while (mCursor.moveToNext());
        }
        return arr;
    }
}
