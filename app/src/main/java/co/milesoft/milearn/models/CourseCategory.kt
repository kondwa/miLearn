package co.milesoft.milearn.models

import com.google.gson.annotations.SerializedName

data class CourseCategory(
    @SerializedName("sort_order") var sortOrder:Int,
    @SerializedName("title") var title:String,
    @SerializedName("title_cleaned") var titleCleaned:String
)
