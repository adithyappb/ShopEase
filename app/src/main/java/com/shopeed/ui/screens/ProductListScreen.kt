package com.shopeed.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.shopeed.viewmodel.ProductViewModel
import com.shopeed.ui.components.ProductItem

@Composable
fun ProductListScreen(viewModel: ProductViewModel = hiltViewModel()) {
    val products = viewModel.products.collectAsState()

    LaunchedEffect(true) {
        viewModel.fetchProducts()
    }

    Column(modifier = Modifier.fillMaxSize()) {
        if (products.value.isEmpty()) {
            Text(text = "Loading Products...", modifier = Modifier.padding(16.dp))
        } else {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(products.value) { product ->
                    ProductItem(product = product)
                }
            }
        }
    }
}
