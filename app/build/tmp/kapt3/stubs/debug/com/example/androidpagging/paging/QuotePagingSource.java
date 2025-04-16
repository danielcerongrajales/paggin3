package com.example.androidpagging.paging;

import android.util.Log;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.example.androidpagging.domain.model.Result;
import com.example.androidpagging.data.QuoteAPI;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\rH\u0016\u00a2\u0006\u0002\u0010\u000eJ(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/androidpagging/paging/QuotePagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/example/androidpagging/domain/model/Result;", "quoteAPI", "Lcom/example/androidpagging/data/QuoteAPI;", "onDataReceived", "Lkotlin/Function1;", "Lcom/example/androidpagging/paging/data;", "", "(Lcom/example/androidpagging/data/QuoteAPI;Lkotlin/jvm/functions/Function1;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class QuotePagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.example.androidpagging.domain.model.Result> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidpagging.data.QuoteAPI quoteAPI = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.androidpagging.paging.data, kotlin.Unit> onDataReceived = null;
    
    public QuotePagingSource(@org.jetbrains.annotations.NotNull()
    com.example.androidpagging.data.QuoteAPI quoteAPI, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.androidpagging.paging.data, kotlin.Unit> onDataReceived) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.example.androidpagging.domain.model.Result>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.example.androidpagging.domain.model.Result> state) {
        return null;
    }
}