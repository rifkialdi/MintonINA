package com.kilee.mintonina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DescActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "name"
        const val EXTRA_DETAIL = "detail"
        const val EXTRA_IMG = "photo"
        const val EXTRA_KELAHIRAN = "kelahiran"
        const val EXTRA_TINGGI = "tinggi"
        const val EXTRA_BERAT = "berat"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desc)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val tvName: TextView = findViewById(R.id.tv_name)
        val tvDetail: TextView = findViewById(R.id.tv_detail)
        val ivPhoto: ImageView = findViewById(R.id.img_photo)
        val tvKelahiran: TextView = findViewById(R.id.tvKelahiran)
        val tvBerat: TextView = findViewById(R.id.tvBerat)
        val tvTinggi: TextView = findViewById(R.id.tvTinggi)


        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_IMG,0)
        val kelahiran = intent.getStringExtra(EXTRA_KELAHIRAN)
        val tinggi = intent.getStringExtra(EXTRA_TINGGI)
        val berat = intent.getStringExtra(EXTRA_BERAT)

        tvName.text = name
        tvDetail.text = detail
        tvKelahiran.text = kelahiran
        tvBerat.text = berat
        tvTinggi.text = tinggi

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().override(370,370))
            .into(ivPhoto)
    }
}