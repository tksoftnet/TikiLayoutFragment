package com.example.tiki_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnTienhanhdathang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final FragmentAbove fragmentAbove = new FragmentAbove();
        final FragmentBelow fragmentBelow = new FragmentBelow();

        btnTienhanhdathang = findViewById(R.id.btnTienhanhdathang);

//        getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.frm_above, fragmentAbove, "fragmentAbove")
//                .commit();

        btnTienhanhdathang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragment
                        = getSupportFragmentManager()
                        .findFragmentByTag("fragmentAbove");

                if(fragment!=null){
                    Toast.makeText(MainActivity.this, "Exist!", Toast.LENGTH_SHORT).show();
                }


            }
        });



//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.frm_below,fragmentBelow);
//        fragmentTransaction.commit();








    }
}