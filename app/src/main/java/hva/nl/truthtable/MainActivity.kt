package hva.nl.truthtable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {checkAnswer()}
    }

    private fun checkAnswer() {
        var succes = true

        val answer1 = answer1.text.toString()
        val answer2 = answer2.text.toString()
        val answer3 = answer3.text.toString()
        val answer4 = answer4.text.toString()

        if (answer1 != R.string.true_text.toString()) {
            succes = false
        }
        if (answer2 != R.string.false_text.toString()) {
            succes = false
        }
        if (answer3 != R.string.false_text.toString()) {
            succes = false
        }
        if (answer4 != R.string.false_text.toString()) {
            succes = false
        }

        if (!succes) {
            Toast.makeText(this, getString(R.string.false_text), Toast.LENGTH_LONG).show()
            return
        }
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()

    }
}
