package org.wit.placemark.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*
import org.wit.placemark.activities.PlacemarkActivity

@Parcelize
data class PlacemarkModel (var id: Long =0,
                           var title: String = "",
                           var description: String = "",
                           var image: String = "",
                           var lat: Double = 0.0,
                           var lng: Double = 0.0,
                           var editText2: String ="",
                           var editText3: String="",

                           var zoom: Float = 0f) : Parcelable {
}



@Parcelize
data class Location(var lat: Double = 0.0,
                    var lng: Double = 0.0,
                    var zoom: Float = 0f) : Parcelable

