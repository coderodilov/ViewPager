package uz.coderodilov.viewpager.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import uz.coderodilov.viewpager.data.DataProvider

class ImageAdapter(private val context: Context) : PagerAdapter() {
    private val dataProvider = DataProvider()
    private val images = dataProvider.getImagesList()

    override fun getCount(): Int = images.size

    override fun isViewFromObject(view: View, image: Any): Boolean {
        return view == image
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageView = ImageView(context)
        imageView.setImageResource(images[position])
        container.addView(imageView, 0)

        return imageView
    }

    override fun destroyItem(container: ViewGroup, position: Int, image: Any) {
        container.removeView(image as View)
    }

}