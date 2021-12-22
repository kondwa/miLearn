package co.milesoft.milearn

import android.util.Base64

object HeaderValues {
    const val contentType:String="Content-Type: application/json"
    const val clientID:String = "X-Udemy-Client-Id: "+BuildConfig.CLIENT_ID
    const val clientSecret:String = "X-Udemy-Client-Secret: "+BuildConfig.CLIENT_SECRET
    const val authorization:String = "Authorization: Basic "+ BuildConfig.CLIENT_AUTH
}