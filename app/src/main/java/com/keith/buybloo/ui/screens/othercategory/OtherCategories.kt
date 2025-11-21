package com.keith.buybloo.ui.screens.othercategory

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.keith.buybloo.R
import com.keith.buybloo.ui.theme.blueto

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtherCategoriesScreen(){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Other Categories") },
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
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Cart")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Info, contentDescription = "Info")
                }
            }
        )

        //End of TopAppBar

        Spacer(modifier = Modifier.height(10.dp))

        Column() {
            Text(text = "Welcome to Swaggy!", fontSize = 25.sp, fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 10.dp))
            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Discover unique styles across categories. Find something for every vibe!",
                modifier = Modifier.padding(start = 10.dp))
            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Shop By Category", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 10.dp))
            Spacer(modifier = Modifier.height(10.dp))

            Box{

            Image(
                painter = painterResource(id = R.drawable.jewelry),
                contentDescription = "jewelry",
                modifier = Modifier.height(200.dp).fillMaxWidth().padding(start = 10.dp, end = 10.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth
            )
                Text(text= "Jewelry",
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.Center)
                )
                Icon(imageVector = Icons.Default.Favorite,
                    contentDescription = "emoji",
                    modifier = Modifier.padding(start = 20.dp, top = 10.dp),
                    tint = Color.White)

            }

            Spacer(modifier = Modifier.height(7.dp))

            Box {
            Image(
                painter = painterResource(id = R.drawable.sneakers),
                contentDescription = "jewelry",
                modifier = Modifier.height(200.dp).fillMaxWidth().padding(start = 10.dp, end = 10.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth
            )
                Text(text= "Sneakers",
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.Center)
                )
                Icon(imageVector = Icons.Default.Favorite,
                    contentDescription = "emoji",
                    modifier = Modifier.padding(start = 20.dp, top = 10.dp),
                    tint = Color.White)
            }

            Spacer(modifier = Modifier.height(7.dp))

            Text(text = "More categories coming soon...",
                textAlign = TextAlign.Center,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                )

            Spacer(modifier = Modifier.height(10.dp))

            androidx.compose.material3.Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(blueto),
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)


            ) {
                Text(text = "Explore all Products")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Follow us on Instagram @swaggy_ke",
                textAlign = TextAlign.Center,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally))


            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Need help?Contact us at support@swaggy.co.ke",
                textAlign = TextAlign.Center,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)


            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(text = "Wear the vibe. Live the vibe", fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )












        }
    }

}

@Preview(showBackground = true)
@Composable
fun OtherCategoriesScreenPreview(){

    OtherCategoriesScreen()

}
