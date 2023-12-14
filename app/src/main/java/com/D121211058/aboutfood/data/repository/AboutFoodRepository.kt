package com.D121211058.aboutfood.data.repository

import com.D121211058.aboutfood.data.response.GetAboutFoodResponse
import com.D121211058.aboutfood.data.source.remote.ApiService

class AboutFoodRepository(private val apiService: ApiService) {

    suspend fun getAboutFood(): GetAboutFoodResponse {
        return apiService.getAboutFood()
    }

}

