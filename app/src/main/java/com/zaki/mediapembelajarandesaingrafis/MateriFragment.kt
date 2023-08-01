package com.zaki.mediapembelajarandesaingrafis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.zaki.mediapembelajarandesaingrafis.databinding.FragmentMateriBinding

class MateriFragment : Fragment() {

    private var _binding : FragmentMateriBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMateriBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvMateriSatu.setOnClickListener {
            findNavController().navigate(R.id.action_materiFragment_to_materiSatuFragment)
        }

        binding.extend1.setOnClickListener {
            findNavController().navigate(R.id.action_materiFragment_to_materiSatuFragment)
        }

        binding.tvMateriDua.setOnClickListener {
            findNavController().navigate(R.id.action_materiFragment_to_materiDuaFragment)
        }

        binding.extend2.setOnClickListener {
            findNavController().navigate(R.id.action_materiFragment_to_materiDuaFragment)
        }

        binding.tvMateriTiga.setOnClickListener {
            findNavController().navigate(R.id.action_materiFragment_to_materiTigaFragment)
        }

        binding.extend3.setOnClickListener {
            findNavController().navigate(R.id.action_materiFragment_to_materiTigaFragment)
        }

        binding.tvMateriEmpat.setOnClickListener {
            findNavController().navigate(R.id.action_materiFragment_to_materiEmpatFragment)
        }

        binding.extend4.setOnClickListener {
            findNavController().navigate(R.id.action_materiFragment_to_materiEmpatFragment)
        }

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }


    }
}