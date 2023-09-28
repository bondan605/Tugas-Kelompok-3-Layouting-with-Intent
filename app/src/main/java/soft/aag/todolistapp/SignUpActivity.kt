package soft.aag.todolistapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.Toast
import soft.aag.todolistapp.common.createClickableText
import soft.aag.todolistapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bindView()
    }

    private fun bindView() {
        binding.btnSignUp.setOnClickListener {
            Toast.makeText(this, "Sign Up", Toast.LENGTH_LONG).show()
        }

        binding.txtSignIn.text = "Already have an account ? Sign In".createClickableText("Sign In") {
            Toast.makeText(this, "Sign In", Toast.LENGTH_LONG).show()
        }
        binding.txtSignIn.movementMethod = LinkMovementMethod.getInstance()
    }
}