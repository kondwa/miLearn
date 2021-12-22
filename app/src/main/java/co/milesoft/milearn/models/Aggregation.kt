package co.milesoft.milearn.models

import com.google.gson.annotations.SerializedName

data class Aggregation(
    @SerializedName("id") var id:String,
    @SerializedName("title") var title:String,
    @SerializedName("options") var options:List<Option>
)
