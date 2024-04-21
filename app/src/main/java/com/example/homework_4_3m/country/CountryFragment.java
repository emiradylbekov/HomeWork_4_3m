package com.example.homework_4_3m.country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework_4_3m.R;
import com.example.homework_4_3m.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private FragmentCountryBinding binding;
    private int pozition;
    private ArrayList<Country> countryList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        assert getArguments() != null;
        pozition = getArguments().getInt("continent", 0);
        chekPozition(pozition);
        CountryAdapter adapter = new CountryAdapter(countryList);
        binding.rvCountry.setAdapter(adapter);
    }

    private void chekPozition(int pozition) {
        switch (pozition){
            case 0:
                loadAsia();
                break;
            case 1:
                loadEuropa();
                break;
            case 2:
                loadAfrica();
                break;
            case 3:
                loadNorthAmerica();
                break;
            case 4:
                loadSouthAmerica();
                break;
            case 5:
                loadAustralia();
                break;
        }
    }

    private void loadAsia(){
        countryList.add(new Country("https://24.kg/thumbnails/e8132/4791d/317181_w_h500_1703252696_r.jpeg","Kyrgyzstan"));
        countryList.add(new Country("https://i.pinimg.com/736x/b8/7b/00/b87b00a0e11cfeed4356a4d5d03f2947.jpg","Kazakhstan"));
        countryList.add(new Country("https://w1.pngwing.com/pngs/595/740/png-transparent-flag-uzbekistan-flag-of-uzbekistan-kazakhstan-turkmenistan-national-flag-flag-of-turkmenistan-flag-of-kazakhstan.png","Uzbekistan"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/2/2e/Flag_of_China.png","China"));
        countryList.add(new Country("https://png.pngtree.com/png-vector/20190621/ourlarge/pngtree-japan-flag-png-image_1508258.jpg","Japan"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/0/0f/Flag_of_South_Korea.png","South Korea"));
        countryList.add(new Country("https://c0.klipartz.com/pngpicture/826/765/sticker-png-flag-of-saudi-arabia-national-flag-flag-miscellaneous-angle-flag-text-rectangle.png","Saudi Arabia"));
    }

    private void loadEuropa(){
        countryList.add(new Country("https://e7.pngegg.com/pngimages/58/147/png-clipart-flag-of-portugal-portuguese-mozambique-flag-of-mozambique-flag-miscellaneous-emblem.png","Portugal"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/6/62/Flag_of_France.png","France"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/8/87/Flag_of_Turkey.png","Turkey"));
        countryList.add(new Country("https://c0.klipartz.com/pngpicture/963/454/gratis-png-bandera-de-reino-unido-ondeando-arte-bandera-de-inglaterra-bandera-del-reino-unido-bandera-de-gran-bretana-reino-unido.png","England"));
        countryList.add(new Country("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRT7BiXkHyMj3YSoMLUSivD6IcSB-zQRUmLViwoIiHbbQ&s","Germany"));
        countryList.add(new Country("https://w7.pngwing.com/pngs/907/428/png-transparent-flag-of-italy-italian-german-italia-flag-miscellaneous-angle-flag.png","Italy"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/6/6f/Spain_flag_300.png","Spain"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/f/f1/Flag_of_Norway.png","Norway"));
    }

    private void loadAfrica(){
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Nigeria.png","Nigeria"));
        countryList.add(new Country("https://w7.pngwing.com/pngs/253/934/png-transparent-flag-of-egypt-flag-of-egypt-national-flag-auburn-egypt-flag-text-rectangle-thumbnail.png","Egypt"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Flag_of_Ethiopia.svg/1280px-Flag_of_Ethiopia.svg.png","Ethiopia"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Flag_of_South_Africa.svg/1200px-Flag_of_South_Africa.svg.png","South Africa"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/9/98/Flag_of_Kenya.png","Kenya"));
        countryList.add(new Country("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeF_SNbNZlD3n4sqm051v2F87KhAB_TDaUbNiJ4TClMw&s","Algeria"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/c/c9/Flag_of_Morocco.png","Morocco"));
    }

    private void loadNorthAmerica(){
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Flag_of_the_United_States.png/1280px-Flag_of_the_United_States.png","USA"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Flag_of_Canada.png/1200px-Flag_of_Canada.png","Canada"));
        countryList.add(new Country("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRjlGR7iLCvKF8Nno1QRnHm248U-DpwD9iY66M3_BIdnQ&s","Mexico"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/9/92/Flag_of_Cuba.png","Cuba"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/b/b4/Flag_of_Jamaica.png","Jamaica"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Flag_of_Haiti.svg/1200px-Flag_of_Haiti.svg.png","Haiti"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/d/d2/Dominican_republic_flag_300.png","Dominican Republic"));
    }

    private void loadSouthAmerica(){
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/2560px-Flag_of_Brazil.svg.png","Brazil"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/1280px-Flag_of_Argentina.svg.png","Argentina"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/f/f8/Flag_of_Colombia.png","Colombia"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/1280px-Flag_of_Peru_%28state%29.svg.png","Peru"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/1280px-Flag_of_Venezuela.svg.png","Venezuela"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Flag_of_Chile.svg/1200px-Flag_of_Chile.svg.png","Chile"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Flag_of_Ecuador.svg/1200px-Flag_of_Ecuador.svg.png","Ecuador"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/2560px-Flag_of_Uruguay.svg.png","Uruguay"));
    }
    private void loadAustralia(){
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Flag_of_Australia.svg/2560px-Flag_of_Australia.svg.png","Australia"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/3/34/Flag_of_New_Zealand.png","New Zealand"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Flag_of_Papua_New_Guinea.svg/1200px-Flag_of_Papua_New_Guinea.svg.png","Papua New Guinea"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Fiji.svg/2560px-Flag_of_Fiji.svg.png","Fiji"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Vanuatu.svg/1280px-Flag_of_Vanuatu.svg.png","Vanuatu"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/7/7d/Solomon_islands_flag.png","Solomon Islands"));
        countryList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_Tonga.svg/1280px-Flag_of_Tonga.svg.png","Tonga"));
    }
}