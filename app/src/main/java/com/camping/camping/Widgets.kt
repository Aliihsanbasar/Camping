package com.camping.camping

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.camping.camping.model.OnBoardingItems

@Composable
fun Header() {
    Surface(modifier = Modifier.padding(start = 40.dp, top = 0.dp, bottom = 0.dp, end = 40.dp)) {
        Image(painter = painterResource(R.drawable.main_logo), contentDescription = null)
    }
}