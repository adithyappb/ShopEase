package com.shopeed.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.shopeed.model.Product

@Composable
fun CartScreen(cartItems: List<Product>) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Your Cart", modifier = Modifier.padding(16.dp))
        Spacer(modifier = Modifier.height(16.dp))
        
        for (item in cartItems) {
            Text(text = "${item.name} - $${item.price}", modifier = Modifier.padding(8.dp))
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /* Handle Checkout */ },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Checkout")
        }
    }
}
