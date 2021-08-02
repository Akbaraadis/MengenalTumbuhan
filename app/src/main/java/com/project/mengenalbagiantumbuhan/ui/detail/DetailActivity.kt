package com.project.mengenalbagiantumbuhan.ui.detail

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.mengenalbagiantumbuhan.R
import com.project.mengenalbagiantumbuhan.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val MATERI_JUDUL = "extra_icon"
        const val MATERI_PARAGRAF = "extra_paragraf"
        const val MATERI_SUBMENU1 = "extra_submenu1"
        const val MATERI_ISIMENU1 = "extra_isimenu1"
        const val MATERI_GAMBARMENU1 = "extra_gambarmenu1"
        const val MATERI_SUBMENU2 = "extra_submenu2"
        const val MATERI_ISIMENU2 = "extra_isimenu2"
        const val MATERI_GAMBARMENU2 = "extra_gambarmenu2"
        const val MATERI_SUBMENU3 = "extra_submenu3"
        const val MATERI_ISIMENU3 = "extra_isimenu3"
        const val MATERI_GAMBARMENU3 = "extra_gambarmenu3"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this)
            .load(intent.getIntExtra(MATERI_GAMBARMENU1, 0))
            .apply(RequestOptions().override(280, 280))
            .into(binding.detailIvMenu1)

        Glide.with(this)
            .load(intent.getIntExtra(MATERI_GAMBARMENU1, 0))
            .apply(RequestOptions().override(1920, 1080))
            .into(binding.detailIvMenupeta)

        if(MATERI_GAMBARMENU2!="0"){
            Glide.with(this)
                .load(intent.getIntExtra(MATERI_GAMBARMENU2, 0))
                .apply(RequestOptions().override(280, 280))
                .into(binding.detailIvMenu2)
        }

        if(MATERI_GAMBARMENU3!="0"){
            Glide.with(this)
                .load(intent.getIntExtra(MATERI_GAMBARMENU3, 0))
                .apply(RequestOptions().override(280, 280))
                .into(binding.detailIvMenu3)
        }

        with(binding){
            detailTvJudul.text = intent.getStringExtra(MATERI_JUDUL)
            detailTvParagraf.text = intent.getStringExtra(MATERI_PARAGRAF)
            detailTvSubmenu1.text = intent.getStringExtra(MATERI_SUBMENU1)
            detailTvIsimenu1.text = intent.getStringExtra(MATERI_ISIMENU1)
            detailTvSubmenu2.text = intent.getStringExtra(MATERI_SUBMENU2)
            detailTvIsimenu2.text = intent.getStringExtra(MATERI_ISIMENU2)
            detailTvSubmenu3.text = intent.getStringExtra(MATERI_SUBMENU3)
            detailTvIsimenu3.text = intent.getStringExtra(MATERI_ISIMENU3)

            if(detailTvJudul.text == "Daftar Pustaka"){
                detailBtnNext.visibility = View.GONE
            }

            if(detailTvJudul.text == "Kata Pengantar"){
                detailBtnNext.visibility = View.GONE
            }

            if(detailTvJudul.text == "KD Indikator"){
                detailBtnNext.visibility = View.GONE
            }

            if(detailTvJudul.text == "Peta Konsep"){
                detailBtnNext.visibility = View.GONE
                detailTvParagraf.visibility = View.GONE
//                detailIvMenu1.visibility = View.VISIBLE
//                detailIvMenu1.layoutParams.height = 1000
//                detailIvMenu1.layoutParams.width = 1000
                detailIvMenupeta.visibility = View.VISIBLE
            }

            if(detailTvJudul.text == "Petunjuk Penggunaan"){
                detailBtnNext.visibility = View.GONE
                detailTvParagraf.visibility = View.GONE
                detailIvMenupeta.visibility = View.VISIBLE
            }

            detailBtnNext.setOnClickListener {
                if(detailTvJudul.text == "Bunga"){
                    detailTvBunga1.visibility = View.VISIBLE
                    detailTvBunga2.visibility = View.VISIBLE
                    detailTvBunga3.visibility = View.VISIBLE
                    detailTvBunga4.visibility = View.VISIBLE
                    detailTvBunga5.visibility = View.VISIBLE
                }
                if(detailTvJudul.text == "Biji"){
                    detailTvJudul.visibility = View.GONE
                    detailTvParagraf.visibility = View.GONE
                    detailTvSubmenu1.visibility = View.VISIBLE
                    detailTvIsimenu1.visibility = View.VISIBLE
                    detailBtnBack1.visibility = View.VISIBLE
                    detailBtnNext.visibility = View.GONE
                }
                else{
                    detailTvJudul.visibility = View.GONE
                    detailTvParagraf.visibility = View.GONE
                    detailTvSubmenu1.visibility = View.VISIBLE
                    detailTvIsimenu1.visibility = View.VISIBLE
                    detailIvMenu1.visibility = View.VISIBLE
                    detailBtnBack1.visibility = View.VISIBLE
                    detailBtnNext.visibility = View.GONE
                    detailBtnNext1.visibility = View.VISIBLE
                }
            }

            detailBtnBack1.setOnClickListener {
                detailTvJudul.visibility = View.VISIBLE
                detailTvParagraf.visibility = View.VISIBLE
                detailTvSubmenu1.visibility = View.GONE
                detailTvIsimenu1.visibility = View.GONE
                detailIvMenu1.visibility = View.GONE
                detailBtnBack1.visibility = View.GONE
                detailBtnNext.visibility = View.VISIBLE
                detailBtnNext1.visibility = View.GONE
                if(detailTvJudul.text == "Bunga"){
                    detailTvBunga1.visibility = View.GONE
                    detailTvBunga2.visibility = View.GONE
                    detailTvBunga3.visibility = View.GONE
                    detailTvBunga4.visibility = View.GONE
                    detailTvBunga5.visibility = View.GONE
                }
            }

            detailBtnNext1.setOnClickListener{
                detailTvBunga1.visibility = View.GONE
                detailTvBunga2.visibility = View.GONE
                detailTvBunga3.visibility = View.GONE
                detailTvBunga4.visibility = View.GONE
                detailTvBunga5.visibility = View.GONE
                detailTvSubmenu1.visibility = View.GONE
                detailTvIsimenu1.visibility = View.GONE
                detailIvMenu1.visibility = View.GONE
                detailTvSubmenu2.visibility = View.VISIBLE
                detailTvIsimenu2.visibility = View.VISIBLE
                if (detailTvJudul.text == "Akar" || detailTvJudul.text == "Daun"){
                    detailIvMenu2.visibility = View.VISIBLE
                }
                if (detailTvJudul.text == "Daun"){
                    detailTvDaun1.visibility = View.VISIBLE
                    detailIvDaun1.visibility = View.VISIBLE
                }
                if(detailTvJudul.text == "Bunga" || detailTvJudul.text == "Buah"){
                    detailBtnBack1.visibility = View.GONE
                    detailBtnBack2.visibility = View.VISIBLE
                    detailBtnNext1.visibility = View.GONE
                }
                else{
                    detailBtnBack1.visibility = View.GONE
                    detailBtnBack2.visibility = View.VISIBLE
                    detailBtnNext1.visibility = View.GONE
                    detailBtnNext2.visibility = View.VISIBLE
                }
            }

            detailBtnBack2.setOnClickListener{
                if(detailTvJudul.text == "Bunga"){
                    detailTvBunga1.visibility = View.VISIBLE
                    detailTvBunga2.visibility = View.VISIBLE
                    detailTvBunga3.visibility = View.VISIBLE
                    detailTvBunga4.visibility = View.VISIBLE
                    detailTvBunga5.visibility = View.VISIBLE
                }
                detailTvSubmenu1.visibility = View.VISIBLE
                detailTvIsimenu1.visibility = View.VISIBLE
                detailIvMenu1.visibility = View.VISIBLE
                detailTvSubmenu2.visibility = View.GONE
                detailTvIsimenu2.visibility = View.GONE
                if (detailTvJudul.text == "Akar" || detailTvJudul.text == "Daun"){
                    detailIvMenu2.visibility = View.GONE
                }
                if (detailTvJudul.text == "Daun"){
                    detailTvDaun1.visibility = View.GONE
                    detailIvDaun1.visibility = View.GONE
                }
                detailBtnBack2.visibility = View.GONE
                detailBtnBack1.visibility = View.VISIBLE
                detailBtnNext2.visibility = View.GONE
                detailBtnNext1.visibility = View.VISIBLE
            }

            detailBtnNext2.setOnClickListener {
                detailTvSubmenu2.visibility = View.GONE
                detailTvIsimenu2.visibility = View.GONE
                detailIvMenu2.visibility = View.GONE
                detailTvSubmenu3.visibility = View.VISIBLE
                detailTvIsimenu3.visibility = View.VISIBLE
                detailIvMenu3.visibility = View.VISIBLE
                detailTvDaun1.visibility = View.GONE
                detailIvDaun1.visibility = View.GONE
                detailBtnNext2.visibility = View.GONE
                detailBtnBack2.visibility = View.GONE
                detailBtnBack3.visibility = View.VISIBLE
            }

            detailBtnBack3.setOnClickListener {
                detailTvSubmenu2.visibility = View.VISIBLE
                detailTvIsimenu2.visibility = View.VISIBLE
                detailIvMenu2.visibility = View.VISIBLE
                detailTvSubmenu3.visibility = View.GONE
                detailTvIsimenu3.visibility = View.GONE
                detailIvMenu3.visibility = View.GONE
                detailBtnBack3.visibility = View.GONE
                detailBtnBack2.visibility = View.VISIBLE
                detailBtnNext2.visibility = View.VISIBLE
                if(detailTvJudul.text == "Daun"){
                    detailTvDaun1.visibility = View.VISIBLE
                    detailIvDaun1.visibility = View.VISIBLE
                }
            }

            detailIvBack.setOnClickListener {
                onBackPressed()
                finish()
            }
        }
    }

    private fun materifinish(){
        binding.detailTvFinish.visibility = View.VISIBLE
        binding.detailBtnNext2.visibility = View.GONE
        binding.detailBtnBack2.visibility = View.VISIBLE
    }
}