package soft.aag.todolistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Dashboard5 : AppCompatActivity() {

    private lateinit var checkboxContainer: LinearLayout
    private lateinit var templateCheckBox: CheckBox
    private lateinit var addButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard5)

        checkboxContainer = findViewById(R.id.container)
        templateCheckBox = findViewById(R.id.checkBox)
        addButton = findViewById(R.id.fab_add)

        addCheckBox("Menonton Close The Door")
        addCheckBox("Makan makanan 4 sehat 5 sempurna")
        addCheckBox("Berdoa")

        addButton.setOnClickListener { addNewCheckbox() }
    }

    private fun addCheckBox(text: String) {
        val newCheckBox = CheckBox(this)
        newCheckBox.text = text
        checkboxContainer.addView(newCheckBox)
    }

    private fun addNewCheckbox() {
        val newCheckBox = CheckBox(this)
        val txtName: EditText = findViewById(R.id.edit_checkbox)

        newCheckBox.text = txtName.text.toString()
        checkboxContainer.addView(newCheckBox)
    }
}