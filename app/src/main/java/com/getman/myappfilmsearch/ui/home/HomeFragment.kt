package com.getman.myappfilmsearch.ui.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.getman.myappfilmsearch.R
import com.getman.myappfilmsearch.databinding.HomeFragmentBinding
import com.getman.myappfilmsearch.databinding.ProfileFragmentBinding
import com.getman.myappfilmsearch.ui.profile.ProfileViewModel
import com.getman.myappfilmsearch.ui.search.SearchFragment

class HomeFragment : Fragment() {

    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: HomeViewModel

    companion object {
        fun newInstance() = HomeFragment()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val textExample = binding.textHome
        viewModel.text.observe(viewLifecycleOwner, Observer { textExample.text = it })
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}