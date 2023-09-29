package soft.aag.todolistapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import soft.aag.todolistapp.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSignin.setOnClickListener {
            val intent = Intent(this, AddList::class.java)
            startActivity(intent)
        }
        binding.buttonBack.setOnClickListener {
            onBackPressed()
        }
    }
}