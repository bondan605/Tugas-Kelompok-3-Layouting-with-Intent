package soft.aag.todolistapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import soft.aag.todolistapp.databinding.AddToListBinding

class AddList : AppCompatActivity() {

    private lateinit var binding: AddToListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AddToListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonAdd.setOnClickListener {
            val intent = Intent(this, Dashboard5::class.java)
            startActivity(intent)
        }
        binding.buttonBack.setOnClickListener {
            onBackPressed()
        }
    }
}