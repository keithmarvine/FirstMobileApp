package com.keith.buybloo.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.keith.buybloo.R
import com.keith.buybloo.navigation.ROUT_HOME
import com.keith.buybloo.ui.theme.blueto
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SplashScreen(navController: NavHostController) {


    val coroutineScope = rememberCoroutineScope()

    coroutineScope.launch {

        delay(2000)
        navController.navigate(ROUT_HOME)

    }

    Column(
        modifier = Modifier.fillMaxSize().background(blueto),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.watch),
            contentDescription = "jewelry",
            modifier = Modifier.size(width=50.dp, height= 50.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(text = "WATCH OUT ",
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold

            )
    }


}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){

    SplashScreen(rememberNavController())

}