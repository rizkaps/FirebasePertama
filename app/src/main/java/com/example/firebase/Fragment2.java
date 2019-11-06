package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {


    View rps;
   TextView txtEmailkirim;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rps = inflater.inflate(R.layout.activity_fragment2,container,false);
        return rps;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtEmailkirim = view.findViewById(R.id.edttextemail);
        //try catch seperti if else. Untuk menerima data dari fragment 3
        try {
            String email = getArguments().getString("email");
            txtEmailkirim.setText(email);
        }
        catch (Exception e) {
        }
    }
}
