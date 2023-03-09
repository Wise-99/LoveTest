package com.wise99.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.wise99.lovetest.R

class MainFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        // 사용할 레이아웃, 인수(부모), 프레그먼트 자동으로 추가할 것 인지
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view : View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        val next_btn = findNavController(R.layout.btn_next)
    }
}