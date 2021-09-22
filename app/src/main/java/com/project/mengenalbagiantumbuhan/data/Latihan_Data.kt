package com.project.mengenalbagiantumbuhan.data

object Latihan_Data {

    private val SoalAkar = arrayOf(
        "Akar merupakan bagian tumbuhan yang menghubungkan tubuh tanaman dengan tanah ataupun media tanam. " +
                "Umumnya, akar akan tumbuh searah dengan ….",
        "Akar dapat digolongkan menjadi 2 jenis, yakni ….(akar serabut) dan .….",
        "Tanaman yang akarnya termasuk ke dalam jenis akar gantung adalah ….",
        "Tanaman yang berakar tunggang umumnya merupakan golongan ….",
        "Salah satu fungsi akar ialah tempat menyimpan cadangan makanan. " +
                "Tuliskan 1 contoh dari tanaman yang akarnya tempat menyimpan cadangan makanan adalah …."
    )

    private val JawabAkar = arrayOf(
        "gaya gravitasi bumi",
        "akar tunggang.",
        "beringin",
        "dikotil / biji berkeping dua",
        "Singkong/umbi-umbian/wortel"
    )

    private val SoalBatang = arrayOf(
        "Arah pertumbuhan batang berlawanan dengan akar yakni ….",
        "Pada batang tanaman berkayu, disebut bagian apakah yang bertugas " +
                "mengangkut makanan hasil fotosintesis dari daun ke semua bagian tumbuhan?",
        "Pada batang, terdapat buku-buku batang dan ruas. Buku batang adalah ….",
        "Batang tanaman dapat pula dibedakan berdasarkan bentuknya. Bayam" +
                "merupakan salah satu tanaman yang berbatang …. dengan ciri-ciri" +
                "….. dan berair.",
        "Batang juga mempunyai fungsi untuk menyimpan cadangan makanan." +
                "tuliskan 1 contoh tanaman yang batangnya sebagai tempat menyimpan" +
                "cadangan makanan …."
    )

    private val JawabBatang = arrayOf(
        "mengikuti arah sinar matahari",
        "pembuluh tapis",
        "tempat melekat/duduk daun",
        "basah, lunak",
        "tebu"
    )

    private val SoalDaun = arrayOf(
        "Daun tumbuh dan menempel pada bagian ….",
        "Daun memiliki bagian lengkap dan tidak lengkap. Tanaman yang memiliki" +
                "daun tidak lengkap yaitu hanya memiliki …. dan ….",
        "Sebutkan 4 bentuk tulang pada daun, diantaranya ….",
        "Daun majemuk adalah daun yang terdiri dari beberapa helai dalam setiap" +
                "tangkainya, contohnya daun .…",
        "Fungsi utama daun adalah tempat terjadinya proses …."
    )

    private val JawabDaun = arrayOf(
        "batang pohon",
        "tangkai daun dan helai daun",
        "menyirip, menjari, melengkung, sejajar",
        "putri malu",
        "fotosintesis/sebagai tempat membuat makanan"
    )

    private val SoalBunga = arrayOf(
        "Bunga memiliki peran pada tanaman sebagai ....",
        "Bunga memiliki beberapa bagian, seperti kelopak, mahkota, benang sari," +
                "dan putik. Bagian bunga yang menjadi organ reproduksi wanita adalah ….",
        "Bagian bunga yang mengeluarkan bau yang harum atau sedap adalah ….",
        "Bagian terluar dari bunga adalah ….",
        "Salah satu fungsi bunga bagi tumbuhan adalah sebagai …. " +
                "dan tempat perkembangbiakan tumbuhan."
    )

    private val JawabBunga = arrayOf(
        "organ reproduksi",
        "putik",
        "mahkota/tajuk bunga",
        "kelopak",
        "perhiasan tumbuhan"
    )

    private val SoalBuah = arrayOf(
        "Bagi tumbuhan yang berkembang biak dengan biji didahului dengan" +
                "pembentukan ….",
        "Bagian tumbuhan yang merupakan perkembangan dari bunga adalah ….",
        "Bagian pada buah yang dapat dimakan adalah ….",
        "Bagian pada buah yang bagiannya berfngsi sebagai tempat melekat atau" +
                "bergantung pada ranting atau dahan adalah ….",
        "Buah memiliki fungsi sebagai tempat penyimpan cadangan makanan, " +
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
        "Biji merupakan hasil dari pembuahan yang terjadi akibat penyerbukan " +
                "antara ….. dan …. pada putik.",
        "Biji memiliki keeping, ada yang berkeping satu da nada yang berkeping " +
                "dua. Biji berkeping satu disebut ….",
        "Biji berkeping dua disebut ….",
        "Bagian biji yang terletak di dalam biji dan dilapisi oleh kulit biji adalah ….",
        "Salah satu fungsi biji adalah sebagai jaringan penyimpan cadangan " +
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

    val listdataLth: ArrayList<Latihan>
        get() {
            val list = arrayListOf<Latihan>()
            for(position in SoalAkar.indices){
                val latihan = Latihan()
                latihan.soalakar = SoalAkar[position]
                latihan.jawabakar = JawabAkar[position]
                latihan.soalbatang = SoalBatang[position]
                latihan.jawabbatang = JawabBatang[position]
                latihan.soaldaun = SoalDaun[position]
                latihan.jawabdaun = JawabDaun[position]
                latihan.soalbunga = SoalBunga[position]
                latihan.jawabunga = JawabBunga[position]
                latihan.soalbuah = SoalBuah[position]
                latihan.jawabuah = JawabBuah[position]
                latihan.soalbiji = SoalBiji[position]
                latihan.jawabiji = JawabBiji[position]
                list.add(latihan)
            }
            return list
        }
}