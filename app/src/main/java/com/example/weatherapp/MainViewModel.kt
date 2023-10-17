package com.example.weatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapp.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}