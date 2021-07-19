package com.project.mengenalbagiantumbuhan.ui.games

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.project.mengenalbagiantumbuhan.R
import com.project.mengenalbagiantumbuhan.databinding.ActivityDetailGamesBinding
import com.project.mengenalbagiantumbuhan.databinding.ActivityGamesBinding

class DetailGamesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailGamesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailGamesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val kode = intent.getStringExtra("kode")

        if(kode == "1"){
            binding.detailGames1.visibility = View.VISIBLE
            binding.detailGamesBtn.setOnClickListener {
                selected("DAUN")
            }
        }

        if(kode == "2"){
            binding.detailGames2.visibility = View.VISIBLE
            binding.detailGamesBtn.setOnClickListener {
                selected("BUAH")
            }
        }

        if(kode == "3"){
            binding.detailGames3.visibility = View.VISIBLE
            binding.detailGamesBtn.setOnClickListener {
                selected("BIJI")
            }
        }

        if(kode == "4"){
            binding.detailGames4.visibility = View.VISIBLE
            binding.detailGamesBtn.setOnClickListener {
                selected("AKAR")
            }
        }

        if(kode == "5"){
            binding.detailGames5.visibility = View.VISIBLE
            binding.detailGamesBtn.setOnClickListener {
                selected("BATANG")
            }
        }

        if(kode == "6"){
            binding.detailGames6.visibility = View.VISIBLE
            binding.detailGamesBtn.setOnClickListener {
                selected("BUNGA")
            }
        }

        if(kode == "7"){
            binding.detailGames7.visibility = View.VISIBLE
            binding.detailGamesBtn.setOnClickListener {
                selected("FOTOSINTESIS")
            }
        }

        if(kode == "8"){
            binding.detailGames8.visibility = View.VISIBLE
            binding.detailGamesBtn.setOnClickListener {
                selected("TANGKAI DAUN")
            }
        }

        if(kode == "9"){
            binding.detailGames9.visibility = View.VISIBLE
            binding.detailGamesBtn.setOnClickListener {
                selected("KELOPAK")
            }
        }

        if(kode == "10"){
            binding.detailGames10.visibility = View.VISIBLE
            binding.detailGamesBtn.setOnClickListener {
                selected("KAMBIUM")
            }
        }
    }

    private fun selected(answer: String){
        val test = binding.detailGamesAnswer.text.toString()
        if(test == answer){
            Toast.makeText(this, "Jawaban kamu benar", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, GamesActivity::class.java)
            startActivity(intent)
            finish()
        }
        else{
            Toast.makeText(this, "Jawaban kamu belum tepat", Toast.LENGTH_SHORT).show()
        }
    }
}