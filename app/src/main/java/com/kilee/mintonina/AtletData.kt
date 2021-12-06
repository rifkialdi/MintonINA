package com.kilee.mintonina

object AtletData {
    private val atletName = arrayOf(
        "Apriyani Rahayu",
        "Fajar Alvian",
        "Anthony Ginting",
        "Jonathan Christie",
        "Kevin Sanjaya",
        "Marcus Gideon",
        "Melati Daeva",
        "Greysia Poli",
        "Rian Ardianto",
        "Praveen Jordan"
    )

    private val atletDetail = arrayOf(
        "Apriyani Rahayu adalah pebulutangkis Indonesia spesialis ganda putri dan ganda campuran ketika junior. Di level senior, dia menjadi pebulutangkis spesialis ganda putri. Ia merupakan peraih medali perunggu ganda putri Kejuaraan Dunia 2018 di Tiongkok serta Asian Games 2018 di Jakarta.",
        "Fajar Alfian adalah pemain bulu tangkis putra Indonesia spesialis ganda putra. Ia berasal dari PB SGS PLN, Bandung, yang kemudian masuk ke pusat pelatihan nasional PBSI sejak 2014. Fajar merupakan peraih medali perak ganda putra Asian Games 2018 bersama pasangannya, Muhammad Rian Ardianto.",
        "Anthony Sinisuka Ginting adalah seorang atlet bulu tangkis tunggal putra, yang berasal dari klub SGS PLN Bandung, Indonesia. Ia memulai karier sebagai pemain bulu tangkis prestasi semenjak duduk di bangku SD dan pernah memenangi kompetisi MILO School Competition kategori tunggal putra SD pada tahun 2008.",
        "Jonatan Christie adalah pemain bulu tangkis tunggal putra Indonesia. Dia berasal dari PB. Tangkas Specs, Jakarta.",
        "Kevin Sanjaya Sukamuljo adalah salah satu pemain bulu tangkis ganda putra dan campuran Indonesia. Atlet ini merupakan pemain asal klub Djarum di Kudus, Jawa Tengah dan bergabung sejak tahun 2007.",
        "Marcus Fernaldi Gideon adalah salah satu pemain bulu tangkis ganda putra Indonesia yang dulu pernah berpasangan dengan Markis Kido di ganda putra dan ganda campuran bersama Rizki Amelia Pradipta. Pada tahun 2015, ia mulai berpasangan dengan Kevin Sanjaya Sukamuljo di ganda putra sampai sekarang.",
        "Melati Daeva Oktavianti merupakan pemain bulu tangkis asal Indonesia. Atlet kelahiran Serang ini merupakan pemain asal klub PB Djarum. Ia merupakan peraih medali emas Kejuaraan Dunia Junior BWF 2012 bersama Edi Subaktiar. Ia saat ini dipasangkan dengan Praveen Jordan di nomor ganda campuran.",
        "Greysia Polii atau sering dipanggil dengan nama Greys adalah salah satu atlet bulu tangkis ganda Indonesia pada nomor ganda putri. Atlet berdarah Minahasa ini adalah putri dari pasangan Willy Polii dan Evie Pakasi. Ia mulai bergabung di tim Piala Uber Indonesia sejak tahun 2004 dan juga tahun 2008.",
        "Muhammad Rian Ardianto adalah pemain bulu tangkis Indonesia. Ardianto bermain untuk klub Jaya Raya Jakarta dalam kejuaraan nasional. Dalam kejuaraan junior, dia telah mengumpulkan dua perak, satu perunggu di Kejuaraan Dunia Junior, dan juga sebuah perunggu di Kejuaraan Asia Junior.",
        "Praveen Jordan adalah salah satu pemain bulu tangkis Indonesia yang bermain di nomor ganda putra dan ganda campuran. Ia merupakan pemain Pelatnas sejak 2014 yang berasal dari PB Djarum Kudus."
    )

    private val atletPhoto = intArrayOf(
        R.drawable.apriyani,
        R.drawable.fajar,
        R.drawable.ginting,
        R.drawable.jonatha,
        R.drawable.kevin,
        R.drawable.marcus,
        R.drawable.melati,
        R.drawable.poli,
        R.drawable.rian,
        R.drawable.ucok
    )

    private val atletKelahiran = arrayOf(
        "29 April 1998 (usia 23 tahun), Kabupaten Konawe",
        " 7 Maret 1995 (usia 26 tahun), Bandung",
        "20 Oktober 1996 (usia 25 tahun), Cimahi",
        "15 September 1997 (usia 24 tahun)",
        "2 Agustus 1995 (usia 26 tahun), Banyuwang",
        "9 Maret 1991 (usia 30 tahun), Jakarta",
        "26 Oktober 1994 (usia 27 tahun), Serang",
        "11 Agustus 1987 (usia 34 tahun), Jakarta",
        "13 Februari 1996 (usia 25 tahun), Bantul",
        "26 April 1993 (usia 28 tahun), Bontang"
    )

    private val atletTinggi = arrayOf(
        "1,63 m",
        "1,75 m (5 ft 9 in)",
        "1,71 m",
        "1,79 m",
        "1,7 m",
        "1,68 m",
        "1,68 m",
        "1,6 m",
        "1,72 m",
        "1,86 m"
    )

    private val atletBerat = arrayOf(
        "64 kg (141 pon) (141 pon)",
        "68 kg (150 pon) (150 pon)",
        "64 kg (141 lb)",
        "75 kg (165 pon) (165 pon)",
        "55 kg (121 pon) (121 pon)",
        "70 kg (150 pon) (150 pon)",
        "63 kg",
        "57 kg (126 pon)",
        "58 kg (128 pon) (128 pon)",
        "86 kg (189 lb)"
    )

    val listData: ArrayList<Atlet>
    get(){
        val list = arrayListOf<Atlet>()
        for (position in atletName.indices){
            val atlet = Atlet()
            atlet.name = atletName[position]
            atlet.detail = atletDetail[position]
            atlet.photo = atletPhoto[position]
            atlet.kelahiran = atletKelahiran[position]
            atlet.tinggi = atletTinggi[position]
            atlet.berat = atletBerat[position]
            list.add(atlet)
        }
        return list
    }
}