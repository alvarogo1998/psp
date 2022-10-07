package com.agalobr.psp_2022.ut02.ex02.data.remote.models

import com.agalobr.psp_2022.ut02.ex02.domain.AlertResponse
import retrofit2.http.GET
import retrofit2.Call

interface ApiAlerts {

    @GET("alerts")
    fun getAlerts(): Call<List<AlertResponse>>
}