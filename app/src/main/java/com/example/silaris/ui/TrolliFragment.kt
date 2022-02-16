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
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addBtn.setOnClickListener {
            binding.numberTrolli.text = (binding.numberTrolli.text.toString().toInt()+1).toString()
        }
        binding.minBtn.setOnClickListener {
            binding.numberTrolli.text = (binding.numberTrolli.text.toString().toInt()-1).toString()
        }

        binding.addBtn1.setOnClickListener {
            binding.numberTrolli1.text = (binding.numberTrolli.text.toString().toInt()+1).toString()
        }
        binding.minBtn1.setOnClickListener {
            binding.numberTrolli1.text = (binding.numberTrolli.text.toString().toInt()-1).toString()
        }

        binding.addBtn2.setOnClickListener {
            binding.numberTrolli2.text = (binding.numberTrolli.text.toString().toInt()+1).toString()
        }
        binding.minBtn2.setOnClickListener {
            binding.numberTrolli2.text = (binding.numberTrolli.text.toString().toInt()-1).toString()
        }

    }
}