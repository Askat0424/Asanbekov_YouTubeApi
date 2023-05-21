package com.example.asanbekov_youtubeapi.ui.playlistitem

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asanbekov_youtubeapi.core.ui.BaseActivity
import com.example.asanbekov_youtubeapi.databinding.ActivityDetailBinding
import com.example.asanbekov_youtubeapi.model.PlaylistItem
import org.koin.androidx.viewmodel.ext.android.viewModel


@Suppress("UNCHECKED_CAST")
class DetailActivity : BaseActivity<ActivityDetailBinding, PlaylistItemViewModel>() {
    private lateinit var adapter: DetailAdapter

    override val viewModel:  PlaylistItemViewModel by viewModel()


    override fun initViews() {
        super.initViews()
        adapter = DetailAdapter()
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }

    override fun initViewModel() {
        super.initViewModel()
        val getIntent:String = intent.getStringExtra("id").toString()
        viewModel.getPlaylistItem(getIntent).observe(this) {
            it.data?.let { it1 -> adapter.addList(it1.items as List<PlaylistItem.Item>) }
        }

    }

    override fun inflateViewBinding(): ActivityDetailBinding {
        return ActivityDetailBinding.inflate(layoutInflater)
    }


}