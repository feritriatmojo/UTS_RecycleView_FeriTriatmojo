package com.feritriatmojo.uts.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//TODO 1 : Membuat class affirmation yang terdapat mewakili satu afirmasi dan berisi ID resource string dengan afirmasi.
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)