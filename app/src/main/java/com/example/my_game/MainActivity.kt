package com.example.my_game

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.My_game.SubstractionActivity
import com.example.My_gamey.AdditionActivity
import com.example.My_gamey.MultiplicationActivity
import com.example.my_game.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.addButton.setOnClickListener {
            val intent = Intent(this@MainActivity, AdditionActivity::class.java)
            startActivity(intent)
            finish()
        }

        mainBinding.subtractButton.setOnClickListener {
            val intent = Intent(this@MainActivity, SubstractionActivity::class.java)
            startActivity(intent)
            finish()
        }

        mainBinding.multiplyButton.setOnClickListener {
            val intent = Intent(this@MainActivity, MultiplicationActivity::class.java)
            startActivity(intent)
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}