package com.project.mengenalbagiantumbuhan.ui.video

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import com.project.mengenalbagiantumbuhan.R
import com.project.mengenalbagiantumbuhan.data.Videos
import com.project.mengenalbagiantumbuhan.ui.detail.DetailActivity

class VideoAdapter(val listdata: ArrayList<Videos>, private val context: Context) : RecyclerView.Adapter<VideoAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    var api_key = "AIzaSyAFfemQhnni0ZxtaU-KtAX7SuRymSAg6oU"

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.item_video_text)
        var ypPlayer: YouTubePlayerView = itemView.findViewById(R.id.item_ytPlayer)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_videos, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val materi = listdata[position]
        holder.tvTitle.text = materi.title
        holder.ypPlayer.initialize(api_key, object : YouTubePlayer.OnInitializedListener{
            // Implement two methods by clicking on red error bulb
            // inside onInitializationSuccess method
            // add the video link or the
            // playlist link that you want to play
            // In here we also handle the play and pause functionality
            override fun onInitializationSuccess(
                provider: YouTubePlayer.Provider?,
                player: YouTubePlayer?,
                p2: Boolean
            ) {
                player?.loadVideo(materi.link)
                player?.play()
            }

            // Inside onInitializationFailure
            // implement the failure functionality
            // Here we will show toast
            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(context, "Video player Failed" , Toast.LENGTH_SHORT).show()
            }
        })

    }

    override fun getItemCount(): Int {
        return listdata.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Videos)
    }

}