package com.yitimo.musix.pages

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yitimo.musix.R

class MineFragment : Fragment() {
    companion object {
        val TAG: String = MineFragment::class.java.simpleName
        fun newInstance() = MineFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_mine)
        val view = inflater.inflate(R.layout.fragment_mine, container, false)
        return view
    }
}
