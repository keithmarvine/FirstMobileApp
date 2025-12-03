package com.keith.buybloo.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.keith.buybloo.navigation.ROUT_CATEGORY
import com.keith.buybloo.navigation.ROUT_HOME
import com.keith.buybloo.navigation.ROUT_OTHER
import com.keith.buybloo.navigation.ROUT_START
import com.keith.buybloo.ui.screens.auth.RegisterScreen
import com.keith.buybloo.ui.theme.blueto

@Composable
fun DashboardScreen(navController: NavHostController) {

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(

        bottomBar = {
            NavigationBar(containerColor = blueto) {

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    selected = selectedIndex == 0,
                    onClick = {
                        selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "Date") },
                    selected = selectedIndex == 1,
                    onClick = {
                        selectedIndex = 1
                        navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.MailOutline, contentDescription = "Messages") },
                    selected = selectedIndex == 2,
                    onClick = {
                        selectedIndex = 2
                        navController.navigate(ROUT_START)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Profile") },
                    selected = selectedIndex == 3,
                    onClick = {
                        selectedIndex = 3
                        navController.navigate(ROUT_CATEGORY)
                    }
                )
            }
        },

        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate(ROUT_OTHER) },
                containerColor = blueto
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },

        content = { pv ->

            Column(
                modifier = Modifier
                    .padding(pv)
                    .fillMaxSize()
                    .padding(20.dp)
            ) {

                // -------------------------------
                // GREETING TEXT
                // -------------------------------
                Text(
                    text = "Hi Samantha",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Here are your projects",
                    fontSize = 16.sp,
                    color = Color.Gray
                )

                Spacer(Modifier.height(25.dp))

                // -------------------------------
                // PROJECT CARDS (HORIZONTAL)
                // -------------------------------
                Row(
                    modifier = Modifier.horizontalScroll(rememberScrollState())
                ) {

                    ProjectCard(
                        title = "Cryptocurrency\nLanding Page",
                        iconRes = R.drawable.analytics,
                        bgColor = Color(0xFF4B7BE5)
                    )

                    Spacer(Modifier.width(20.dp))

                    ProjectCard(
                        title = "Statistics\nDashboard",
                        iconRes = R.drawable.dashboard,
                        bgColor = Color(0xFFFFA726)
                    )

                    Spacer(Modifier.width(20.dp))

                    ProjectCard(
                        title = "Recent Activities",
                        iconRes = R.drawable.watch6,
                        bgColor = Color(0xFF26C6DA)
                    )
                }

                Spacer(Modifier.height(30.dp))

                // -------------------------------
                // PERSONAL TASKS
                // -------------------------------
                Text(
                    text = "Personal Tasks",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(Modifier.height(15.dp))

                TaskItem(
                    title = "NDA Review for Website Project",
                    time = "Today • 10pm"
                )

                Spacer(Modifier.height(15.dp))

                TaskItem(
                    title = "Email Reply for Green Project",
                    time = "Today • 9pm"
                )
            }
        }
    )
}

/*-----------------------------------------------------
 REUSABLE PROJECT CARD
------------------------------------------------------*/
@Composable
fun ProjectCard(title: String, iconRes: Int, bgColor: Color) {
    Column(
        modifier = Modifier
            .width(180.dp)
            .height(220.dp)
            .clip(RoundedCornerShape(22.dp))
            .padding(5.dp)
            .padding(end = 5.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxSize(),
            shape = RoundedCornerShape(22.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp)
            ) {

                Image(
                    painter = painterResource(iconRes),
                    contentDescription = null,
                    modifier = Modifier
                        .size(55.dp)
                        .clip(RoundedCornerShape(15.dp)),
                    contentScale = ContentScale.Fit
                )

                Spacer(Modifier.height(15.dp))

                Text(
                    text = title,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                )
            }
        }
    }
}

/*-----------------------------------------------------
 REUSABLE TASK ITEM
------------------------------------------------------*/
@Composable
fun TaskItem(title: String, time: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(85.dp),
        shape = RoundedCornerShape(15.dp)
    ) {
        Column(
            modifier = Modifier.padding(15.dp)
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

            Spacer(Modifier.height(5.dp))

            Row {
                Icon(
                    Icons.Default.DateRange,
                    contentDescription = null,
                    tint = blueto,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(Modifier.width(5.dp))
                Text(text = time, color = Color.Gray)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){

    DashboardScreen(rememberNavController())

}



