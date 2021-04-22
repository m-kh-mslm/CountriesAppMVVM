package com.mera.countriesapp.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mera.countriesapp.model.CountryModel;

import java.util.ArrayList;
import java.util.List;

public class ListViewModel extends ViewModel {
    MutableLiveData<List<CountryModel>> countries = new MutableLiveData<>();
    MutableLiveData<Boolean> LoadCountriesError = new MutableLiveData<>();
    MutableLiveData<Boolean> loading = new MutableLiveData<>();

    public void refresh() {
        fetchCountries();

    }

    private void fetchCountries() {
        CountryModel country1 = new CountryModel("Country", "Capital", "");
        CountryModel country2 = new CountryModel("Country2", "Capital2", "");
        CountryModel country3 = new CountryModel("Country3", "Capital3", "");
        CountryModel country4 = new CountryModel("Country4", "Capital4", "");

        List<CountryModel> list = new ArrayList<>();
        list.add(country1);
        list.add(country2);
        list.add(country3);
        list.add(country4);

        countries.setValue(list);
        loading.setValue(false);
        LoadCountriesError.setValue(false);
    }
}
