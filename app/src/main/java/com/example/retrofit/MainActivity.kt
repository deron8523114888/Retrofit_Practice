package com.example.retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DataContract.MainActivity {

    var presenter: MainPresenter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        presenter?.retrofitGET()

    }


    fun init() {
        presenter = MainPresenter(this)

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        rv_data.layoutManager = linearLayoutManager
    }


    override fun showData(data: ArrayList<String>) {

        rv_data.adapter = RecyclerViewAdapter(data)

    }
}
