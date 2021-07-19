package com.project.mengenalbagiantumbuhan.ui.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.project.mengenalbagiantumbuhan.R
import com.project.mengenalbagiantumbuhan.data.Constants
import com.project.mengenalbagiantumbuhan.databinding.ActivityMainBinding
import com.project.mengenalbagiantumbuhan.databinding.ActivityResultBinding
import com.project.mengenalbagiantumbuhan.ui.main.MainActivity

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        val username= intent.getStringExtra(Constants.USER_NAME)
        binding.tvName.text = username

        val totalQuestions=intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        binding.tvScore.text = "Nilai kamu $correctAnswers dari $totalQuestions"

        binding.btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}