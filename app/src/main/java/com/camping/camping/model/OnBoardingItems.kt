package com.camping.camping.model

import com.camping.camping.R

class OnBoardingItems (
    val image: Int,
    val title: Int,
    val desc: Int
){
    companion object{
        fun getData(): List<OnBoardingItems>{
            return listOf(
                OnBoardingItems(R.drawable.onboarding_image1, R.string.onBoardingTitle1, R.string.onBoardingText1),
                OnBoardingItems(R.drawable.onboarding_image2, R.string.onBoardingTitle2, R.string.onBoardingText2),
                OnBoardingItems(R.drawable.onboarding_image3, R.string.onBoardingTitle3, R.string.onBoardingText3),
                OnBoardingItems(R.drawable.onboarding_image4, R.string.onBoardingTitle4, R.string.onBoardingText4),
            )
        }
    }
}