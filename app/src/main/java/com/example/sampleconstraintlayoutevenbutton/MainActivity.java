package com.example.sampleconstraintlayoutevenbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Variabel untuk button
    Button btnLogin;

    //Deklarasi Variabel untuk edit text
    EditText edemail, edpassword;

    //Deklarasi variabel  untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen  button pada Layout
        btnLogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick oada button btnlogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menyimpan input user di edittext email ke dalam variabel
                nama = edemail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                if (nama.equals("admin@mail.com") && password.equals("123")){
                    Toast.makeText(MainActivity.this, "Login Sukses",Toast.LENGTH_LONG).show();
                }
                else if (nama.equals("admin1@mail.com") && password.equals(password)){
                    Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_LONG).show();
                }
                else if (nama.equals(nama) && password.equals("123")){
                    Toast.makeText(MainActivity.this, "Email Salah",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Email dan paswword Salah",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}

