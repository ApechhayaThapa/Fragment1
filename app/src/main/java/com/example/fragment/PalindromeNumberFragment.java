package com.example.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.HashMap;

public class PalindromeNumberFragment extends Fragment {

    View view;
    EditText editTextPalin;
    Button buttonPalin;
    HashMap<Character, Integer> charCountMap;
    TextView textViewReverse;

    public PalindromeNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome_number, container, false);

        editTextPalin = view.findViewById(R.id.editPalen);
        buttonPalin = view.findViewById(R.id.btnPalendrome);
        textViewReverse = view.findViewById(R.id.textPalendrome);

        charCountMap = new HashMap<>();

        buttonPalin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editTextPalin.getText().toString().isEmpty()) {
                    StringBuffer c = new StringBuffer(editTextPalin.getText().toString());
                    textViewReverse.setText(c.reverse());

                    if (editTextPalin.getText().equals(textViewReverse.getText())) {
                        Toast.makeText(getActivity(), "The value is palindrome", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getActivity(), "Sorry! Not a palindrome number", Toast.LENGTH_LONG).show();
                    }
                } else {
                    editTextPalin.setError("Enter Your Text");
                }
            }
        });

        return view;
    }

}

