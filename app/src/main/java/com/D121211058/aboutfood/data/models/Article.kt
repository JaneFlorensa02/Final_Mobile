package com.D121211058.aboutfood.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class Article(
    @SerialName("idCategory")
    val idCategory: String?,
    @SerialName("strCategory")
    val strCategory: String?,
    @SerialName("strCategoryThumb")
    val strCategoryThumb: String?,
    @SerialName("strCategoryDescription")
    val strCategoryDescription: String?
) : Parcelable


