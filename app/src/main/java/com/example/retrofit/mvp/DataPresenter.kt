package com.example.retrofit.mvp

import android.util.Log
import com.example.retrofit.DataBean
import com.example.retrofit.RetrofitManager
import com.example.retrofit.RetrofitManager.customCallback

class DataPresenter(view: DataContract.View) : DataContract.Presenter {

    private val mView = view

    override fun retrofitGet() {

        RetrofitManager.Data.getJsonData("doFindTypeJ", "6")
            .enqueue(customCallback<ArrayList<DataBean>> { success,
                                                      failure,
                                                      error ->

                success?.run {
                    this.body()?.let {
                        // 透過 showData 的 function, 通知 view 進行更新, 同時傳遞 data 出去
                        mView.showData(it)
                    }
                }

                failure?.run {
                    Log.d("response", "Get failure")
                }

                error?.run {
                    Log.d("response", this.toString())
                }
            })

    }


}