package com.alpha.apps.relam.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.alpha.apps.relam.databinding.FragmentMainBinding
import com.alpha.apps.relam.ui.base.BaseFragment

class MainFragment : BaseFragment() {


    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance(): MainFragment {
            val args = Bundle()
            val fragment = MainFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            restoreInstanceState(requireArguments())
        } else {
            restoreInstanceState(savedInstanceState)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val rootView: View = binding.root
        initInstances()
        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initInstances() {

        binding.buttonInsert.setOnClickListener {
            Toast.makeText(requireActivity(), "Insert", Toast.LENGTH_SHORT).show()

        }

        binding.buttonUpdate.setOnClickListener {
            Toast.makeText(requireActivity(), "Update", Toast.LENGTH_SHORT).show()
        }

        binding.buttonDelete.setOnClickListener {
            Toast.makeText(requireActivity(), "Delete", Toast.LENGTH_SHORT).show()

        }

        binding.buttonFilter.setOnClickListener {
            Toast.makeText(requireActivity(), "Filter", Toast.LENGTH_SHORT).show()

        }

        binding.buttonSearch.setOnClickListener {
            Toast.makeText(requireActivity(), "Search", Toast.LENGTH_SHORT).show()
        }

        binding.buttonSync.setOnClickListener {
            Toast.makeText(requireActivity(), "Sync", Toast.LENGTH_SHORT).show()

        }

    }

    private fun restoreInstanceState(requireArguments: Bundle) {


    }


}