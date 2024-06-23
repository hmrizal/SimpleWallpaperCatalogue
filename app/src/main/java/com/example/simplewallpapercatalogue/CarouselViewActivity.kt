package com.example.simplewallpapercatalogue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.carousel.CarouselSnapHelper

class CarouselViewActivity : AppCompatActivity() {

    private lateinit var carouselRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carousel_view)
        setupCarouselRecyclerView()
    }

    private fun setupCarouselRecyclerView() {
        carouselRecyclerView = findViewById(R.id.carouselRecyclerView)
        CarouselSnapHelper().attachToRecyclerView(carouselRecyclerView)
        carouselRecyclerView.adapter = CarouselViewAdapter(images = getImages())
    }

    private fun getImages(): List<String> {
        return listOf(
            "https://img.freepik.com/free-photo/view-new-york-city-urban-environment_23-2151279045.jpg",
            "https://img.freepik.com/free-photo/cars-japan-street_23-2148942942.jpg",
            "https://img.freepik.com/free-photo/aerial-shot-beautiful-skyscraper-new-york-city-great-wallpapers_181624-28995.jpg"
        )
    }
}