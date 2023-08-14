package com.example.weatherapp

import android.app.DownloadManager.Request
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.android.volley.Request.Method
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.weatherapp.databinding.ActivityMainBinding
import org.json.JSONObject

const val API_KEY = "b78a0b779d94463fb0580022231408"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bGet.setOnClickListener{
            getResult("London")

        }
    }

    private fun getResult(name: String){
        val url = "http://api.weatherapi.com/v1/current.json" +
                "?key=$API_KEY&q=$name&aqi=no"
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(Method.GET,
            url,
            {
                response->
                Log.d("MyLog", "Volley response: $response")
            },
            {
                Log.d("MyLog", "Volley error: $it")
            }
            )
        queue.add(stringRequest)
    }
}