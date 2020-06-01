package com.example.retrofit

import android.util.Log
import com.example.retrofit.RetrofitManager.customCallback

class MainPresenter(constract: DataContract.MainActivity) : DataContract.MainPresenter {

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