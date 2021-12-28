package ru.fefu.activitytracker.map

import android.os.Bundle

import androidx.fragment.app.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.LinearLayoutManager

import ru.fefu.activitytracker.BaseFragment
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.adapters.NewActivityAdapter
import ru.fefu.activitytracker.databinding.FragmentStartTrakingBinding
import ru.fefu.activitytracker.lists.ListActivityTypes

class StartTrackingFragment :
    BaseFragment<FragmentStartTrakingBinding>(R.layout.fragment_start_traking) {
    private val listActivityTypes = ListActivityTypes()
    private val adapterTypes = NewActivityAdapter(listActivityTypes.getItem())
    companion object {
        fun newInstance(): StartTrackingFragment {
            return StartTrackingFragment()
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding.rcViewListTypes) {
            adapter = adapterTypes
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }
        binding.buttonStart.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(
                    R.id.fragment_container_map,
                    ProcessTrackingFragment.newInstance(),
                    "process_tracking")
                addToBackStack(null)
                commit()
            }
        }
        adapterTypes.setItemClickListener {}
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
