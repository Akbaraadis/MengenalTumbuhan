package com.project.mengenalbagiantumbuhan.ui.video

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener
import com.google.android.youtube.player.YouTubePlayerView
import com.project.mengenalbagiantumbuhan.databinding.ActivityVideoBinding


class VideoActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    var api_key = "AIzaSyAFfemQhnni0ZxtaU-KtAX7SuRymSAg6oU"
    private lateinit var binding: ActivityVideoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.ytPlayer.initialize(api_key, this)

//        setVideo("5K1am8rI_zI", binding.ytPlayer)
    }

//    private fun setVideo(key: String, ytplayer: YouTubePlayerView){
//            ytplayer.initialize(api_key, object : YouTubePlayer.OnInitializedListener{
//            // Implement two methods by clicking on red error bulb
//            // inside onInitializationSuccess method
//            // add the video link or the
//            // playlist link that you want to play
//            // In here we also handle the play and pause functionality
//            override fun onInitializationSuccess(
//                provider: YouTubePlayer.Provider?,
//                player: YouTubePlayer?,
//                p2: Boolean
//            ) {
//                player?.loadVideo(key)
//                player?.play()
//            }
//
//            override fun onInitializationFailure(
//                p0: YouTubePlayer.Provider?,
//                p1: YouTubeInitializationResult?
//            ) {
//                Toast.makeText(this@VideoActivity, "Video player Failed" , Toast.LENGTH_SHORT).show()
//            }
//        })
//    }

    override fun onInitializationFailure(provider: YouTubePlayer.Provider?, result: YouTubeInitializationResult?) {
        Toast.makeText(this, "Failured to Initialize!", Toast.LENGTH_LONG).show()
    }

    override fun onInitializationSuccess(provider: YouTubePlayer.Provider?, player: YouTubePlayer, wasRestored: Boolean) {
        /** add listeners to YouTubePlayer instance  */
        player.setPlayerStateChangeListener(playerStateChangeListener)
        player.setPlaybackEventListener(playbackEventListener)
        /** Start buffering  */
        if (!wasRestored) {
            player.cuePlaylist("PL3mPTLmQImB3WAsEKEuKIs-iuMPMrsqAB")
        }
    }

    private val playbackEventListener: PlaybackEventListener = object : PlaybackEventListener {
        override fun onBuffering(arg0: Boolean) {}
        override fun onPaused() {}
        override fun onPlaying() {}
        override fun onSeekTo(arg0: Int) {}
        override fun onStopped() {}
    }

    private val playerStateChangeListener: PlayerStateChangeListener =
        object : PlayerStateChangeListener {
            override fun onAdStarted() {}
            override fun onError(arg0: YouTubePlayer.ErrorReason?) {}
            override fun onLoaded(arg0: String) {}
            override fun onLoading() {}
            override fun onVideoEnded() {}
            override fun onVideoStarted() {}
        }
}