package com.camping.camping.screens.authentication

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.camping.camping.R
import com.camping.camping.navigation.CampingScreens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {

    val scale = remember {
        Animatable(0f)
    }

    LaunchedEffect(key1 = true, block = {
        scale.animateTo(targetValue = 0.9f,
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(8f)
                        .getInterpolation(it)
                })
        )

        delay(2000L)
        navController.navigate(CampingScreens.OnBoardingScreen.name)
    } )




    Surface(modifier = Modifier
        .fillMaxSize()
        .fillMaxHeight(),
        color = Color(0xFF84CC16)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {

            Image(painter = painterResource(R.drawable.onboarding_start_page_logo), contentDescription = null)
            Text(modifier = Modifier.padding(20.dp, 8.dp, 20.dp, 0.dp),
                text = "Makes your camping more easy, next level and helps you to follow your plannings.",
                color = Color.White,
                textAlign = TextAlign.Center)
        }
    }
}