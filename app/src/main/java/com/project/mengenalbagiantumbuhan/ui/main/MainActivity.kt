package com.project.mengenalbagiantumbuhan.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.mengenalbagiantumbuhan.data.Materi
import com.project.mengenalbagiantumbuhan.data.Materi_Data
import com.project.mengenalbagiantumbuhan.databinding.ActivityMainBinding
import com.project.mengenalbagiantumbuhan.ui.games.GamesActivity
import com.project.mengenalbagiantumbuhan.ui.quiz.StartActivity
import com.project.mengenalbagiantumbuhan.ui.video.VideoActivity

class MainActivity : AppCompatActivity() {

    private var list: ArrayList<Materi> = arrayListOf()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rvIcon.setHasFixedSize(true)

        list.addAll(Materi_Data.listdata)
        showRecyclerView()

        binding.itemCivQuiz.setOnClickListener{
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
        }

        binding.itemCivGames.setOnClickListener {
            val intent = Intent(this, GamesActivity::class.java)
            startActivity(intent)
        }

        binding.itemCivVideo.setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showRecyclerView() {
        binding.rvIcon.layoutManager = GridLayoutManager(this, 4)
        val cardViewAdapter = MainAdapter(list, this)
        binding.rvIcon.adapter = cardViewAdapter
    }

    override fun onBackPressed() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }
}