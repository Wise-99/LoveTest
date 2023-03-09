package com.wise99.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.wise99.lovetest.R
import com.wise99.lovetest.databinding.FragmentResultBinding
import com.wise99.lovetest.databinding.FragmentSelectionBinding

class ResultFragment : Fragment() {

    var option = -1
    lateinit var navController: NavController

    // 1. 뷰 바인딩 설정
    // xml파일명의 첫 글자와 언더바_ 다음 글자를 대문자로 바꾸고 Binding을 붙여 주면 됨
    lateinit var binding: FragmentResultBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // arguments?.getInt("index")가 null 일 때 -1을 반환
        option = arguments?.getInt("index")?:-1

        binding = FragmentResultBinding.inflate(inflater, container, false) // 사용할 레이아웃, 인수(부모), 프레그먼트 자동으로 추가할 것 인지

        // 2. 프래그먼트 레이아웃 뷰 반환
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        setResult(option)
        binding.btnHome.setOnClickListener{
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }


    fun setResult(option : Int){
        when(option){
            1 -> {
                // setText() 와 같음
                binding.tvMain.text = "당신은 포기를 잘 하는 사람!"
                binding.tvSub.text = "당신은 사람을 쉽게 놓칠 수 있어요."
            }
            2 -> {
                binding.tvMain.text = "지금은 자기 자신에게 집중해야 할 때!"
                binding.tvSub.text = "전 애인에게 집착하게 될 수도 있어요."
            }
            3 -> {
                binding.tvMain.text = "지금은 느긋 해져야 할 때!"
                binding.tvSub.text = "당신은 무엇이 필요하든 미친 짓을 할 수 있어요."
            }
            4 -> {
                binding.tvMain.text = "당신은 어른스러운 사람!"
                binding.tvSub.text = "당신은 이별을 쉽게 받아 들일 수 있어요."
            }
        }
    }
}