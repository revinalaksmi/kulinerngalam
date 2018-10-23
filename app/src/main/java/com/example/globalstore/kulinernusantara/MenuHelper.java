package com.example.globalstore.kulinernusantara;



import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MenuHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "kulinerngalam.db";
    private static final int DATABASE_VERSION = 1;

    private static final String ID = "id";
    private static final String NAMA = "nama";
    private static final String JENIS = "jenis";
    private static final String HARGA = "harga";
    private static final String BAHAN = "bahan";
    private static final String REVIEW = "review";

    private static final String CREATE_TABLE_MENU = "CREATE TABLE menu (" +
            ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " +
            NAMA + " VARCHAR(50), " +
            JENIS + " VARCHAR(50), " +
            HARGA + " VARCHAR(10), "+
            BAHAN + " VARCHAR(150), "+
            REVIEW + " VARCHAR(200))";

    public MenuHelper(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + DATABASE_NAME;

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_MENU);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(oldVersion<2){
            db.execSQL(DROP_TABLE);
            db.execSQL(CREATE_TABLE_MENU);
        }
    }
}