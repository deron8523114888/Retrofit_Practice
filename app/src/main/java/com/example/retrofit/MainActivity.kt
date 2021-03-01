package com.example.retrofit

import android.opengl.Visibility
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofit.mvp.DataContract
import com.example.retrofit.mvp.DataPresenter
import com.timchentw.loadingview.LoadingView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DataContract.View {

    private var dataPresenter: DataPresenter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        click()

    }


    fun init() {
        dataPresenter = DataPresenter(this)

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        rv_data.layoutManager = linearLayoutManager
    }


    override fun showData(data: ArrayList<DataBean>) {
        tv_reloadview.finishLoading(true)
        rv_data.adapter = RecyclerViewAdapter(data)
    }


    override fun loadFailure(){
        tv_reloadview.finishLoading(false)
    }

    fun click(){

        bt_download.setOnClickListener {

            tv_reloadview.startLoading()
            dataPresenter?.retrofitGet()
        }

        tv_reloadview.listener = object : LoadingView.OnLoadingViewListener {
            override fun onReload() {
                tv_reloadview.startLoading()
                dataPresenter?.retrofitGet()
            }
        }

    }
}
