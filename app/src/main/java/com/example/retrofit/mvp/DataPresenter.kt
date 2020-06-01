package com.example.retrofit.mvp

import android.util.Log
import com.example.retrofit.DataBean
import com.example.retrofit.RetrofitManager
import com.example.retrofit.RetrofitManager.customCallback

class DataPresenter(constract: DataContract.View) : DataContract.Presenter {

    private val constract = constract

    var arrayList = ArrayList<String>()

    override fun retrofitGET() {

        RetrofitManager.Data.getJsonData("doFindTypeJ", "6")
            .enqueue(customCallback<List<DataBean>> { success,
                                                      failure,
                                                      error ->

                success?.run {
                    this.body()?.forEach {
                        arrayList.add(it.title)
                    }
                }

                failure?.run {
                    Log.d("response", "Get failure")
                }

                error?.run {
                    Log.d("response", this.toString())
                }

                constract.showData(arrayList)
            })

    }


}