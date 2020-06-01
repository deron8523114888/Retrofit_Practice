package com.example.retrofit.mvp

interface DataContract {

    interface View {
        fun showData(data: ArrayList<String>)
    }

    interface Presenter {
        fun retrofitGet()
    }
}