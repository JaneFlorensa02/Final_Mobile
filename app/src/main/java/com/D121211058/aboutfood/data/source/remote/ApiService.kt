package com.D121211058.aboutfood.data.source.remote

import com.D121211058.aboutfood.data.response.GetAboutFoodResponse
import retrofit2.http.GET

interface ApiService {

    @GET("api/json/v1/1/categories.php")
    suspend fun getAboutFood(): GetAboutFoodResponse

}