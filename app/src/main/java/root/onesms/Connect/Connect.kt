package root.onesms.Connect

import okhttp3.*
import okhttp3.logging.*
import retrofit2.*
import retrofit2.converter.gson.*

/**
 * Created by root1 on 2017. 10. 12..
 */
object Connect {

    val api: Api

    init {
        api = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY).let {
            Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(OkHttpClient.Builder().addInterceptor(it).build())
                    .baseUrl("https://www.googleapis.com/")
                    .build()
        }.let { it.create(Api::class.java) }
    }


}