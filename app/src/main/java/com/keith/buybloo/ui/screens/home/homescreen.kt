

package com.keith.buybloo.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.keith.buybloo.R
import com.keith.buybloo.navigation.ROUT_START
import com.keith.buybloo.ui.theme.blueto

@Composable
fun HomeScreen(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

//        Image(
//            painter = painterResource(id = R.drawable.watch6),
//            contentDescription = "Luxury Watch",
//
//            //To make it circular
//            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
//            contentScale = ContentScale.Crop
//        )

        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.crown))
        val progress by animateLottieCompositionAsState(composition)

        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp)
        )
        //End



        Text(
            text = "LUXURY. CLASS. CULTURE",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = blueto,
            fontFamily = FontFamily.SansSerif

        )
        //To create a space
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "We want to be the place where you choose to come and buy that luxurious watch. BuyBloo offers quality designs to meet your every need. Come see what we have in store!",
            textAlign = TextAlign.Center

        )

        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Button(
            onClick = {navController.navigate(ROUT_START)},
            modifier = Modifier.height(50.dp).fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(blueto)


        ) {
            Text(text = "Next")
        }






    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}

