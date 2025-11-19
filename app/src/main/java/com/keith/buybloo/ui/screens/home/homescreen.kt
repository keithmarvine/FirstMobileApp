

package com.keith.buybloo.ui.screens.home

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.keith.buybloo.R

@Composable
fun HomeScreen(){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        Image(
            painter = painterResource(id = R.drawable.watch),
            contentDescription = "Luxury Watch",

            //To make it circular
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )




        Text(
            text = "Choose your product",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif

        )
        //To create a space
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "We want to be the place where you choose to come and buy that cup of coffee or the apple pie that's most delicious. BuyBloo offers quality fresh products, dairy products, meat and fish. Come see what we have in store!",
            textAlign = TextAlign.Center

        )

        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Button(
            onClick = {},
            modifier = Modifier.height(50.dp).fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)


        ) {
            Text(text = "Next")
        }






    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}

