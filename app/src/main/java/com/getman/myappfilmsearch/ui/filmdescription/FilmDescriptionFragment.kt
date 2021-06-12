package com.getman.myappfilmsearch.ui.filmdescription

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import com.getman.myappfilmsearch.R
import com.getman.myappfilmsearch.databinding.FilmDescriptionFragmentBinding
import com.getman.myappfilmsearch.viewBinding

class FilmDescriptionFragment : Fragment(R.layout.film_description_fragment) {

    private val viewBinding: FilmDescriptionFragmentBinding by viewBinding(
        FilmDescriptionFragmentBinding::bind
    )

    private val viewModel: FilmDescriptionViewModel by viewModels()

    companion object {
        fun newInstance() = FilmDescriptionFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBinding.root
    }
}