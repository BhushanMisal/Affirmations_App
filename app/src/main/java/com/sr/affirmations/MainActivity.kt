package com.sr.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sr.affirmations.adapter.ItemAdapter
import com.sr.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize data.
        val myDataset= Datasource().loadAffermations()
        val recyclerView=findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter=ItemAdapter(this, myDataset)


        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)




    }
}