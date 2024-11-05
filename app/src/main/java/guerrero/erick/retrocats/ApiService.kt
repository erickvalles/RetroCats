package guerrero.erick.retrocats

import retrofit2.http.GET

interface ApiService {
    @GET("/api/cats?tags=tag1,tag2&skip=0&limit=10")
    suspend fun getCats(): List<Cat>

}