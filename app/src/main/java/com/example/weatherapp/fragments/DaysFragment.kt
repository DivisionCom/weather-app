package com.example.weatherapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp.MainViewModel
import com.example.weatherapp.R
import com.example.weatherapp.adapters.WeatherAdapter
import com.example.weatherapp.adapters.WeatherModel
import com.example.weatherapp.databinding.FragmentDaysBinding

class DaysFragment : Fragment(), WeatherAdapter.Listener {
    private lateinit var binding: FragmentDaysBinding
    private lateinit var adapter: WeatherAdapter
    private val model: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDaysBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
        fillDaysPage()
    }

    private fun fillDaysPage(){
        model.liveDataList.observe(viewLifecycleOwner){
            adapter.submitList(it.subList(1, it.size))
        }
    }

    private fun initRcView() = with(binding){
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter(this@DaysFragment)
        rcView.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = DaysFragment()
    }

    override fun onClick(item: WeatherModel) {
        model.liveDataCurrent.value = item
    }
}