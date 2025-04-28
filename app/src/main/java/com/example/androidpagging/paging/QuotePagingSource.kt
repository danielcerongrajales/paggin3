package com.example.androidpagging.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.androidpagging.domain.model.Result
import com.example.androidpagging.data.QuoteAPI

data class data(val page:String, val total:String)
class QuotePagingSource(private val quoteAPI: QuoteAPI,
                        private val onDataReceived: (data) -> Unit
) : PagingSource<Int, Result>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Result> {
        return try {
            val position = params.key ?: 1
            val response = quoteAPI.getQuotes(position)
            onDataReceived(data(page = response.page.toString(), total = response.totalCount.toString()))
            return LoadResult.Page(
                data = response.results,
                prevKey = if (position == 1) null else position - 1,
                nextKey = if (position == response.totalPages) null else position + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }

    }

    override fun getRefreshKey(state: PagingState<Int, Result>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }
}