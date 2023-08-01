package com.zaki.mediapembelajarandesaingrafis

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.zaki.mediapembelajarandesaingrafis.databinding.FragmentMateriDuaBinding
import com.zaki.mediapembelajarandesaingrafis.databinding.FragmentVideoBinding


class VideoFragment : Fragment() {
    private var _binding : FragmentVideoBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentVideoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.tvVideoSatu.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://youtu.be/LQYtL41qa88") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.tvVideoDua.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://youtu.be/BFDO_-Fppd0") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.tvVideoTiga.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://youtu.be/Qwgz70fFvI8") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }


        //extend button

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.extend1.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://youtu.be/LQYtL41qa88") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.extend2.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://youtu.be/BFDO_-Fppd0") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.extend3.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://youtu.be/Qwgz70fFvI8") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}