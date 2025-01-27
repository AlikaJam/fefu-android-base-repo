package ru.fefu.activitytracker.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }
    companion object{
            fun newInstance(message: String): ProfileFragment {
            val args = Bundle()
            args.putString("message", message)
            val fragment = ProfileFragment()
            fragment.arguments = args
            return fragment
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.change.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_changePassFragment)
        }
        binding.saveBtn.setOnClickListener{}
        binding.buttonLogout.setOnClickListener{}
    }
}
