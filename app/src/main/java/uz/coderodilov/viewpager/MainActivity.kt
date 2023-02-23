
package uz.coderodilov.viewpager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onImageSelected(view:View){
        val image = view as ImageView
        val tag = image.tag.toString().toInt()
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra("imageId", tag)
        startActivity(intent)
    }
}