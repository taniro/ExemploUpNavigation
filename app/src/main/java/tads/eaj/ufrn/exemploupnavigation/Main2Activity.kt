package tads.eaj.ufrn.exemploupnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_main2.*


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Get a support ActionBar corresponding to this toolbar
        val ab = supportActionBar

        // Enable the Up button
        ab!!.setDisplayHomeAsUpEnabled(true)

        buttonTela2.setOnClickListener {
            var i = Intent(this, Main3Activity::class.java)
            startActivity(i)
        }
    }
}
