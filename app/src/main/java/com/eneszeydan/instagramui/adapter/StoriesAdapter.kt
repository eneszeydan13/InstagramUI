package com.eneszeydan.instagramui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eneszeydan.instagramui.databinding.StoriesDesignBinding
import com.eneszeydan.instagramui.entity.Story

class StoriesAdapter(var mContext: Context, var storiesList: List<Story>): RecyclerView.Adapter<StoriesAdapter.StoryViewHolder>() {

    inner class StoryViewHolder(storiesDesignBinding : StoriesDesignBinding): RecyclerView.ViewHolder(storiesDesignBinding.root){
        var storiesDesignBinding : StoriesDesignBinding

        init {
            this.storiesDesignBinding = storiesDesignBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = StoriesDesignBinding.inflate(layoutInflater, parent, false)
        return StoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        val story = storiesList[position]
        holder.storiesDesignBinding.story = story
        holder.storiesDesignBinding.imageView.setImageResource(mContext.resources.getIdentifier(story.imageName, "drawable", mContext.packageName))
    }

    override fun getItemCount(): Int {
        return storiesList.size
    }

}