package com.example.globalstore.kulinernusantara;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class  InsertMenu extends AppCompatActivity {

    private MenuHelper dbHelper;
    private EditText nama, jenis, bahan, harga, review;
    private int id;
    Button simpan, kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_menu);

        dbHelper = new MenuHelper(this);

        nama = findViewById(R.id.editText1);
        jenis = findViewById(R.id.editText2);
        harga = findViewById(R.id.editText3);
        bahan = findViewById(R.id.editText4);
        review = findViewById(R.id.editText5);

        simpan = findViewById(R.id.button1);
        kembali = findViewById(R.id.button2);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("INSERT INTO menu(nama, jenis, harga, bahan, review) values('" +
                        nama.getText().toString() + "', '" +
                        jenis.getText().toString() + "', '" +
                        harga.getText().toString() + "', '" +
                        bahan.getText().toString() + "', '" +
                        review.getText().toString() + "')");
                Toast.makeText(getApplicationContext(), " Menu Berhasil ditambahkan",
                        Toast.LENGTH_LONG).show();

                HomeActivity.layarutama.TampilData();
                finish();
            }
        });

//        kembali ke halaman utama
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                finish();
            }
        });
    }
}

