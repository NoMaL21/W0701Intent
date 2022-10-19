package kr.ac.kumoh.s20181132.w0701intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20181132.w0701intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var view: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)

        view.btnHomepage.setOnClickListener {
            val uri = Uri.parse("https://naver.com")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        view.btnMap.setOnClickListener {
            //val uri = Uri.parse("geo:36.145014,128.393047?z=17")
            val uri = Uri.parse("geo:0,0?z=17&q=경북 경산시 성암로 5길 10-2")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        view.btnTelephone.setOnClickListener {
            val uri = Uri.parse("sms:010-4914-8313")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}