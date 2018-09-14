package nagoya.kyoto.quakeshare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainSelectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_select)

        val weakQuakeButton : Button = findViewById(R.id.weakQuakeButton)
        val strongQuakeButton: Button = findViewById(R.id.strongQuakeButton)

        weakQuakeButton.setOnClickListener{
            Toast.makeText(this,"よわいボタンが押されました",Toast.LENGTH_SHORT).show()
        }

        strongQuakeButton.setOnClickListener{
            Toast.makeText(this,"つよいボタンが押されました",Toast.LENGTH_SHORT).show()
        }
    }
}