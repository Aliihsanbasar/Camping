package com.camping.camping.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.camping.camping.screens.authentication.LoginScreen
import com.camping.camping.screens.authentication.SplashScreen
import com.camping.camping.screens.onboarding.OnBoardingScreen

@Composable
fun CampingNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = CampingScreens.SplashScreen.name ) {

        composable(CampingScreens.LoginScreen.name){
            LoginScreen(navController = navController)
        }

        composable(CampingScreens.SplashScreen.name){
            SplashScreen(navController = navController)
        }

        composable(CampingScreens.OnBoardingScreen.name){
            OnBoardingScreen(navController = navController)
        }

    }
}