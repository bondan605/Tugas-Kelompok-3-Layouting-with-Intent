package soft.aag.todolistapp

import android.content.Intent
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
import io.github.anderscheow.validator.Validator
import io.github.anderscheow.validator.constant.Mode
import io.github.anderscheow.validator.validator
import soft.aag.todolistapp.common.confirmPasswordValid
import soft.aag.todolistapp.common.createClickableText
import soft.aag.todolistapp.common.emailValid
import soft.aag.todolistapp.common.generalValid
import soft.aag.todolistapp.common.passwordValid
import soft.aag.todolistapp.common.toast
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
            bindValidation()
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.txtSignIn.text = "Already have an account ? Sign In".createClickableText("Sign In") {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        binding.txtSignIn.movementMethod = LinkMovementMethod.getInstance()
    }

    private fun bindValidation() {
        validator(this) {
            mode = Mode.SINGLE
            listener = setValidation()
            validate(
                generalValid(binding.textInputLayout),
                emailValid(binding.textInputLayout2),
                passwordValid(binding.textInputLayout3),
                confirmPasswordValid(binding.textInputLayout4, binding.txtPassword)
            )
        }
    }

    private fun setValidation() = object : Validator.OnValidateListener {
        override fun onValidateFailed(errors: List<String>) {}
        override fun onValidateSuccess(values: List<String>) {
            this@SignUpActivity.toast("Sing Up")
        }
    }
}