package com.shopeed.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shopeed.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val repository: ProductRepository
) : ViewModel() {

    var products = mutableStateOf<List<Product>>(emptyList())
        private set

    fun fetchProducts() {
        viewModelScope.launch {
            products.value = repository.getProducts()
        }
    }
}
