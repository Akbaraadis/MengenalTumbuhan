package com.project.mengenalbagiantumbuhan.ui.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.project.mengenalbagiantumbuhan.data.Constants
import com.project.mengenalbagiantumbuhan.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // To hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        binding.btnStart.setOnClickListener {

            if (binding.etName.text.toString().isEmpty()) {

                Toast.makeText(this@StartActivity, "Silahkan masukkan nama kamu terlebih dahulu", Toast.LENGTH_SHORT)
                    .show()
            } else {

                val intent = Intent(this@StartActivity, QuizActivity::class.java)
                intent.putExtra(Constants.USER_NAME, binding.etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}