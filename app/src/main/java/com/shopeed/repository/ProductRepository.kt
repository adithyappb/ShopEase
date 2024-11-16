package com.shopeed.repository

import com.shopeed.model.Product
import com.shopeed.network.ApiService
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getProducts(): List<Product> {
        return apiService.getProducts()
    }
}
