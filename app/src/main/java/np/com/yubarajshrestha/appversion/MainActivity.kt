package np.com.yubarajshrestha.appversion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import np.com.yubarajshrestha.version.Version

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val version = Version("", 7)
        Log.d("YVERSION", version.current())
    }
}
