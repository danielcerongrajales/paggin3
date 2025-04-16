package com.example.androidpagging.domain.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.androidpagging.paging.QuotePagingSource
import com.example.androidpagging.data.QuoteAPI
import com.example.androidpagging.paging.data
import javax.inject.Inject


class QuoteRepository @Inject constructor(private val quoteAPI: QuoteAPI) {

    fun getQuotes(onDataReceived: (data) -> Unit) = Pager(
        config = PagingConfig(pageSize = 20, maxSize = 100),
        pagingSourceFactory = { QuotePagingSource(quoteAPI,onDataReceived) }
    ).flow

    
}