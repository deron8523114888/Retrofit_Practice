package com.example.retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofit.mvp.DataContract
import com.example.retrofit.mvp.DataPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DataContract.View {

    var dataPresenter: DataPresenter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        dataPresenter?.retrofitGET()

    }


    fun init() {
        dataPresenter = DataPresenter(this)

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        rv_data.layoutManager = linearLayoutManager
    }


    override fun showData(data: ArrayList<String>) {

        rv_data.adapter = RecyclerViewAdapter(data)

    }
}
