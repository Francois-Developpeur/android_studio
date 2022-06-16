package fr.francoisEtLoic.labonnetambouille.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import fr.francoisEtLoic.labonnetambouille.R

class RecipeAdapter : RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {

    //boite pour ranger tout les composants à controler
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val recipeImage = view.findViewById<ImageView>(R.id.image_item)
        //image de la recipe
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_horizontal_recipe, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3;
    }
}