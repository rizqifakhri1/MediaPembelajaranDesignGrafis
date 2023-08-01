package com.zaki.mediapembelajarandesaingrafis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.zaki.mediapembelajarandesaingrafis.databinding.FragmentSelectBinding

class SelectFragment : Fragment() {
    private var _binding : FragmentSelectBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSelectBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnMateri.setOnClickListener {
            findNavController().navigate(R.id.action_selectFragment_to_materiFragment)
        }

        binding.btnVideo.setOnClickListener {
            findNavController().navigate(R.id.action_selectFragment_to_videoFragment)
        }

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}