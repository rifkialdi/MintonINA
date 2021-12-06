package com.kilee.mintonina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvAtlet: RecyclerView
    private var list: ArrayList<Atlet> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAtlet = findViewById(R.id.rv_badminton)
        rvAtlet.setHasFixedSize(true)

        list.addAll(AtletData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when (selectedMode){
            R.id.action_about ->{
                val goAbout = Intent(this@MainActivity, about::class.java)
                startActivity(goAbout)
            }
        }
    }

    private fun showRecyclerList(){
        rvAtlet.layoutManager = LinearLayoutManager(this)
        val listAtletAdapter = ListAtletAdapter(list)
        rvAtlet.adapter = listAtletAdapter
    }
}