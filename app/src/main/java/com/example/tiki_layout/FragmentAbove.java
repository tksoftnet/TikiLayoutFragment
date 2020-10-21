package com.example.tiki_layout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentAbove extends Fragment {

    Button btnApply;
    EditText edtMagiamgia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View viewAbove = inflater.inflate(R.layout.fragment_above, container, false);
        //anh xa
        btnApply = viewAbove.findViewById(R.id.btnApply);
        edtMagiamgia = viewAbove.findViewById(R.id.edtMagiamgia);


        btnApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtMagiamgia.setText("This is fragment event!");
            }
        });


        return viewAbove;
    }
}
