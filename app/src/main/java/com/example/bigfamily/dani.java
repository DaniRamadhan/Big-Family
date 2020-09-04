package com.example.bigfamily;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class dani extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dani);

    }

    public void flower(View view) {
        Toast.makeText(this, "You Give Flower ", Toast.LENGTH_SHORT).show();
    }
}
