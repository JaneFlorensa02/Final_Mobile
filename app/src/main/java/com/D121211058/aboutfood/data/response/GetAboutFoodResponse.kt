package com.D121211058.aboutfood.data.response

import com.D121211058.aboutfood.data.models.Article
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetAboutFoodResponse(
    @SerialName("categories")
    val categories: Article?,
)