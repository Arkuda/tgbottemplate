package weatherapi.data


/*
{
    distance: 19287,
    title: "Falmouth",
    location_type: "City",
    woeid: 19894,
    latt_long: "50.151001,-5.07832"
},
 */

data class PlaceSearchItemResponse(
    val distance: Int,
    val title: String,
    val location_type : String,
    val woeid: Int,
    val latt_long: String
    )
