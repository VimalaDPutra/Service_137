package com.example.service_137

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button facebook
        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/vimaladputra"))
            startActivity(i)
        })

        //button instagram
        btn_instagram.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/vimaladputra"))
            startActivity(i)
            })

        //mendeklerasikaan variabel
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.celengan)

        //button memutar
        btn_play.setOnClickListener{
            MediaPlayer?.start()
        }

        //button pause
        btn_pause.setOnClickListener{
            MediaPlayer?.pause()
        }

        //button stop
        btn_stop.setOnClickListener{
            MediaPlayer?.stop()
        }
    }
}
