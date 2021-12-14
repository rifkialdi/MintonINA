package com.kilee.mintonina

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class about : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "About"

        val imgGithub: ImageView = findViewById(R.id.idimggithub)
        val ibTelp: ImageView = findViewById(R.id.idibtelp)

        imgGithub.setOnClickListener{
            val uri = Uri.parse("https://github.com/rifkialdi")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        ibTelp.setOnClickListener{
            val telp = "0895602527209"
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$telp"))
            startActivity(intent)
        }
    }

}