package com.project.mengenalbagiantumbuhan.ui.games

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.project.mengenalbagiantumbuhan.databinding.ActivityGamesBinding
import com.project.mengenalbagiantumbuhan.ui.main.MainActivity

class GamesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGamesBinding
    private var kode = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.games1.setOnClickListener {
            kode = "1"
            val intent = Intent(this, DetailGamesActivity::class.java)
            intent.putExtra("kode", kode)
            startActivity(intent)
        }

        binding.games2.setOnClickListener {
            kode = "2"
            val intent = Intent(this, DetailGamesActivity::class.java)
            intent.putExtra("kode", kode)
            startActivity(intent)
        }

        binding.games3.setOnClickListener {
            kode = "3"
            val intent = Intent(this, DetailGamesActivity::class.java)
            intent.putExtra("kode", kode)
            startActivity(intent)
        }

        binding.games4.setOnClickListener {
            kode = "4"
            val intent = Intent(this, DetailGamesActivity::class.java)
            intent.putExtra("kode", kode)
            startActivity(intent)
        }

        binding.games5.setOnClickListener {
            kode = "5"
            val intent = Intent(this, DetailGamesActivity::class.java)
            intent.putExtra("kode", kode)
            startActivity(intent)
        }

        binding.games6.setOnClickListener {
            kode = "6"
            val intent = Intent(this, DetailGamesActivity::class.java)
            intent.putExtra("kode", kode)
            startActivity(intent)
        }

        binding.games7.setOnClickListener {
            kode = "7"
            val intent = Intent(this, DetailGamesActivity::class.java)
            intent.putExtra("kode", kode)
            startActivity(intent)
        }

        binding.games8.setOnClickListener {
            kode = "8"
            val intent = Intent(this, DetailGamesActivity::class.java)
            intent.putExtra("kode", kode)
            startActivity(intent)
        }

        binding.games9.setOnClickListener {
            kode = "9"
            val intent = Intent(this, DetailGamesActivity::class.java)
            intent.putExtra("kode", kode)
            startActivity(intent)
        }

        binding.games10.setOnClickListener {
            kode = "10"
            val intent = Intent(this, DetailGamesActivity::class.java)
            intent.putExtra("kode", kode)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}