package com.omarparra.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.omarparra.coderswag.Model.Category
import com.omarparra.coderswag.R

/**
 * Created by Omar Parra on 1/1/19.
 */
class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter(){

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        //this help us to repeat the views
        if (convertView == null){
            //object that takes an xml an turns it in code
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryimage)
            holder.categoryName = categoryView.findViewById(R.id.categoryname)
//            println("I exist for the first time")
            categoryView.tag = holder
        }else{
            //anyone created?
            holder = convertView.tag as ViewHolder
            categoryView = convertView
//            println("Go green, recycle!")
        }

        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder{
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }


}