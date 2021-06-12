package com.getman.myappfilmsearch.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.getman.myappfilmsearch.R
import com.getman.myappfilmsearch.databinding.SearchFragmentBinding
import com.getman.myappfilmsearch.viewBinding

class SearchFragment : Fragment(R.layout.search_fragment) {

    private val viewBinding: SearchFragmentBinding by viewBinding(SearchFragmentBinding::bind)

    private val viewModel: SearchViewModel by viewModels()

    companion object {
        fun newInstance() = SearchFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textExample = viewBinding.textSearch
        viewModel.text.observe(viewLifecycleOwner, Observer { textExample.text = it })
    }
}