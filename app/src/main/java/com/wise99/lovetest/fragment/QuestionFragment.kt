package com.wise99.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.wise99.lovetest.R
import com.wise99.lovetest.databinding.FragmentMainBinding
import com.wise99.lovetest.databinding.FragmentQuestionBinding

// 상속은 하나만 가능하지만 인터페이스는 여러 개 가능
// Fragment = 상속, View.OnClickListener = 인터페이스
class QuestionFragment : Fragment(),View.OnClickListener {

    lateinit var navController: NavController

    // 1. 뷰 바인딩 설정
    // xml파일명의 첫글자와 언더바_ 다음 글자를 대문자로 바꾸고 Binding을 붙여주면 됨
    lateinit var binding: FragmentQuestionBinding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {

        binding = FragmentQuestionBinding.inflate(inflater, container, false) // 사용할 레이아웃, 인수(부모), 프레그먼트 자동으로 추가할 것 인지

        // 2. 프래그먼트 레이아웃 뷰 반환
        return binding.root
    }

    override fun onViewCreated(view : View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        binding.btnNext2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // view 가 null 이 되면 안되기 때문에 ? 사용
        when(v?.id){
            R.id.btn_next2 -> {
                navController.navigate(R.id.action_questionFragment_to_selectionFragment)
            }
        }
    }
}