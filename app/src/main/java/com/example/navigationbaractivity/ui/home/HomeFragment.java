package com.example.navigationbaractivity.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.navigationbaractivity.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    EditText etPrinciple,etTime,etRate;
    Button btnSI;



    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        etPrinciple=view.findViewById(R.id.etPrinciple);
        etTime=view.findViewById(R.id.etTime);
        etRate=view.findViewById(R.id.etRate);
        btnSI=view.findViewById(R.id.btnSI);

        btnSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float p =Float.parseFloat(etPrinciple.getText().toString());
                float t =Float.parseFloat(etTime.getText().toString());
                float r =Float.parseFloat(etRate.getText().toString());
                float SI=(p*t*r)/100;
                Toast.makeText(getActivity(), "Simple Intrest is: "+SI, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}