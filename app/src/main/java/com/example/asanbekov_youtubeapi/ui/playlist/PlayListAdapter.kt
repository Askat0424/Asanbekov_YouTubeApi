package com.example.asanbekov_youtubeapi.ui.playlist

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asanbekov_youtubeapi.core.view.loadImage
import com.example.asanbekov_youtubeapi.databinding.ItemPlaylistBinding
import com.example.asanbekov_youtubeapi.model.Playlist

class PlayListAdapter(private val onClick: (Playlist.Item) -> Unit) :
    RecyclerView.Adapter<PlayListAdapter.PlaylistViewHolder>() {
    private var list = arrayListOf<Playlist.Item>()
    @SuppressLint("NotifyDataSetChanged")
    fun addList(list: List<Playlist.Item?>?) {
        this.list = list as ArrayList<Playlist.Item>
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        return PlaylistViewHolder(
            ItemPlaylistBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    inner class PlaylistViewHolder(private val binding: ItemPlaylistBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: Playlist.Item) {
            with(binding) {
                ivPlaylist.loadImage(item.snippet?.thumbnails?.standard?.url!!)
                tvPlaylistName.text = item.snippet.title
                tvCountVideo.text = item.contentDetails?.itemCount.toString()
                cvPlaylist.setOnClickListener {
                    onClick.invoke(item)
                }
            }
        }
    }
}