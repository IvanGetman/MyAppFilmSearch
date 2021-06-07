package com.getman.myappfilmsearch.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import com.getman.myappfilmsearch.R
import com.getman.myappfilmsearch.databinding.HomeFragmentBinding
import com.getman.myappfilmsearch.viewBinding
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar


class HomeFragment : Fragment(R.layout.home_fragment) {

    private val viewBinding: HomeFragmentBinding by viewBinding(HomeFragmentBinding::bind)

    private val viewModel: HomeViewModel by viewModels()

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBinding.filmsList.adapter = FilmsCategoriesAdapter()

        Snackbar.make(
            view,
            R.string.app_name,
            BaseTransientBottomBar.LENGTH_LONG
        ).show()
    }
}