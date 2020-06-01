package com.example.retrofit

interface DataContract {

    interface MainActivity {

        fun showData(data: ArrayList<String>)

    }


    interface MainPresenter {
        fun retrofitGET()
    }


}