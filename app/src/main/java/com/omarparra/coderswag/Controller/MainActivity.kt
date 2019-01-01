package com.omarparra.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.omarparra.coderswag.Adapters.CategoryAdapter
import com.omarparra.coderswag.Model.Category
import com.omarparra.coderswag.R
import com.omarparra.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //need content, type view, and what is adapting
        adapter = CategoryAdapter(this, DataService.categories )
        //set the category that we just adapt
        categoryListView.adapter = adapter
        
        /*This only works 4 listViews
        //transition
        categoryListView.setOnItemClickListener { parent, view, position, id ->
            val category = DataService.categories[position]
            Toast.makeText(this, "You clicked on ${category.title} cell", Toast.LENGTH_SHORT).show()
        }*/
    }
}
