package com.getman.myappfilmsearch.ui.filmdescription

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.getman.myappfilmsearch.databinding.FilmDescriptionFragmentBinding

class FilmDescriptionFragment : Fragment() {

    private var _binding: FilmDescriptionFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: FilmDescriptionViewModel

    companion object {
        fun newInstance() = FilmDescriptionFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FilmDescriptionFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(FilmDescriptionViewModel::class.java)
        val textFilmName = binding.filmName
        val textFilmDescription = binding.filmDescription
        viewModel.text.observe(viewLifecycleOwner, Observer { textFilmName.text = it })
        viewModel.text2.observe(viewLifecycleOwner, Observer { textFilmDescription.text = it })
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}