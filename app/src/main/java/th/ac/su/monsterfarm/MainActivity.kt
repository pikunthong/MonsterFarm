package th.ac.su.monsterfarm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import th.ac.su.monsterfarm.Utils.getJsonDataFromAsset

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonFileString = getJsonDataFromAsset(applicationContext,"monster_data.json")

        Log.i("data",jsonFileString)
    }
}
