package com.example.androidpagging.presentation;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.androidpagging.databinding.ActivityMainBinding;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/example/androidpagging/presentation/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_binding", "Lcom/example/androidpagging/databinding/ActivityMainBinding;", "adapter", "Lcom/example/androidpagging/presentation/QuotePagingAdapter;", "binding", "getBinding", "()Lcom/example/androidpagging/databinding/ActivityMainBinding;", "quoteViewModel", "Lcom/example/androidpagging/presentation/QuoteViewModel;", "getQuoteViewModel", "()Lcom/example/androidpagging/presentation/QuoteViewModel;", "quoteViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private com.example.androidpagging.databinding.ActivityMainBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy quoteViewModel$delegate = null;
    private com.example.androidpagging.presentation.QuotePagingAdapter adapter;
    
    public MainActivity() {
        super();
    }
    
    private final com.example.androidpagging.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    private final com.example.androidpagging.presentation.QuoteViewModel getQuoteViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}