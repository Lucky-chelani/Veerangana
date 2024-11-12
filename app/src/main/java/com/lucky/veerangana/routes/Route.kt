package com.example.safety.routes

import com.google.gson.annotations.SerializedName

data class Route(
    @SerializedName("overview_polyline") val overviewPolyline: Polyline
)