package com.example.mkulima2

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mkulima2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    lateinit var recyclerView: RecyclerView
    lateinit var images: ArrayList<Int>
    lateinit var textname: Array<String>
    lateinit var dataArray: ArrayList<CropImageModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //The data
        val recy = binding.Recyclervieew
        recyclerView = recy
        val adapter= cropsAdapter(dataArray)
        recyclerView.adapter = adapter
        recyclerView.hasFixedSize()
        recyclerView.layoutManager = GridLayoutManager(this, 3)
        dataArray = arrayListOf<CropImageModel>()

        images = arrayListOf(

            R.drawable.managu,
            R.drawable.kunde,
            R.drawable.isaka2,
            R.drawable.mrenda
        )
        textname = arrayOf(
            "Managu",
            "Kunde",
            "Isaka",
            "Mrenda"
        )
        for (x in images.indices) {
            val cropsModel_Obj = CropImageModel(images[x], textname[x])
            dataArray.add(cropsModel_Obj)
        }


    }
}