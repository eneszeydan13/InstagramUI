package com.eneszeydan.instagramui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eneszeydan.instagramui.databinding.PostDesignBinding

class PostAdapter(var mContext: Context, var list: List<String>): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    inner class PostViewHolder(postDesingBinding: PostDesignBinding): RecyclerView.ViewHolder(postDesingBinding.root){
        var postDesingBinding: PostDesignBinding

        init {
            this.postDesingBinding = postDesingBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = PostDesignBinding.inflate(layoutInflater, parent, false)
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val postImage = list[position]
        holder.postDesingBinding.imageView4.setImageResource(mContext.resources.getIdentifier(postImage, "drawable", mContext.packageName))
    }

    override fun getItemCount(): Int {
        return list.size
    }

}