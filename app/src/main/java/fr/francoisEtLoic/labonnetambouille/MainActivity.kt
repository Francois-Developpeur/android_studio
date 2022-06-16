package fr.francoisEtLoic.labonnetambouille

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.francoisEtLoic.labonnetambouille.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // injecter le fragment dans notre boite (fragment container)
        val transaction = supportFragmentManager.beginTransaction()
        //stocke une valeur, supportFragmentManager permet de gérer les fragments sur android, de les manipuler
        transaction.replace(R.id.fragment_container, HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()
        //permet d'envoyer les changements
    }
}