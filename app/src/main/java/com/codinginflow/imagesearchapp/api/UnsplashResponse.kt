package com.codinginflow.imagesearchapp.api

import com.codinginflow.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse (

val total: Int,
val total_pages: Int,
val results: List<UnsplashPhoto>
        ) {
}