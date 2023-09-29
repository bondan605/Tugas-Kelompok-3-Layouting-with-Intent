package soft.aag.todolistapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import soft.aag.todolistapp.databinding.ActivityForgotPasswordBinding
import soft.aag.todolistapp.databinding.ActivityLoginBinding

class ForgotPassword : AppCompatActivity() {
    private lateinit var binding: ActivityForgotPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSubmit.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        binding.buttonBack.setOnClickListener {
            onBackPressed()
        }
    }
}