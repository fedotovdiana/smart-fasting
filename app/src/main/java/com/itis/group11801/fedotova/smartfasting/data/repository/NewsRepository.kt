package com.itis.group11801.fedotova.smartfasting.data.repository

import androidx.lifecycle.LiveData
import com.itis.group11801.fedotova.smartfasting.data.ResultWrapper
import com.itis.group11801.fedotova.smartfasting.domain.model.News

interface NewsRepository {

    suspend fun getNews(): LiveData<ResultWrapper<List<News>>>
}
