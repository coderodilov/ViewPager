package uz.coderodilov.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.coderodilov.viewpager.adapter.ImageAdapter
import uz.coderodilov.viewpager.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val id = intent.getIntExtra("imageId", 0)
        val imageAdapter = ImageAdapter(this)
        binding.viewPager.adapter = imageAdapter
        binding.viewPager.currentItem = id

    }
}