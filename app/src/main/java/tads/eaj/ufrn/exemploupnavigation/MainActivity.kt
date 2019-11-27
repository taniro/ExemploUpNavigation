package tads.eaj.ufrn.exemploupnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTela1.setOnClickListener {

            var i = Intent(this, Main2Activity::class.java)
            startActivity(i)
        }
    }
}
