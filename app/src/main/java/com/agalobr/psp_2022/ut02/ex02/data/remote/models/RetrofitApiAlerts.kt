package com.agalobr.psp_2022.ut02.ex02.data.remote.models

import com.agalobr.psp_2022.ut02.ex02.domain.AlertResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitApiAlerts {

    private val urlAlerts = "https://plagricola.sitehub.es/api/public/alerts"
    private val apiAlerts = ApiAlerts

    init {
        ApiAlerts = buildApiEndPoints()
    }

    private fun buildClient(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(urlAlerts)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    }

    private fun buildApiEndPoints(): ApiAlerts {
        return buildClient().create(ApiAlerts::class.java)
    }
    fun getAlerts(): List<AlertResponse>{

    }
}