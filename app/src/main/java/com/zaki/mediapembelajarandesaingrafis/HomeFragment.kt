package com.zaki.mediapembelajarandesaingrafis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.zaki.mediapembelajarandesaingrafis.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnMulai.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_selectFragment)
        }

        binding.icLogoapp.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_selectFragment)
        }

        binding.bgBiru.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_selectFragment)
        }

    }

}