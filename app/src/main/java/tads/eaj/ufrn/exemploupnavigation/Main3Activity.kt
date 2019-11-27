package tads.eaj.ufrn.exemploupnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        // Get a support ActionBar corresponding to this toolbar
        val ab = supportActionBar

        // Enable the Up button
        ab!!.setDisplayHomeAsUpEnabled(true)


    }
}
