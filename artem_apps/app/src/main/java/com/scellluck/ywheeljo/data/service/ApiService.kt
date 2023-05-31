package com.scellluck.ywheeljo.data.service


import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.scellluck.ywheeljo.data.service.Data
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import java.util.concurrent.TimeUnit

interface ApiService {
    companion object{

        private const val BASE_URL = "http://ip-api.com/json"
        private const val MOVIES = "json"

        private const val TIMEOUT_SECOND = 30L

        private var apiService: ApiService? = null

        fun getInstance(): ApiService {
            if(apiService == null){
                apiService = createService(BASE_URL)
            }
            return apiService!!
        }

        private fun createService(url: String): ApiService {

            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .connectTimeout(TIMEOUT_SECOND, TimeUnit.SECONDS)
                .readTimeout(TIMEOUT_SECOND, TimeUnit.SECONDS)
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl(url)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(
                    GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create()
                ))
                .build()

            return retrofit.create(ApiService::class.java)
        }
    }

    @GET
    suspend fun getPhotos(): Data
}