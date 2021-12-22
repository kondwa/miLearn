package co.milesoft.milearn

import co.milesoft.milearn.models.Course
import co.milesoft.milearn.models.GetCoursesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface UdemyService {
    @Headers(
        HeaderValues.contentType,
        HeaderValues.clientID,
        HeaderValues.clientSecret,
        HeaderValues.authorization
    )
    @GET("courses")
    fun getCourses():Call<GetCoursesResponse>

    @Headers(
        HeaderValues.contentType,
        HeaderValues.clientID,
        HeaderValues.clientSecret,
        HeaderValues.authorization
    )
    @GET("courses/{id}")
    fun getCourse(@Path("id") id:Int):Call<Course>
}