package com.example.bigfamily;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class booster extends AppCompatActivity {

    private ArrayList<List> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booster);

        RecyclerView card = findViewById(R.id.rv_family);
        card.setHasFixedSize(true);

        list.addAll(item.getListData());

        card.setLayoutManager(new LinearLayoutManager(this));
        adapter listHeroAdapter = new adapter(list);
        card.setAdapter(listHeroAdapter);
        listHeroAdapter.setOnItemClickCallback(new adapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(List data) {
                Selected(data);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
                Intent browserIntent = new Intent(this,dev_details.class);
                startActivity(browserIntent);
                return true;
        }

    private void Selected(List lang) {
        switch (lang.getName()) {
            case "M Dani Ramadhan" :
                Intent intent = new Intent(this, dani.class);
                startActivity(intent);
                break;
            case "Ibnu" :
                Intent intent1 = new Intent(this, ibnu.class);
                startActivity(intent1);
                break;
            case "Dito Rafie Harjanto" :
                Intent intent2 = new Intent(this, dito.class);
                startActivity(intent2);
                break;
            case "Bambang Eko Yulianto" :
                Intent intent3 = new Intent(this, bambang.class);
                startActivity(intent3);
                break;
            case "Nurul Hidayah" :
                Intent intent4 = new Intent(this, nurul.class);
                startActivity(intent4);
                break;
            case "Lovinda Maylan" :
                Intent intent5 = new Intent(this, vinda.class);
                startActivity(intent5);
                break;
            case "Dwi Ratna Desianti" :
                Intent intent6 = new Intent(this, dwi.class);
                startActivity(intent6);
                break;
            case "Dina Syifa Harjanto" :
                Intent intent7 = new Intent(this, dina.class);
                startActivity(intent7);
                break;
            case "Zafira Ansy" :
                Intent intent8 = new Intent(this, vira.class);
                startActivity(intent8);
                break;
            case "Retno Yuda Iriani" :
                Intent intent9 = new Intent(this, retno.class);
                startActivity(intent9);
                break;
            case "Violinda Yulian" :
                Intent intent10 = new Intent(this, olin.class);
                startActivity(intent10);
                break;
            case "Yolanda Lovia Toscha Aprilia" :
                Intent intent11 = new Intent(this, olan.class);
                startActivity(intent11);
                break;
                
        }
        Toast.makeText(this, "Kamu memilih " + lang.getName(), Toast.LENGTH_SHORT).show();
    }
}
