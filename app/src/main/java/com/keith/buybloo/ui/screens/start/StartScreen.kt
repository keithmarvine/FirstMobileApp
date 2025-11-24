package com.keith.buybloo.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.keith.buybloo.R
import com.keith.buybloo.navigation.ROUT_CATEGORY
import com.keith.buybloo.ui.theme.blueto

@Composable
fun StartScreen(navController: NavController){

    // 1. Main Layout
    //Style the elements vertically, we use column, row if we want them styled horizontally
    //() is for styling, {} is for  passing the contents

    Column(
        modifier = Modifier.fillMaxSize(), //fill-max size fills the entire screen

        verticalArrangement = Arrangement.Center  //To position contents at the center of the screen
    ) {
            // We'll use row to arrange elements horizontally

            //Row
        Row(
                //To make the elememts scrollable
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(start = 20.dp)

        ) {
            Image(
                //to define the url of the image, we use painter
                painter = painterResource(id = R.drawable.watch ),
                contentDescription = "Watch",
                //To adjust the size and shape of the corners
                modifier = Modifier.size(width = 200.dp, height = 300.dp).clip(shape = RoundedCornerShape(10.dp)),
                //To ensure that the image aligns to what is defined in terms of size
                contentScale = ContentScale.FillHeight

            )
            //To space the elements
            Spacer(modifier = Modifier.width(20.dp))

            Image(
                //to define the url of the image, we use painter
                painter = painterResource(id = R.drawable.watch3 ),
                contentDescription = "Watch",
                //To adjust the size and shape of the corners
                modifier = Modifier.size(width = 200.dp, height = 300.dp).clip(shape = RoundedCornerShape(10.dp)),
                //To ensure that the image aligns to what is defined in terms of size
                contentScale = ContentScale.FillHeight

            )

            Spacer(modifier = Modifier.width(20.dp))

            Image(
                //to define the url of the image, we use painter
                painter = painterResource(id = R.drawable.watch4 ),
                contentDescription = "Watch",
                //To adjust the size and shape of the corners
                modifier = Modifier.size(width = 200.dp, height = 300.dp).clip(shape = RoundedCornerShape(10.dp)),
                //To ensure that the image aligns to what is defined in terms of size
                contentScale = ContentScale.FillHeight

            )

            Spacer(modifier = Modifier.width(20.dp))

            Image(
                //to define the url of the image, we use painter
                painter = painterResource(id = R.drawable.watch6 ),
                contentDescription = "Watch",
                //To adjust the size and shape of the corners
                modifier = Modifier.size(width = 200.dp, height = 300.dp).clip(shape = RoundedCornerShape(10.dp)),
                //To ensure that the image aligns to what is defined in terms of size
                contentScale = ContentScale.FillHeight

            )
            Spacer(modifier = Modifier.width(20.dp))
        }

            //End of row
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "SHOP.DISCOVER.TREND",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = blueto,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)

        )
        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Ecommerce, or electronic commerce, is the buying and selling of products and services online through electronic networks like the internet. It encompasses all online business activities, from a consumer purchasing a product on a retailer's website to a business selling services to another business. ",
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button( onClick = {navController.navigate(ROUT_CATEGORY)},
            modifier = Modifier.height(50.dp).fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(blueto)) {

            Text(text = "Let's Get started!",
                fontSize = 20.sp
            )
        }

    }

    //End of main layout

}

//Add show-background in order for it to be white instead of black
@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(rememberNavController())

}