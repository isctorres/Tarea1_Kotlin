package itcelaya.hola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var noClicks:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun hola(view: View){
        Toast.makeText(this,"Hola",Toast.LENGTH_SHORT).show()
    }

    public fun contarClicks(view: View){
        noClicks++
        txtContador.text = noClicks.toString()
    }
}
