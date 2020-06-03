package com.example.retrofit.mvp

import com.example.retrofit.DataBean

interface DataContract {

    interface View {
        fun showData(data: ArrayList<DataBean>)

        fun loadFailure()
    }

    interface Presenter {
        fun retrofitGet()
    }
}