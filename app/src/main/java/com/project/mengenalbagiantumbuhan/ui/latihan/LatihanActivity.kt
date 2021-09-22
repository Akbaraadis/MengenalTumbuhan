package com.project.mengenalbagiantumbuhan.ui.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.project.mengenalbagiantumbuhan.R
import com.project.mengenalbagiantumbuhan.data.Latihan
import com.project.mengenalbagiantumbuhan.data.Latihan_Data
import com.project.mengenalbagiantumbuhan.data.Question
import com.project.mengenalbagiantumbuhan.databinding.ActivityLatihanBinding
import com.project.mengenalbagiantumbuhan.databinding.ActivityQuizBinding

class LatihanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLatihanBinding
    private var mCurrentPosition: Int = 2
    private var mCorrectAnswers: Int = 0
    var jawaban1 = ""
    var jawaban2 = ""
    var jawaban3 = ""
    var jawaban4 = ""
    var jawaban5 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLatihanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.latihanIvBack.setOnClickListener {
            onBackPressed()
            finish()
        }

        if (mCurrentPosition == 1){
            with(binding){
                latihanTvSoal1.text = SoalAkar[0]
                latihanTvSoal2.text = SoalAkar[1]
                latihanTvSoal3.text = SoalAkar[2]
                latihanTvSoal4.text = SoalAkar[3]
                latihanTvSoal5.text = SoalAkar[4]
                jawaban1 = JawabAkar[0]
                jawaban2 = JawabAkar[1]
                jawaban3 = JawabAkar[2]
                jawaban4 = JawabAkar[3]
                jawaban5 = JawabAkar[4]
            }
        }
        else if (mCurrentPosition == 2){
            with(binding){
                latihanTvSoal1.text = SoalBatang[0]
                latihanTvSoal2.text = SoalBatang[1]
                latihanTvSoal3.text = SoalBatang[2]
                latihanTvSoal4.text = SoalBatang[3]
                latihanTvSoal5.text = SoalBatang[4]
                jawaban1 = JawabBatang[0]
                jawaban2 = JawabBatang[1]
                jawaban3 = JawabBatang[2]
                jawaban4 = JawabBatang[3]
                jawaban5 = JawabBatang[4]
            }
        }
        else if (mCurrentPosition == 3){
            with(binding){
                latihanTvSoal1.text = SoalDaun[0]
                latihanTvSoal2.text = SoalDaun[1]
                latihanTvSoal3.text = SoalDaun[2]
                latihanTvSoal4.text = SoalDaun[3]
                latihanTvSoal5.text = SoalDaun[4]
                jawaban1 = JawabDaun[0]
                jawaban2 = JawabDaun[1]
                jawaban3 = JawabDaun[2]
                jawaban4 = JawabDaun[3]
                jawaban5 = JawabDaun[4]

            }
        }
        else if (mCurrentPosition == 4){
            with(binding){
                latihanTvSoal1.text = SoalBuah[0]
                latihanTvSoal2.text = SoalBuah[1]
                latihanTvSoal3.text = SoalBuah[2]
                latihanTvSoal4.text = SoalBuah[3]
                latihanTvSoal5.text = SoalBuah[4]
                jawaban1 = JawabBuah[0]
                jawaban2 = JawabBuah[1]
                jawaban3 = JawabBuah[2]
                jawaban4 = JawabBuah[3]
                jawaban5 = JawabBuah[4]
            }
        }
        else if (mCurrentPosition == 5){
            with(binding){
                latihanTvSoal1.text = SoalBunga[0]
                latihanTvSoal2.text = SoalBunga[1]
                latihanTvSoal3.text = SoalBunga[2]
                latihanTvSoal4.text = SoalBunga[3]
                latihanTvSoal5.text = SoalBunga[4]
                jawaban1 = JawabBunga[0]
                jawaban2 = JawabBunga[1]
                jawaban3 = JawabBunga[2]
                jawaban4 = JawabBunga[3]
                jawaban5 = JawabBunga[4]
            }
        }
        else{
            with(binding){
                latihanTvSoal1.text = SoalBiji[0]
                latihanTvSoal2.text = SoalBiji[1]
                latihanTvSoal3.text = SoalBiji[2]
                latihanTvSoal4.text = SoalBiji[3]
                latihanTvSoal5.text = SoalBiji[4]
                jawaban1 = JawabBiji[0]
                jawaban2 = JawabBiji[1]
                jawaban3 = JawabBiji[2]
                jawaban4 = JawabBiji[3]
                jawaban5 = JawabBiji[4]
            }
        }

        with(binding){
            latihanBtnCheck.setOnClickListener {
                if (latihanEtSoal1.text.toString() == jawaban1){
                    mCorrectAnswers++
                }
                if (latihanEtSoal2.text.toString() == jawaban2){
                    mCorrectAnswers++
                }

                if (latihanEtSoal3.text.toString() == jawaban3 || latihanEtSoal3.text.toString() == "duduk daun" || latihanEtSoal3.text.toString() == "tajuk bunga"){
                    mCorrectAnswers++
                }

                if (latihanEtSoal4.text.toString() == jawaban4 || latihanEtSoal4.text.toString() == "biji berkeping dua"){
                    mCorrectAnswers++
                }

                if (latihanEtSoal5.text.toString() == jawaban5 || latihanEtSoal5.text.toString() == "umbi-umbian" || latihanEtSoal5.text.toString() == "sebagai tempat membuat makanan"){
                    mCorrectAnswers++
                }

                latihanScroll.visibility = View.GONE
                latihanTextNilai.visibility = View.VISIBLE
                latihanTextNilai2.visibility = View.VISIBLE
                latihanTextNilai2.text = mCorrectAnswers.toString()
                latihanBtnCheck.visibility = View.GONE

            }
        }
    }

    private val SoalAkar = arrayOf(
        "1. Akar merupakan bagian tumbuhan yang menghubungkan tubuh tanaman dengan tanah ataupun media tanam. " +
                "Umumnya, akar akan tumbuh searah dengan ….",
        "2. Akar dapat digolongkan menjadi 2 jenis, yakni ….(akar serabut) dan .….",
        "3. Tanaman yang akarnya termasuk ke dalam jenis akar gantung adalah ….",
        "4. Tanaman yang berakar tunggang umumnya merupakan golongan ….",
        "5. Salah satu fungsi akar ialah tempat menyimpan cadangan makanan. " +
                "Tuliskan 1 contoh dari tanaman yang akarnya tempat menyimpan cadangan makanan adalah …."
    )

    private val JawabAkar = arrayOf(
        "gaya gravitasi bumi",
        "akar tunggang",
        "beringin",
        "dikotil", //biji berkeping dua
        "singkong" //umbi-umbian/wortel
    )

    private val SoalBatang = arrayOf(
        "1. Arah pertumbuhan batang berlawanan dengan akar yakni ….",
        "2. Pada batang tanaman berkayu, disebut bagian apakah yang bertugas " +
                "mengangkut makanan hasil fotosintesis dari daun ke semua bagian tumbuhan?",
        "3. Pada batang, terdapat buku-buku batang dan ruas. Buku batang adalah ….",
        "4. Batang tanaman dapat pula dibedakan berdasarkan bentuknya. Bayam" +
                "merupakan salah satu tanaman yang berbatang …. dengan ciri-ciri" +
                "….. dan berair.",
        "5. Batang juga mempunyai fungsi untuk menyimpan cadangan makanan." +
                "tuliskan 1 contoh tanaman yang batangnya sebagai tempat menyimpan" +
                "cadangan makanan …."
    )

    private val JawabBatang = arrayOf(
        "mengikuti arah sinar matahari",
        "pembuluh tapis",
        "tempat melekat", //duduk daun
        "basah, lunak",
        "tebu"
    )

    private val SoalDaun = arrayOf(
        "1. Daun tumbuh dan menempel pada bagian ….",
        "2. Daun memiliki bagian lengkap dan tidak lengkap. Tanaman yang memiliki" +
                "daun tidak lengkap yaitu hanya memiliki …. dan ….",
        "3. Sebutkan 4 bentuk tulang pada daun, diantaranya ….",
        "4. Daun majemuk adalah daun yang terdiri dari beberapa helai dalam setiap" +
                "tangkainya, contohnya daun .…",
        "5. Fungsi utama daun adalah tempat terjadinya proses …."
    )

    private val JawabDaun = arrayOf(
        "batang pohon",
        "tangkai daun dan helai daun",
        "menyirip, menjari, melengkung, sejajar",
        "putri malu",
        "fotosintesis" //sebagai tempat membuat makanan
    )

    private val SoalBunga = arrayOf(
        "1. Bunga memiliki peran pada tanaman sebagai ....",
        "2. Bunga memiliki beberapa bagian, seperti kelopak, mahkota, benang sari," +
                "dan putik. Bagian bunga yang menjadi organ reproduksi wanita adalah ….",
        "3. Bagian bunga yang mengeluarkan bau yang harum atau sedap adalah ….",
        "4. Bagian terluar dari bunga adalah ….",
        "5. Salah satu fungsi bunga bagi tumbuhan adalah sebagai …. " +
                "dan tempat perkembangbiakan tumbuhan."
    )

    private val JawabBunga = arrayOf(
        "organ reproduksi",
        "putik",
        "mahkota", //tajuk bunga
        "kelopak",
        "perhiasan tumbuhan"
    )

    private val SoalBuah = arrayOf(
        "1. Bagi tumbuhan yang berkembang biak dengan biji didahului dengan" +
                "pembentukan ….",
        "2. Bagian tumbuhan yang merupakan perkembangan dari bunga adalah ….",
        "3. Bagian pada buah yang dapat dimakan adalah ….",
        "4. Bagian pada buah yang bagiannya berfngsi sebagai tempat melekat atau" +
                "bergantung pada ranting atau dahan adalah ….",
        "5. Buah memiliki fungsi sebagai tempat penyimpan cadangan makanan, " +
                "membungkus, dan …. biji"
    )

    private val JawabBuah = arrayOf(
        "bunga",
        "buah",
        "daging buah",
        "tangkai",
        "melindungi"
    )

    private val SoalBiji = arrayOf(
        "1. Biji merupakan hasil dari pembuahan yang terjadi akibat penyerbukan " +
                "antara ….. dan …. pada putik.",
        "2. Biji memiliki keeping, ada yang berkeping satu da nada yang berkeping " +
                "dua. Biji berkeping satu disebut ….",
        "3. Biji berkeping dua disebut ….",
        "4. Bagian biji yang terletak di dalam biji dan dilapisi oleh kulit biji adalah ….",
        "5. Salah satu fungsi biji adalah sebagai jaringan penyimpan cadangan " +
                "makanan bagi tumbuhan. Cadangan makanan yang disimpan merupakan " +
                "hasil dari fotosintesis tumbuhan. Cadangan makanan tersebut berguna " +
                "untuk …."
    )

    private val JawabBiji = arrayOf(
        "serbuk sari dan sel telur",
        "monokotil",
        "dikotil",
        "inti biji",
        "bertahan hidup"
    )
}