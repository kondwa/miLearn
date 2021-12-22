package co.milesoft.milearn.models

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("title") var title:String,
    @SerializedName("name") var name:String,
    @SerializedName("display_name") var displayName:String,
    @SerializedName("job_title") var jobTitle:String,
    @SerializedName("image_50x50") var image50x50:String,
    @SerializedName("image_100x100") var image100x100:String,
    @SerializedName("initials") var initials:String,
    @SerializedName("url") var url: String
)