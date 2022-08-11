package com.example.demoaplikasi_1151;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ExplicitActivity extends AppCompatActivity {
    String nilai_nim, nilai_nama;
    EditText etNim, etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        //hubungkan objek .java dengan objek .xml
        etNim = (EditText) findViewById(R.id.etNim);
        etNama = (EditText) findViewById(R.id.etNama);

        //mengambil nilai data yang dikirimkan dari file ActivityMain.java
        // data dikirim dari variabel data1 berisi data nim
        // data dikirim dari variabel data2 berisi data nama
        // tampilkan data nim dan nama ke objek etNim dan etNama
        etNim.setText(getIntent().getStringExtra("data1"));
        etNama.setText(getIntent().getStringExtra("data2"));
    }
}