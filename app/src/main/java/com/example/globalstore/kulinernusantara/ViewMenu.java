package com.example.globalstore.kulinernusantara;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewMenu extends AppCompatActivity {
    private MenuHelper dbHelper;
    public TextView nama, jenis, harga, bahan, review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_menu);

        Intent intent = getIntent();

        nama = findViewById(R.id.nama);
        jenis = findViewById(R.id.jenis);
        harga = findViewById(R.id.harga);
        bahan = findViewById(R.id.bahan);
        review = findViewById(R.id.review);

        dbHelper = new MenuHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        int id = Integer.parseInt(intent.getStringExtra("id"));
        Cursor cursor = db.rawQuery("SELECT * FROM menu WHERE id="+id,null);
        if (cursor.getCount()>0){
            cursor.moveToPosition(0);
            // Set Variabel dengan Intent
            nama.setText(cursor.getString(1));
            jenis.setText(cursor.getString(2));
            harga.setText("Rp "+cursor.getString(3));
            bahan.setText(cursor.getString(4));
            review.setText(cursor.getString(5));
        }
    }
}
