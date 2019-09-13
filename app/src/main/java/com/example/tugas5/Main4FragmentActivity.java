package com.example.tugas5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_fragment);

        Button BtnFragment1 = findViewById(R.id.BtnFrag1);
        Button BtnFragment2 = findViewById(R.id.BtnFrag2);
        Button BtnFragment3 = findViewById(R.id.BtnFrag3);

        BtnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.FrameMain4, new Protein2Fragment());
                ft.commit();
            }
        });

        BtnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.FrameMain4, new TableFragment());
                ft.commit();
            }
        });

        BtnFragment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.FrameMain4, new Protein3Fragment());
                ft.commit();
            }
        });
    }
}
