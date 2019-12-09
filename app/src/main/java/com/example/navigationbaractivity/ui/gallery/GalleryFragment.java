package com.example.navigationbaractivity.ui.gallery;

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
public class GalleryFragment extends Fragment {
    EditText etRadius;
    Button btnAreaCalculate;



    public GalleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_gallery, container, false);

        etRadius=view.findViewById(R.id.etRadius);
        btnAreaCalculate=view.findViewById(R.id.btnAreaCalculate);

        btnAreaCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float radius =Float.parseFloat(etRadius.getText().toString());
                final float pi=(float) Math.PI;
                float result=pi*radius*radius;
                Toast.makeText(getActivity(), "The area of circle is: "+result, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}