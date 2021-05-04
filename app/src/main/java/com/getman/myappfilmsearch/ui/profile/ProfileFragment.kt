package com.getman.myappfilmsearch.ui.profile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.getman.myappfilmsearch.R
import com.getman.myappfilmsearch.databinding.ProfileFragmentBinding
import com.getman.myappfilmsearch.databinding.SearchFragmentBinding
import com.getman.myappfilmsearch.ui.search.SearchFragment
import com.getman.myappfilmsearch.ui.search.SearchViewModel

class ProfileFragment : Fragment() {

    private var _binding: ProfileFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: ProfileViewModel

    companion object {
        fun newInstance() = ProfileFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = ProfileFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
        val textExample = binding.textProfile
        viewModel.text.observe(viewLifecycleOwner, Observer { textExample.text = it })
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}