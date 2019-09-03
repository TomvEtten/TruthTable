package hva.nl.truthtable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubmit.setOnClickListener { checkAnswer() }
    }

    private fun checkAnswer() {
        val answer1 = input1.text.toString()
        val answer2 = input2.text.toString()
        val answer3 = input3.text.toString()
        val answer4 = input4.text.toString()

        if (answer1 != R.string.true_text.toString() && answer2 != R.string.false_text.toString() && answer3 != R.string.false_text.toString() && answer4 != R.string.false_text.toString()) {
            Toast.makeText(this, getString(R.string.false_text), Toast.LENGTH_LONG).show()
            return
        }
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()

    }
}
