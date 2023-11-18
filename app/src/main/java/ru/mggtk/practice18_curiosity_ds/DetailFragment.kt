package com.awkitsune.fragmentdemonstration2
import androidx.fragment.app.Fragment
import android.widget.TextView
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import ru.mggtk.practice18_curiosity_ds.R
import android.content.Context
import android.widget.ImageView

class DetailFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
        val imageView = view?.findViewById<ImageView>(R.id.imageView2)
    }
    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val views = view?.findViewById<TextView>(R.id.detailsText)
        val imageView = view?.findViewById<ImageView>(R.id.imageView2)
        when(selectedItem){
            "Шпиц" -> {views?.text = context?.getString(R.string.Shpic)
                imageView?.setImageResource(R.drawable.shpic)}
            "Бульдог" -> {views?.text = context?.getString(R.string.Buldog)
                imageView?.setImageResource(R.drawable.buld)}
            "Овчарка" -> {views?.text = context?.getString(R.string.Ovcharka)
                imageView?.setImageResource(R.drawable.ovch)}

        }

    }
}

