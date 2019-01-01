package com.omarparra.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.omarparra.coderswag.Model.Category
import com.omarparra.coderswag.R
import com.omarparra.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //need content, type view, and what is adapting
        adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataService.categories)
        //set the category that we just adapt
        categoryListView.adapter = adapter 
    }
}
