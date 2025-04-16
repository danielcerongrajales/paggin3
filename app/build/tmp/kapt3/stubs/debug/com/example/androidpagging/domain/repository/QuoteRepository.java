package com.example.androidpagging.domain.repository;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.example.androidpagging.paging.QuotePagingSource;
import com.example.androidpagging.data.QuoteAPI;
import com.example.androidpagging.paging.data;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/androidpagging/domain/repository/QuoteRepository;", "", "quoteAPI", "Lcom/example/androidpagging/data/QuoteAPI;", "(Lcom/example/androidpagging/data/QuoteAPI;)V", "getQuotes", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/androidpagging/domain/model/Result;", "onDataReceived", "Lkotlin/Function1;", "Lcom/example/androidpagging/paging/data;", "", "app_debug"})
public final class QuoteRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidpagging.data.QuoteAPI quoteAPI = null;
    
    @javax.inject.Inject()
    public QuoteRepository(@org.jetbrains.annotations.NotNull()
    com.example.androidpagging.data.QuoteAPI quoteAPI) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.androidpagging.domain.model.Result>> getQuotes(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.androidpagging.paging.data, kotlin.Unit> onDataReceived) {
        return null;
    }
}