package com.example.restoranyogiyo_016;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvResto;
    private RestoDrawAdapter adapter;
    TextView textView;
    ScrollView scrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RestoDraw.init();

        //rvResto=findViewById(R.id.rv_Resto);
        //adapter = new RestoDrawAdapter(this );

        //rvResto.setAdapter(adapter);
        //rvResto.setLayoutManager(new LinearLayoutManager(this ));
    }
}