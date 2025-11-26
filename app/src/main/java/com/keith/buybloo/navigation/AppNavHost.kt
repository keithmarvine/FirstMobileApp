package com.keith.buybloo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.keith.buybloo.ui.screens.about.AboutScreen
import com.keith.buybloo.ui.screens.category.CategoryScreen
import com.keith.buybloo.ui.screens.home.HomeScreen
import com.keith.buybloo.ui.screens.intent.IntentScreen
import com.keith.buybloo.ui.screens.othercategory.OtherCategoriesScreen
import com.keith.buybloo.ui.screens.scaffold.ScaffoldScreen
import com.keith.buybloo.ui.screens.services.ServiceScreen
import com.keith.buybloo.ui.screens.splash.SplashScreen
import com.keith.buybloo.ui.screens.start.StartScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_OTHER) {
            OtherCategoriesScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_CATEGORY) {
            CategoryScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_SCAFFOLD) {
            ScaffoldScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }



    }
}