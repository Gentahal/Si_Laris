package com.example.silaris.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.silaris.R
import com.example.silaris.databinding.FragmentNotifBinding
import com.example.silaris.databinding.FragmentTrolliBinding


class TrolliFragment : Fragment() {

    private var _binding : FragmentTrolliBinding? = null
    private val binding get() = _binding as FragmentTrolliBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTrolliBinding.inflate(layoutInflater, container, false)
        return binding.root


//        binding.addBtn.setOnClickListener {
//            var i = binding.numberTrolli.text.toString()
//            var a = 0
//            while (i < i + 1){
//                a += i
//                i++
//                if (a == i + 1){
//                    break
//                }
//
//
//            }
//        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addBtn.setOnClickListener {
            binding.numberTrolli.text = (binding.numberTrolli.text.toString().toInt()+1).toString()
        }
        binding.minBtn.setOnClickListener {
            binding.numberTrolli.text = (binding.numberTrolli.text.toString().toInt()-1).toString()
        }
    }



}