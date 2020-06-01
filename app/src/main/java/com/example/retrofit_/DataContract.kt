package com.example.retrofit_

interface DataContract {

    interface MainActivity {

        fun showData(data: ArrayList<String>)

    }


    interface MainPresenter {
        fun retrofitGET()
    }


}