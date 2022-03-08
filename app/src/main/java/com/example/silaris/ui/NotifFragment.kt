package com.example.silaris.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.silaris.adapter.NotifAdapter
import com.example.silaris.data.DataNotif
import com.example.silaris.databinding.FragmentNotifBinding

class NotifFragment : Fragment() {
    private var _binding : FragmentNotifBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentNotifBinding.inflate(layoutInflater, container, false)
        binding.recycleItemNotif.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 1)
            adapter = NotifAdapter(DataNotif.listNotif)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val NOTIF_DATA = "Notif"
    }
}