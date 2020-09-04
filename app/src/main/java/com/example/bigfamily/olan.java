package com.example.bigfamily;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class olan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olan);
    }

    public void flower(View view) {
        Toast.makeText(this, "You Give Flower ", Toast.LENGTH_SHORT).show();
    }
}
