package com.feritriatmojo.uts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.feritriatmojo.uts.adapter.ItemAdapter
import com.feritriatmojo.uts.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO 1 : Inisialisasi data
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // pengaturan ini untuk meningkatkan kinerja jika Anda tahu itu berubah
        // dalam konten tidak mengubah ukuran tata letak RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}