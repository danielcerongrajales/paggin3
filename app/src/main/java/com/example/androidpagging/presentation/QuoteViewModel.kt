package com.example.androidpagging.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.androidpagging.domain.model.Result
import com.example.androidpagging.domain.repository.QuoteRepository
import com.example.androidpagging.paging.data
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class ProductsUiState(
    val products: PagingData<Result> = PagingData.empty(),
    val errorMessage: data? = null
)


@HiltViewModel
class QuoteViewModel @Inject constructor(
    private val quoteRepository: QuoteRepository
) : ViewModel() {
    private val _uiState = MutableStateFlow(ProductsUiState())
    val uiState: StateFlow<ProductsUiState> = _uiState.asStateFlow()

    fun getProducts() {
        viewModelScope.launch {
            quoteRepository.getQuotes({hola ->
                _uiState.update {  it.copy(errorMessage = hola)}
            }).cachedIn(viewModelScope)
                .collectLatest{data ->
                    _uiState.update { it.copy(products = data)}
                }
        }
    }


}