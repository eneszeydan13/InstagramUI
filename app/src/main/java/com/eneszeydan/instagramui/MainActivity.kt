package com.eneszeydan.instagramui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.databinding.DataBindingUtil
import com.eneszeydan.instagramui.adapter.PostAdapter
import com.eneszeydan.instagramui.adapter.StoriesAdapter
import com.eneszeydan.instagramui.databinding.ActivityMainBinding
import com.eneszeydan.instagramui.entity.Story

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val s1 = Story("red", "Earth")
        val s2 = Story("blue", "Curious")
        val s3 = Story("red", "News")
        val s4 = Story("yellow", "Mobile")
        val s5 = Story("green", "Holiday")
        val stories = ArrayList<Story>()
        stories.add(s1)
        stories.add(s2)
        stories.add(s3)
        stories.add(s4)
        stories.add(s5)
        val adapter = StoriesAdapter(applicationContext, stories)
        binding.adapter = adapter

        val posts = listOf("p1", "p2", "p3", "p4", "p5")
        val adapter2 = PostAdapter(applicationContext, posts)
        binding.adapter2 = adapter2

        setContentView(binding.root)
    }

}