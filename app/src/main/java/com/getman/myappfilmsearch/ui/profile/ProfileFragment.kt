package com.getman.myappfilmsearch.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.getman.myappfilmsearch.R
import com.getman.myappfilmsearch.databinding.ProfileFragmentBinding
import com.getman.myappfilmsearch.viewBinding

class ProfileFragment : Fragment(R.layout.profile_fragment) {

    private val viewBinding: ProfileFragmentBinding by viewBinding(ProfileFragmentBinding::bind)

    private val viewModel: ProfileViewModel by viewModels()

    companion object {
        fun newInstance() = ProfileFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textExample = viewBinding.textProfile
        viewModel.text.observe(viewLifecycleOwner, Observer { textExample.text = it })
    }
}