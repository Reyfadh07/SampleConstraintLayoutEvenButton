package com.example.sampleconstraintlayoutevenbutton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActifity extends AppCompatActivity{
    //Deklarasi variabel dengan tipe data edit text
    EditText edtNama, edtAlamat,edtEmail, edtPassword, edtrepass;

    //Deklarasi Variabel dengan tipe data floating Action Button
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtNama = findViewById(R.id.edNama);

        edtAlamat = findViewById(R.id.edAlamat);

        edtEmail = findViewById(R.id.edEmail);

        edtPassword = findViewById(R.id.edPass);

        edtrepass = findViewById(R.id.edrepass);

        fab = findViewById(R.id.fabSimpan);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edtNama.getText().toString().isEmpty() ||
                edtAlamat.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtPassword.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty())
                {
                    Snackbar.make(view, "Wajib Isi Seluruh Data Bro!!!",Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if ( edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(DaftarActifity.this, "Pendaftaran Berhasil !!!",
                                Toast.LENGTH_SHORT).show();

                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(view,"Passwprd dan Repassword harus sama !!",
                                Snackbar.LENGTH_LONG).show();
                    }
                }

            }
        });


    }
}
