package com.example.mywikypedia

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mywikypedia.databinding.FragmentvideomakerBinding

class FragmentVideoMaker:Fragment() {
lateinit var binding: FragmentvideomakerBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentvideomakerBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnvideomaker.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.videomaker.com/"))
            startActivity(intent)  }



        }
    }
