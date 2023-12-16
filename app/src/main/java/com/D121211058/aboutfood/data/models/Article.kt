package com.D121211058.aboutfood.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class Article(
    val idCategory: String?,
    val strCategory: String?,
    val strCategoryThumb: String?,
    val strCategoryDescription: String?
) : Parcelable


