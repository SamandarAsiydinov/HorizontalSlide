package com.example.autoslide.util

import com.example.autoslide.R
import com.example.autoslide.model.Natural

object NaturalList {

    fun naturalList(): List<Natural> {
        return listOf(
            Natural(
                "Natural 1",
                5f,
                "Jetpack Compose 1",
                "https://i.pinimg.com/564x/0a/21/97/0a2197309dc8b9408dc8bf7ebf8ba248.jpg"
            ),
            Natural(
                "Natural 2",
                4f,
                "Jetpack Compose 2",
                "https://i.pinimg.com/564x/0a/21/97/0a2197309dc8b9408dc8bf7ebf8ba248.jpg"
            ),
            Natural(
                "Natural 3",
                1f,
                "Jetpack Compose 3",
                "https://i.pinimg.com/564x/0a/21/97/0a2197309dc8b9408dc8bf7ebf8ba248.jpg"
            ),
            Natural(
                "Natural 4",
                3f,
                "Jetpack Compose 4",
                "https://i.pinimg.com/564x/0a/21/97/0a2197309dc8b9408dc8bf7ebf8ba248.jpg"
            ),
            Natural(
                "Natural 5",
                1f,
                "Jetpack Compose 5",
                "https://i.pinimg.com/564x/0a/21/97/0a2197309dc8b9408dc8bf7ebf8ba248.jpg"
            ),
        )
    }

    fun imageList(page: Int): Int {
        return when (page) {
            1 -> R.drawable.image_1
            2 -> R.drawable.image_2
            3 -> R.drawable.image_3
            4 -> R.drawable.image_4
            5 -> R.drawable.image_5
            else -> R.drawable.image_5
        }
    }
}