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
import com.wise99.lovetest.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    lateinit var navController: NavController

    // 1. 뷰 바인딩 설정
    // xml파일명의 첫글자와 언더바_ 다음 글자를 대문자로 바꾸고 Binding을 붙여주면 됨
    lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMainBinding.inflate(inflater, container, false) // 사용할 레이아웃, 인수(부모), 프레그먼트 자동으로 추가할 것 인지

        // 2. 프래그먼트 레이아웃 뷰 반환
        return binding.root
    }

    override fun onViewCreated(view : View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        binding.btnNext.setOnClickListener{
            navController.navigate(R.id.action_mainFragment_to_questionFragment)
        }
    }
}