package com.example.androidtest.views.views_list

import android.content.Intent
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.example.androidtest.R
import com.example.androidtest.data.data_model.Book
import kotlinx.android.synthetic.main.layout_list_item.view.*

class ListBookAdapter (
    private val items : List<Book>,
    private val clickListener: OnItemClickListener
    ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    interface OnItemClickListener {
        fun onItemClick(book: Book, itemView: View)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).bind(items[position], clickListener)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(book: Book, listener: OnItemClickListener) = with(itemView) {
            textViewName.text = book.judul
            textViewMet.text = book.penulis
            buttonPenerbit.text = book.penerbit
            buttonPenerbit.setOnClickListener {
                val dialIntent = Intent(Intent.ACTION_DIAL)
                dialIntent.data = Uri.parse("tel:${book.penerbit}")
                itemView.context.startActivity(dialIntent)
            }

            setOnClickListener {
                listener.onItemClick(book, it)
            }
        }
    }
}
