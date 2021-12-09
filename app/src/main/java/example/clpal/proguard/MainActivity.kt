package example.clpal.proguard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import example.clpal.proguard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // https://www.youtube.com/watch?v=jv1xDepOVug
    // https://www.youtube.com/watch?v=qEEG3TPhzsU&t=131s
    // https://www.youtube.com/watch?v=jv1xDepOVug
    // https://youtu.be/jv1xDepOVug
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.proguardtext.text = resources.getString(R.string.proguardtext)

        Glide.with(this).load(R.drawable.picture).circleCrop().into(binding.image)
    }
}