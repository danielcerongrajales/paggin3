package com.example.androidpagging.presentation;

import androidx.lifecycle.ViewModel;
import androidx.paging.PagingData;
import com.example.androidpagging.domain.model.Result;
import com.example.androidpagging.domain.repository.QuoteRepository;
import com.example.androidpagging.paging.data;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/example/androidpagging/presentation/QuoteViewModel;", "Landroidx/lifecycle/ViewModel;", "quoteRepository", "Lcom/example/androidpagging/domain/repository/QuoteRepository;", "(Lcom/example/androidpagging/domain/repository/QuoteRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/androidpagging/presentation/ProductsUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getProducts", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class QuoteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidpagging.domain.repository.QuoteRepository quoteRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.androidpagging.presentation.ProductsUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.androidpagging.presentation.ProductsUiState> uiState = null;
    
    @javax.inject.Inject()
    public QuoteViewModel(@org.jetbrains.annotations.NotNull()
    com.example.androidpagging.domain.repository.QuoteRepository quoteRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.androidpagging.presentation.ProductsUiState> getUiState() {
        return null;
    }
    
    public final void getProducts() {
    }
}