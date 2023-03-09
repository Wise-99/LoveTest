package com.wise99.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.wise99.lovetest.R
import com.wise99.lovetest.databinding.FragmentQuestionBinding
import com.wise99.lovetest.databinding.FragmentSelectionBinding

class SelectionFragment : Fragment(), View.OnClickListener{

    lateinit var navController: NavController

    // 1. 뷰 바인딩 설정
    // xml파일명의 첫 글자와 언더바_ 다음 글자를 대문자로 바꾸고 Binding을 붙여 주면 됨
    lateinit var binding: FragmentSelectionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSelectionBinding.inflate(inflater, container, false) // 사용할 레이아웃, 인수(부모), 프레그먼트 자동으로 추가할 것 인지

        // 2. 프래그먼트 레이아웃 뷰 반환
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        binding.btnBack.setOnClickListener(this)
        binding.option1.setOnClickListener(this)
        binding.option2.setOnClickListener(this)
        binding.option3.setOnClickListener(this)
        binding.option4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // view 가 null 이 되면 안되기 때문에 ? 사용
        when(v?.id){
            R.id.option_1 -> {navigateWithIndex(1)}
            R.id.option_2 -> {navigateWithIndex(2)}
            R.id.option_3 -> {navigateWithIndex(3)}
            R.id.option_4 -> {navigateWithIndex(4)}
            R.id.btn_back -> {
                navController.popBackStack()
            }
        }
    }

    fun navigateWithIndex(index : Int){
        val bundle = bundleOf("index" to index) // key, value

        navController.navigate(R.id.action_selectionFragment_to_resultFragment, bundle)
    }
}