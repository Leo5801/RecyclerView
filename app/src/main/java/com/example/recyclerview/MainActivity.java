package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Integer> imagerraylist;
    ArrayList<String> namearraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview1);
        imagerraylist = new ArrayList<>();
        namearraylist = new ArrayList<>();

        imagerraylist.add(R.drawable.a);
        imagerraylist.add(R.drawable.b);
        imagerraylist.add(R.drawable.c);
        imagerraylist.add(R.drawable.d);
        imagerraylist.add(R.drawable.e);
        imagerraylist.add(R.drawable.f);
        imagerraylist.add(R.drawable.g);
        imagerraylist.add(R.drawable.h);

        namearraylist.add("Avatar a");
        namearraylist.add("Avatar b");
        namearraylist.add("Avatar c");
        namearraylist.add("Avatar d");
        namearraylist.add("Avatar e");
        namearraylist.add("Avatar f");
        namearraylist.add("Avatar g");
        namearraylist.add("Avatar h");

    }
}