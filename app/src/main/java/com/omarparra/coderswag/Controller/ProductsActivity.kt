package com.omarparra.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.omarparra.coderswag.R
import com.omarparra.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryTyped = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryTyped)
    }
}
