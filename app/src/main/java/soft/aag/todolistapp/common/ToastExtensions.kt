package soft.aag.todolistapp.common

import android.content.Context
import android.widget.Toast

fun Context.toast(s: String) {
    Toast.makeText(this, s, Toast.LENGTH_LONG).show()
}