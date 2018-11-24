package id.co.aminfaruq.umur

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO fungsinya untuk menyembunyikan textview
        txtHasil.visibility = View.INVISIBLE
        

        btnPlay.setOnClickListener {

            val tahunSekarang = Calendar.getInstance().get(Calendar.YEAR)

            val userAge = tahunSekarang - edtIsiNama.text.toString().toInt()

            txtHasil.text = "Your age is $userAge years old"

            txtHasil.visibility = View.VISIBLE

        }

    }
}