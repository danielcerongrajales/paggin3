package com.example.androidpagging.presentation;

import androidx.lifecycle.ViewModel;
import androidx.paging.PagingData;
import com.example.androidpagging.domain.model.Result;
import com.example.androidpagging.domain.repository.QuoteRepository;
import com.example.androidpagging.paging.data;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/example/androidpagging/presentation/ProductsUiState;", "", "products", "Landroidx/paging/PagingData;", "Lcom/example/androidpagging/domain/model/Result;", "errorMessage", "Lcom/example/androidpagging/paging/data;", "(Landroidx/paging/PagingData;Lcom/example/androidpagging/paging/data;)V", "getErrorMessage", "()Lcom/example/androidpagging/paging/data;", "getProducts", "()Landroidx/paging/PagingData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class ProductsUiState {
    @org.jetbrains.annotations.NotNull()
    private final androidx.paging.PagingData<com.example.androidpagging.domain.model.Result> products = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.androidpagging.paging.data errorMessage = null;
    
    public ProductsUiState(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingData<com.example.androidpagging.domain.model.Result> products, @org.jetbrains.annotations.Nullable()
    com.example.androidpagging.paging.data errorMessage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.paging.PagingData<com.example.androidpagging.domain.model.Result> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.androidpagging.paging.data getErrorMessage() {
        return null;
    }
    
    public ProductsUiState() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.paging.PagingData<com.example.androidpagging.domain.model.Result> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.androidpagging.paging.data component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidpagging.presentation.ProductsUiState copy(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingData<com.example.androidpagging.domain.model.Result> products, @org.jetbrains.annotations.Nullable()
    com.example.androidpagging.paging.data errorMessage) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}