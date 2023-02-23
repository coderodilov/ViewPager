package uz.coderodilov.viewpager.data

import uz.coderodilov.viewpager.R

class DataProvider{
    private val imagesList: List<Int> = listOf(
        R.drawable.one,
        R.drawable.two,
        R.drawable.three,
        R.drawable.four,
        R.drawable.five,
        R.drawable.six,
        R.drawable.seven,
        R.drawable.eight
    )

    fun getImagesList(): List<Int> = imagesList
}