package co.milesoft.milearn.models

import com.google.gson.annotations.SerializedName

data class Option(
    @SerializedName("key") var key:String,
    @SerializedName("title") var title:String,
    @SerializedName("count") var count:Int,
    @SerializedName("value") var value:String
)
