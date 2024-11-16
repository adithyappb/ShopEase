package com.shopeed.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CheckoutScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Checkout", modifier = Modifier.padding(16.dp))
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Please enter shipping information", modifier = Modifier.padding(8.dp))

        // Add UI for address, payment details, etc.

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /* Handle order placement */ },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Place Order")
        }
    }
}
