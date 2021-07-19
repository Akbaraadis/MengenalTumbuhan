package com.project.mengenalbagiantumbuhan.data

import com.project.mengenalbagiantumbuhan.R

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question>{
        val questionsList=ArrayList<Question>()

        // 1
        val que1=Question(
            1, "Tumbuhan hijau dapat membuat segar udara karena menghasilkan...",
            0,
            "a. Oksigen",
            "b. Karbondioksida",
            "c. Air",
            "d. Kalsium",
            1
        )
        questionsList.add(que1)
        // 2
        val que2 = Question(
            2, "Berikut ini yang bukan merupakan bagian dari tumbuhan, yaitu…",
            0,
            "a. Akar", "b. Tanah",
            "c. Bunga", "d. Biji", 2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Bagian tubuh tumbuhan yang perannya sangat penting untuk mempertahankan kelestariannya adalah…",
            0,
            "a. Bunga", "b. Biji",
            "c. Akar", "d. Daun", 2
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Secara umum, ada berapa bagian pada tubuh tumbuhan?",
            0,
            "a. Tiga", "b. Empat",
            "c. Lima", "d. Enam", 3
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Bagian tubuh tumbuhan yang pada umumnya tumbuh searah dengan gaya gravitasi bumi adalah…",
            0,
            "a. Akar", "b. Bunga",
            "c. Biji", "d. Daun", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Batang adalah bagian tanaman yang menempel pada … dan berada di ….. permukaan tanah. ",
            0,
            "a. Biji dan di dalam", "b. Biji dan di luar",
            "c. Akar dan di dalam", "d. Akar dan di luar", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Bagian tubuh tumbuhan yang tubuhnya menempel dan tumbuh di bagian batang pohon adalah…",
            0,
            "a. Daun", "b. Biji",
            "c. Akar", "d. Bunga", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Daun memiliki fungsi utama pada tumbuhan yakni…",
            0,
            "a. Menyimpan cadangan makanan", "b. Bakal tumbuhan baru",
            "c. Membuat/memasak makanan", "d. Perkembangan bunga", 3
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Mengangkut air dan mineral yang diserap oleh akar ke daun merupakan salah satu fungsi dari bagian tubuh tumbuhan yaitu bagian …",
            0,
            "a. Biji", "b. Bunga",
            "c. Batang", "d. Daun", 3
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Pada bagian batang tanaman berkayu, terdapat bagian yang bertugas untuk mengangkut makanan hasil fotosintesis dari daun ke semua bagian tumbuhan yaitu…",
            0,
            "a. Pembuluh tapis", "b. Pembuluh kambium",
            "c. Pembuluh kayu", "d. Pembuluh kalium", 1
        )

        questionsList.add(que10)

        // 11
        val que11 = Question(
            11, "Bagian tumbuhan yang menghubungkan bagian tubuh tanaman dengan tanah atau media tempat tanaman tersebut tumbuh disebut…",
            0,
            "a. Biji", "b. Akar",
            "c. Daun", "d. Batang ", 2
        )

        questionsList.add(que11)

        // 12
        val que12 = Question(
            12, "Pada bagian biji, biji memiliki keping. Biji ada yang berkeping satu dan ada yang berkeping dua. Biji yang berkeping dua disebut…",
            0,
            "a. Majemuk", "b. Dikotil",
            "c. Monokotil", "d. Klorofil ", 2
        )

        questionsList.add(que12)

        // 13
        val que13 = Question(
            13, "Tanaman yang memiliki akar tunggang umumnya merupakan golongan…",
            0,
            "a. Majemuk", "b. Klorofil",
            "c. Dikotil", "d. Monokotil", 3
        )

        questionsList.add(que13)

        // 14
        val que14 = Question(
            14, "Tumbuhan yang memiliki biji tunggal disebut dengan tumbuhan…",
            0,
            "a. Monokotil", "b. Majemuk",
            "c. Klorofil", "d. Dikotil", 1
        )

        questionsList.add(que14)

        // 15
        val que15 = Question(
            15, "Yang merupakan contoh dari tanaman yang batangnya berkambium adalah pohon…",
            0,
            "a. Kelapa", "b. Tebu",
            "c. Palem", "d. Mangga", 4
        )

        questionsList.add(que15)

        // 16
        val que16 = Question(
            16, "Jenis-jenis daun dibedakan menjadi 2, yaitu berdasarkan…",
            0,
            "a. Tulang daun dan bunga", "b. Bunga dan jumlah helai daun",
            "c. Jumlah helai daun dan akar", "d. Tulang daun dan jumlai helai daun", 4
        )

        questionsList.add(que16)

        // 17
        val que17 = Question(
            17, "Salah satu upaya manusia untuk menjaga melestarikan lingkungan yaitu…",
            0,
            "a. Menanam tumbuhan", "b. Menebang pohon",
            "c. Memangkas tanaman", "d. Membuat karya dari tumbuhan", 1
        )

        questionsList.add(que17)

        // 18
        val que18 = Question(
            18, "Pada buah terdapat daging buah. Daging buah adalah",
            0,
            "a. Bagian yang sukar dimakan", "b. Bagian yang biasanya dimakan",
            "c. Bagian yang dibuang", "d. Bagian yang berfotosintesis", 2
        )

        questionsList.add(que18)

        // 19
        val que19 = Question(
            19, "Pernyataan di bawah ini yang merupakan pernyataan yang benar mengenai bunga adalah…",
            0,
            "a. Bagian yang berada pada bagian bawah akar", "b. Memiliki fungsi untuk menjaga kelestariannya",
            "c. Sebagai alat reproduksi pada tanaman", "d. Bagian yang biasa dimakan manusia", 3
        )

        questionsList.add(que19)

        // 20
        val que20 = Question(
            20, "Gambar tersebut merupakan kegiatan/proses pada daun yang disebut…",
            R.drawable.quiz_20,
            "a. Fotositesis", "b. Pembuahan",
            "c. Penyerbukan", "d. Fotosintesis", 4
        )

        questionsList.add(que20)

        // 21
        val que21 = Question(
            21, "Berdasarkan tabel di bawah, manakah yang termasuk jenis tanaman yang tempat menyimpan cadangan makanannya di akar?",
            R.drawable.quiz_21,
            "a. 1, 2, dan 3", "b. 2, 3, dan 4",
            "c. 3, 4, dan 6", "d. 1, 2, dan 5", 4
        )

        questionsList.add(que21)

        // 22
        val que22 = Question(
            22, "Daun sirih merupakan contoh dari jenis daun yang bentuk tulangnya…",
            0,
            "a. Menyirip", "b. Melengkung",
            "c. Menjari", "d. Sejajar ", 2
        )

        questionsList.add(que22)

        // 23
        val que23 = Question(
            23, "Yang merupakan contoh dari tanaman yang berakar serabut adalah…",
            0,
            "a. Padi, Mangga, Jambu", "b. Kelapa, Jeruk, Mangga",
            "c. Kelapa, Padi, Rumput-rumputan", "d. Rumput-rumputan, Mangga, Jambu", 3
        )

        questionsList.add(que23)

        // 24
        val que24 = Question(
            24, "Bagian tumbuhan yang terdiri dari tangkai, kelopak dan mahkota…",
            0,
            "a. Bunga", "b. Batang",
            "c. Biji", "d. Daun", 1
        )

        questionsList.add(que24)

        // 25
        val que25 = Question(
            25, "Alat kelamin betina pada bunga disebut…",
            0,
            "a. Putik", "b. Benang sari",
            "c. Mahkota", "d. Kelopak", 1
        )

        questionsList.add(que25)

        // 26
        val que26 = Question(
            26, "Alat kelamin jantan pada bunga disebut…",
            0,
            "a. Putik", "b. Benang sari",
            "c. Mahkota", "d. Kelopak", 2
        )

        questionsList.add(que26)

        // 27
        val que27 = Question(
            27, "Lapisan paling luar pada buah untuk melindungi buah disebut…",
            0,
            "a. Tangkai buah", "b. Kulit buah",
            "c. Daging buah", "d. Biji", 2
        )

        questionsList.add(que27)

        // 28
        val que28 = Question(
            28, "Berdasarkan gambar di bawah, termasuk ke jenis daun apakah pada gambar tersebut?",
            R.drawable.quiz_28,
            "a. Daun Ganda", "b. Daun Majemuk",
            "c. Daun Tunggal", "d. Daun Sejajar", 3
        )

        questionsList.add(que28)

        // 29
        val que29 = Question(
            29, "Daun putri malu termasuk ke dalam jenis daun…",
            0,
            "a. Daun Ganda", "b. Daun Majemuk",
            "c. Daun Tunggal", "d. Daun Sejajar", 2
        )

        questionsList.add(que29)

        // 30
        val que30 = Question(
            30, "Salah satu fungsi dari bunga adalah…",
            0,
            "a. Sebagai pengangkut air", "b. Sebagai tempat menyimpan cadangan makanan",
            "c. Sebagai penopang tanaman", "d. Sebagai perhiasan tumbuhan", 4
        )

        questionsList.add(que30)

        // 31
        val que31 = Question(
            31, "Berdasarkan gambar di bawah, dimanakah letak tempat menyimpan cadangan makanannya?",
            R.drawable.quiz_31,
            "a. Batang", "b. Daun",
            "c. Akar", "d. Bunga", 1
        )

        questionsList.add(que31)

        // 32
        val que32 = Question(
            32, "Berdasarkan bentuk pertulangan daunnya, daun dibedakan menjadi 5 jenis. Manakah gambar yang merupakan jenis daun sejajar?",
            R.drawable.quiz_32,
            "a. Gambar i", "b. Gambar ii",
            "c. Gambar iii", "d. Gambar iv", 1
        )

        questionsList.add(que32)

        // 33
        val que33 = Question(
            33, "Batang tanaman berdasarkan bentuknya dibedakan menjadi 3 jenis, di antaranya kecuali…",
            0,
            "a. Batang berkayu", "b. Batang basah",
            "c. Batang rumput", "d. Batang kering", 4
        )

        questionsList.add(que33)

        // 34
        val que34 = Question(
             34, "Mengangkut air dan mineral yang diserap oleh akar ke daun merupakan fungsi dari…",
            0,
            "a. Daun", "b. Batang",
            "c. Akar", "d. Bunga", 2
        )

        questionsList.add(que34)

        // 35
        val que35 = Question(
             35, "Tanaman jambu merupakan contoh tumbuhan berbatang…",
            0,
            "a. Batang kering", "b. Batang rumput",
            "c. Batang berkayu", "d. Batang basah", 3
        )

        questionsList.add(que35)

        // 36
        val que36 = Question(
             36, "Mangga dan jeruk adalah tumbuhan yang memiliki akar…",
            0,
            "a. Serabut", "b. Tunggal",
            "c. Ganda", "d. Tunggang", 4
        )

        questionsList.add(que36)

        // 37
        val que37 = Question(
            37, "Cermati teks berikut ini! “Bunga-bunga di sekitar rumah Aisyah terlihat cantik dan sangat subur, serta memiliki warna yang beraneka. Aisyah sangat senang merawat bunga-bunga tersebut. ia menyiramkan setiap hari dan memberikan pupuk secara teratur. Bunga membuat rumah Aisyah terlihat indah dan sedap dipandang. Terdapat beberapa jenis bunga yang mengeluarkan wangi seperti bunga melati, sehingga udara di sekitar rumah Aisyah segar dan harum.” Berdasarkan teks tersebut, perilaku apa yang harus kita lakukan terhadap tumbuhan yang ada di lingkungan sekitar?",
            0,
            "a. Mencium dan menghirup bunga", "b. Memiliki bunga beraneka warna",
            "c. Memelihara dan merawat tumbuhan", "d. Membiarkan tumbuhan hingga mati", 3
        )

        questionsList.add(que37)

        // 38
        val que38 = Question(
             38, "Zat hijau yang terdapat pada daun disebut…",
            0,
            "a. Kolera", "b. Klorofil",
            "c. Fotosintesis", "d. Kalium", 2
        )

        questionsList.add(que38)

        // 39
        val que39 = Question(
             39, "Berdasarkan gambar tersebut, apa nama bagian bunga yang ditunjukkan oleh anak panah?",
            R.drawable.quiz_39,
            "a. Kelopak", "b. Tangkai",
            "c. Mahkota", "d. Biji", 3
        )

        questionsList.add(que39)

        // 40
        val que40 = Question(
             40, "Salah satu fungsi dari daun adalah…",
            0,
            "a. Sebagai alat pernapasan pada tumbuhan", "b. Sebagai perhiasan tumbuhan",
            "c. Sebagai tempat tumbuhnya daun, bunga, dan buah", "d. Sebagai penyokong tubuh tumbuhan", 1
        )

        questionsList.add(que40)
        return questionsList

    }
}