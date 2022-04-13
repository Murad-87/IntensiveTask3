package com.example.myintensivetask3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myintensivetask3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            iSwitzerland.setOnClickListener{
                Toast.makeText(applicationContext, "Switzerland", Toast.LENGTH_SHORT).show()
            }
            iDenmark.setOnClickListener{
                Toast.makeText(applicationContext, "Denmark", Toast.LENGTH_SHORT).show()
            }
            iMadagascar.setOnClickListener {
                Toast.makeText(applicationContext, "Madagascar", Toast.LENGTH_SHORT).show()
            }
            iPoland.setOnClickListener {
                Toast.makeText(applicationContext, "Poland", Toast.LENGTH_SHORT).show()
            }
            iThailand.setOnClickListener {
                Toast.makeText(applicationContext, "Thailand", Toast.LENGTH_SHORT).show()
            }
            ivColombia.setOnClickListener {
                Toast.makeText(applicationContext, "Colombia", Toast.LENGTH_SHORT).show()
            }
            iItaly.setOnClickListener {
                Toast.makeText(applicationContext, "Italy",Toast.LENGTH_SHORT).show()
            }
            iAustria.setOnClickListener {
                Toast.makeText(applicationContext, "Austria", Toast.LENGTH_SHORT).show()
            }
        }
    }

}