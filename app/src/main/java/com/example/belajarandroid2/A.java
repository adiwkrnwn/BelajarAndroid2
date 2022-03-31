package com.example.belajarandroid2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.belajarandroid2.model.UserModel;

public class A extends AppCompatActivity {

    EditText editNama, editAlamat, editNohp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        editNama = findViewById(R.id.editNama);
        editAlamat = findViewById(R.id.editAlamat);
        editNohp = findViewById(R.id.editNohp);

    }

    public void submit(View view) {
        UserModel user = new UserModel();
        user.setNama(editNama.getText().toString());
        user.setAlamat(editAlamat.getText().toString());
        user.setNohp(editNohp.getText().toString());

        Intent intent = new Intent(this, B.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }
}