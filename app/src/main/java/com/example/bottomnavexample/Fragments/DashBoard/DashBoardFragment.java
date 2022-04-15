package com.example.bottomnavexample.Fragments.DashBoard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bottomnavexample.databinding.FragmentDashBoardBinding;

public class DashBoardFragment extends Fragment {

    private FragmentDashBoardBinding binding;

    public DashBoardFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDashBoardBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}