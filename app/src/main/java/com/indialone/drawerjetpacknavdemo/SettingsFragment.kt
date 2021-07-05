package com.indialone.drawerjetpacknavdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.indialone.drawerjetpacknavdemo.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    private lateinit var mBinding: FragmentSettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentSettingsBinding.inflate(inflater, container, false)

        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding.btnNext.setOnClickListener {
            val navController = Navigation.findNavController(it)
            navController.navigate(R.id.action_settingsFragment_to_settingsNextFragment)
        }

    }

}