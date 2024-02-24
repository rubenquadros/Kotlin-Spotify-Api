package com.ruben.spotify.api.models

import com.ruben.spotify.api.ExcludeFromCoverage
import com.ruben.spotify.api.playlist.models.FollowersInfo
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@ExcludeFromCoverage
@Serializable
internal data class ArtistInfo(
    @SerialName("external_urls")
    val externalUrls: ExternalUrls,
    @SerialName("followers")
    val followers: FollowersInfo? = null,
    @SerialName("genres")
    val genres: List<String>? = null,
    @SerialName("href")
    val href: String,
    @SerialName("id")
    val id: String,
    @SerialName("images")
    val images: List<ImageInfo>? = null,
    @SerialName("name")
    val name: String,
    @SerialName("popularity")
    val popularity: Int? = null,
    @SerialName("type")
    val type: String,
    @SerialName("uri")
    val uri: String
)
