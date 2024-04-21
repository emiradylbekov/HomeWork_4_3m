package com.example.homework_4_3m.continent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework_4_3m.OnClick;
import com.example.homework_4_3m.R;
import com.example.homework_4_3m.country.CountryFragment;
import com.example.homework_4_3m.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnClick {
    private FragmentContinentBinding binding;
    private ArrayList<Continent> continentList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentAdapter adapter = new ContinentAdapter(continentList, this);
        binding.rvContinent.setAdapter(adapter);
    }
    private void loadData() {
        continentList.add(new Continent("https://upload.wikimedia.org/wikipedia/commons/8/82/Flag_map_of_Asia.png","Asia"));
        continentList.add(new Continent("https://i.pinimg.com/736x/41/0f/36/410f3661d1cee3b255b82a111f99d242.jpg","Europe"));
        continentList.add(new Continent("https://upload.wikimedia.org/wikipedia/commons/4/4a/Flag_Map_of_Africa.png", "Africa"));
        continentList.add(new Continent("https://upload.wikimedia.org/wikipedia/commons/e/ee/Flag_Map_of_North_America.png","North America"));
        continentList.add(new Continent("https://upload.wikimedia.org/wikipedia/commons/e/ed/Flag_Map_of_South_America.png","South America"));
        continentList.add(new Continent("https://w7.pngwing.com/pngs/684/904/png-transparent-australia-australia-day-borders-collection-country-flag-map-nation.png","Australia"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("continent", position);

        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.container_fragment, countryFragment).addToBackStack(null).commit();
    }
}