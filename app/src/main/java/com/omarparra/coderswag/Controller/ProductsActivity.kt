package com.omarparra.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.omarparra.coderswag.Adapters.ProductAdapter
import com.omarparra.coderswag.R
import com.omarparra.coderswag.Services.DataService
import com.omarparra.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryTyped = intent.getStringExtra(EXTRA_CATEGORY)
//        println(categoryTyped)
        adapter = ProductAdapter(this, DataService.getProducts(categoryTyped))

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720 ) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter

    }
}
