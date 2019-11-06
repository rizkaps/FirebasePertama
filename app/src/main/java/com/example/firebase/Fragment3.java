package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment3 extends Fragment {

    View rps;
    EditText edttxtEmail, edttxtPswd;
    Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rps = inflater.inflate(R.layout.activity_fragment3, container, false);
        edttxtEmail = rps.findViewById(R.id.edtemail);
        edttxtPswd = rps.findViewById(R.id.edtpswd);
        button = rps.findViewById(R.id.btnlogin);
        //menyediakan tempat untuk button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputEmail = edttxtEmail.getText().toString();
                String inputPswd = edttxtPswd.getText().toString();

                //Mulai mulai mengirimkan
                Bundle bdl = new Bundle();
                Fragment2 fragment2 = new Fragment2();

                bdl.putString("email", inputEmail);
                fragment2.setArguments(bdl);
                getFragmentManager().beginTransaction().replace(R.id.frame2,fragment2).commit();


            }
        });
        return rps;
    }

}
