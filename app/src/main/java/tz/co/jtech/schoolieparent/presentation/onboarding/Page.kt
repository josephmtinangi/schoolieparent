package tz.co.jtech.schoolieparent.presentation.onboarding

import androidx.annotation.DrawableRes
import tz.co.jtech.schoolieparent.R

data class Page(
    val title:String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "See how your Child Performs in Academics",
        description = "Explore exam marks, which allows you to compare your child's performance",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Live Location Tracking",
        description = "You can easily find your Child at school through live tracking",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Find out about your Child at school in a click",
        description = "Know more about your child's info Such as attendance, Events, Exams etc.",
        image = R.drawable.onboarding3
    )
)