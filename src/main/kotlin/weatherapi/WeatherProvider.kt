package weatherapi

import io.ktor.client.*
import io.ktor.client.engine.apache.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*
import io.ktor.http.*
import weatherapi.data.PlaceSearchItemResponse
import weatherapi.data.WeatherForecast

class WeatherProvider {

    private val baseUrl = "https://www.metaweather.com/api"

    private var client = HttpClient(Apache) {
        install(JsonFeature)
    }

    suspend fun searchPlace(lat: Double, long: Double): List<PlaceSearchItemResponse> =
        client.get<List<PlaceSearchItemResponse>>(url = Url("$baseUrl/location/search/?lattlong=$lat,$long"))


    suspend fun getWeatherForecast(placeId: Int): WeatherForecast =
        client.get<WeatherForecast>(url = Url("$baseUrl/location/$placeId/"))

}