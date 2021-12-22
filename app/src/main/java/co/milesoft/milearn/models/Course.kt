package co.milesoft.milearn.models

import com.google.gson.annotations.SerializedName

data class Course(
    @SerializedName("id") var id:Int,
    @SerializedName("title") var title:String,
    @SerializedName("url") var url:String,
    @SerializedName("is_paid") var isPaid:String,
    @SerializedName("price") var price:String,
    @SerializedName("price_detail") var priceDetail:String,
    @SerializedName("price_serve_tracking_id") var priceServeTrackingId:String,
    @SerializedName("visible_instructors") var visibleInstructors:List<User>,
    @SerializedName("image_125_H") var image125H:String,
    @SerializedName("image_240x135") var image240x135:String,
    @SerializedName("is_practice_test_course") var isPracticeTestCourse:Boolean,
    @SerializedName("image_480x270") var image480x270:String,
    @SerializedName("published_title") var publishedTitle:String,
    @SerializedName("tracking_id") var trackingId:String,
    @SerializedName("headline") var headline:String
)
