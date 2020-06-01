package com.example.retrofit_

data class DataBean(

    var version: String,
    var UID: String,
    var title: String,
    var category: String,
    var showInfo: List<ShowInfo>,
    var showUnit: String,
    var discountInfo: String,
    var descriptionFilterHtml: String,
    var imageUrl: String,
    var masterUnit: List<String>,
    var subUnit: List<String>,
    var supportUnit: List<String>,
    var otherUnit: List<String>,
    var webSales: String,
    var sourceWebPromote: String,
    var comment: String,
    var editModifyDate: String,
    var sourceWebName: String,
    var startDate: String,
    var endDate: String,
    var hitRate: String

)

data class ShowInfo(

    var time: String,
    var location: String,
    var locationName: String,
    var onSales: String,
    var price: String,
    var latitude: Any,
    var longitude: Any,
    var endTime: String

)

