package np.com.yubarajshrestha.version

import android.os.AsyncTask
import android.util.Log
import org.jsoup.Jsoup
import java.lang.Exception

class Version(private val uri: String, private var position: Int = 7): AsyncTask<Void, Void, String>() {

    override fun onPreExecute() {
        Log.d("Version LOG", "Getting app version...")
    }

    override fun doInBackground(vararg void: Void?): String {
        return try {
            val connection = Jsoup.connect(uri)
            val document = connection
                .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")
                .get()
            val element = document.select(".hAyfc .htlgb")[position]
            element.ownText()
        } catch (e: Exception) {
            e.printStackTrace()
            ""
        }
    }

    override fun onPostExecute(result: String?) {
        // DO NOTHING...
    }

    fun current(): String? {
        return this.execute().get()
    }
}