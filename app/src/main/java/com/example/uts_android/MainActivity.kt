package com.example.uts_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uts_android.helper.Constant
import com.example.uts_android.helper.PrefHelper
//import kotlinx.android.synthetic.main.activity_kalkuator.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var prefHelper: PrefHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        prefHelper = PrefHelper(this)
        textUsername.text = prefHelper.getString( Constant.PREF_USERNAME )
        buttonLogout.setOnClickListener {
            prefHelper.clear()
            showMessage( "Keluar" )
            moveIntent()

        }
        btn_berita.setOnClickListener {
            startActivity(Intent(this,BeritaActivity::class.java))
        }
        btn_tentang.setOnClickListener {
            startActivity(Intent(this,TentangActivity::class.java))
        }
        btn_kalkulator.setOnClickListener {
            startActivity(Intent(this,KalkulatorActivity::class.java))
        }

    }
    private fun moveIntent(){
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
    private fun showMessage(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}