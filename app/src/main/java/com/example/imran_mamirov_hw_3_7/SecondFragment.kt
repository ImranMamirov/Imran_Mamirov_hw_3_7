package com.example.imran_mamirov_hw_3_7

import AdapterMusic
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imran_mamirov_hw_3_7.databinding.FragmentFirstBinding
import com.example.imran_mamirov_hw_3_7.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = AdapterMusic(
            arrayListOf(
                ItemMusic("Shape of you", "Ed Sheeran", "1", "3:56"),
                ItemMusic("Bohemian Rhapsody", "Queen", "2", "5:55"),
                ItemMusic("Billie Jean", "Michael Jackson", "3", "4:54"),
                ItemMusic("Hotel California", "Eagles", "4", "6:30"),
                ItemMusic("Smells Like Teen Spirit", "Nirvana", "5", "5:01"),
                ItemMusic("Stairway to Heaven", "Led Zeppelin", "6", "8:02"),
                ItemMusic("Imagine", "John Lennon", "7", "3:04"),
                ItemMusic("Hey Jude", "The Beatles", "8", "7:11"),
                ItemMusic("Like a Rolling Stone", "Bob Dylan", "9", "6:13"),
                ItemMusic("Thriller", "Michael Jackson", "10", "5:57"),
            ), this::onClick
        )
        binding.rvMusic.adapter = adapter
    }

    private fun onClick(position: Int?) {
        val intent = Intent(activity, SecondActivity::class.java)
        intent.putExtra("key", position)
        startActivity(intent)
    }
}