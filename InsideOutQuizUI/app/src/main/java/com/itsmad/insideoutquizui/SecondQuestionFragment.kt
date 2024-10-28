package com.itsmad.insideoutquizui

// ... altre importazioni ...

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.itsmad.insideoutquizui.databinding.FragmentFirstQuestionBinding

class SecondQuestionFragment : Fragment() {
    // ... altre variabili ...

    private var _binding: FragmentFirstQuestionBinding? = null
    private val binding get() = _binding!!

    // ... altri metodi ...

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstQuestionBinding.inflate(inflater, container, false)

        binding.answer1.setOnClickListener {
            checkAnswer1()
        }

        binding.answer2.setOnClickListener {
            checkAnswer2()
        }

        binding.answer3.setOnClickListener {
            checkAnswer3()
        }

        binding.answer4.setOnClickListener {
            checkAnswer4()
        }

        return binding.root
    }

    //metodi per salvare le risposte
    private fun checkAnswer1() {
        AppRepository.q2_answer1 = true
    }

    private fun checkAnswer2() {
        AppRepository.q2_answer2 = true
    }

    private fun checkAnswer3() {
        AppRepository.q2_answer3 = true
    }

    private fun checkAnswer4() {
        AppRepository.q2_answer4 = true
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // ... altri metodi ...
}