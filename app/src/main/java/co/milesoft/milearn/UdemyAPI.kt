package co.milesoft.milearn

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UdemyAPI {
    companion object {
        lateinit var retrofit: Retrofit
        fun getService(): UdemyService {
            retrofit = Retrofit.Builder()
                .baseUrl("https://www.udemy.com/api-2.0/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            val service: UdemyService = retrofit.create(UdemyService::class.java)
            return service
        }
    }
}