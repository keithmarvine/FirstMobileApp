package com.keith.buybloo.ui.screens.category

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.keith.buybloo.R
import com.keith.buybloo.ui.theme.blueto

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
                containerColor = blueto,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White


            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Menu")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Info, contentDescription = "Menu")
                }

            }


        )
        //End of TopApp Bar

        Image(
            painter = painterResource(id = R.drawable.watch2),
            contentDescription = "Watch",
            modifier = Modifier.height(250.dp).fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(10.dp))

        //Search bar
        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
            //leading icon to be placed at the start, trailing icon to be placed at the end
            trailingIcon = {Icon(imageVector = Icons.Default.Search, contentDescription = "Search")},
            label = {Text(text = "Search our catalog")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Gray,
                focusedTrailingIconColor = blueto,
                focusedLabelColor = blueto,
                unfocusedBorderColor = blueto
            )

            


        )


        //End of Search bar

        Spacer(modifier = Modifier.height(10.dp))

        //Scrollable column
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            //Row
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.watch2),
                    contentDescription = "Watch",
                    modifier = Modifier.size(200.dp).padding(start = 10.dp),
                    contentScale = ContentScale.Crop
                )

            }

            //End of row

        }

        //End of scrollable column








    }


}

@Preview(showBackground = true)
@Composable
fun CategoryScreenPreview(){

    CategoryScreen()

}
