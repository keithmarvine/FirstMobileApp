package com.keith.buybloo.ui.screens.category

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        // TopApp Bar

        TopAppBar(
            title = { Text(text = "Product Categories") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Blue,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White

            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            }
        )



        //End of TopApp Bar






    }


}

@Preview(showBackground = true)
@Composable
fun CategoryScreenPreview(){

    CategoryScreen()

}
