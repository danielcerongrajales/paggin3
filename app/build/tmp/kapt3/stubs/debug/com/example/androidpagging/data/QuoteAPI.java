package com.example.androidpagging.data;

import com.example.androidpagging.domain.model.QuoteList;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/androidpagging/data/QuoteAPI;", "", "getQuotes", "Lcom/example/androidpagging/domain/model/QuoteList;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface QuoteAPI {
    
    @retrofit2.http.GET(value = "/quotes")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getQuotes(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidpagging.domain.model.QuoteList> $completion);
}