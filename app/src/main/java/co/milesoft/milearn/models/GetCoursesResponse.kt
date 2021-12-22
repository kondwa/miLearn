package co.milesoft.milearn.models

import com.google.gson.annotations.SerializedName

data class GetCoursesResponse(
    @SerializedName("count") var count:Int,
    @SerializedName("next") var next:String,
    @SerializedName("previous") var previous:String,
    @SerializedName("results") var results:List<Course>,
    @SerializedName("aggregations") var aggregations:List<Aggregation>,
    @SerializedName("search_tracking_id") var searchTrackingId:String
)
