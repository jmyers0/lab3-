// In file: app/src/main/java/com/codepath/nationalparks/NationalPark.kt

package com.codepath.nationalparks

import com.google.gson.annotations.SerializedName

class NationalPark {    @JvmField
@SerializedName("fullName")
var name: String? = null

    @JvmField
    @SerializedName("description")
    var description: String? = null

    @JvmField
    @SerializedName("states")
    var location: String? = null

    @SerializedName("images")
    var images: List<Image>? = null

    // Convenience property to easily access the first image's URL
    val imageUrl: String? get() = images?.firstOrNull()?.url

    // Inner class to represent the nested image object in the JSON
    class Image {
        @SerializedName("url")
        var url: String? = null
    }
}

