package com.shopeed.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.shopeed.model.Product

@Composable
fun ProductItem(product: Product) {
    Card(modifier = Modifier.padding(16.dp)) {
        Column(modifier = Modifier.padding(8.dp)) {
            Image(painter = painterResource(id = product.image), contentDescription = null)
            Text(text = product.name, color = Color.Black)
            BasicText(text = "$${product.price}")
        }
    }
}
