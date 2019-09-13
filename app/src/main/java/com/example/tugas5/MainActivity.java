package com.example.tugas5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtnFragment = findViewById(R.id.button);
        Button BtnOpen = findViewById(R.id.buttonbukaactivity);

        BtnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ProteinFragment pf = ProteinFragment.newInstance("Hai","para trainer");
                ft.replace(R.id.FrameMain, pf);
                ft.commit();
            }
        });

        BtnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(MainActivity.this, Main4FragmentActivity.class);
                startActivity(inten);
            }
        });


    }
}
