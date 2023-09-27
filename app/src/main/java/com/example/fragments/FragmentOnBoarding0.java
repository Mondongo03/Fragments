package com.example.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentOnBoarding0 newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentOnBoarding0 extends Fragment {
    Button botonSiguiente;
    Button botonFinal;
    NavController navController;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boarding0, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        botonSiguiente = view.findViewById(R.id.botonSiguiente);
        botonFinal = view.findViewById(R.id.botonFinal);

        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_fragmentOnBoarding0_to_onBoarding1Fragment);
            }
        });

        botonFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_fragmentOnBoarding0_to_homeFragment);
            }
        });
    }
}