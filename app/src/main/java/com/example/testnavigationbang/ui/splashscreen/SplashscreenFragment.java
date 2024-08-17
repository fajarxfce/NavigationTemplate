package com.example.testnavigationbang.ui.splashscreen;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testnavigationbang.R;
import com.example.testnavigationbang.databinding.FragmentSplashscreenBinding;

public class SplashscreenFragment extends Fragment {

    FragmentSplashscreenBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSplashscreenBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnNext.setOnClickListener(v -> {
            // Navigate to WelcomeFragment
             Navigation.findNavController(getActivity(), R.id.nav_host_fragment_activity_main).navigate(R.id.action_splashscreenFragment_to_welcomeFragment);
        });
    }
}