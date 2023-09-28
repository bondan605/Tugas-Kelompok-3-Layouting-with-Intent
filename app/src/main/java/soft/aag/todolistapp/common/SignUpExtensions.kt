package soft.aag.todolistapp.common

import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.view.View

fun String.createClickableText(clickableText: String, action: () -> Unit): SpannableString {
    val spannableString = SpannableString(this)
    val startIndex = this.indexOf(clickableText)
    val endIndex = startIndex + clickableText.length

    val clickableSpan = object : ClickableSpan() {
        override fun onClick(view: View) {
            action()
        }
    }

    spannableString.setSpan(clickableSpan, startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    val color = Color.parseColor("#55847A")
    val foregroundColorSpan = ForegroundColorSpan(color)
    spannableString.setSpan(foregroundColorSpan, startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

    return spannableString
}