package np.com.yubarajshrestha.appversion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import np.com.yubarajshrestha.version.Version

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val version = Version("https://play.google.com/store/apps/details?id=com.cerdillac.introcreator", 7)
        Log.d("HELLO", version.current())
        //version_text.text = version.current().toString()
    }
}
