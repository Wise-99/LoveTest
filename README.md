# 💘 LoveTest
## 📖 프로젝트 소개
| 메인 화면 | 질문 화면 | 답변 선택 화면 |
|--|--|--|
| ![메인 화면](https://github.com/Wise-99/LoveTest/assets/90273263/480788f4-0dff-4a25-86e3-3fae55e45908) | ![질문 화면](https://github.com/Wise-99/LoveTest/assets/90273263/2d13a9d0-7b0f-4d41-a5a8-a4465c4c19c7) | ![답변 선택 화면](https://github.com/Wise-99/LoveTest/assets/90273263/15aa6ac8-827b-445e-8e64-e1c8e8575eda) |


> 💘 Kotlin의 기본 문법을 학습하고 활용하기 위해 제작하였습니다. 질문에 대해 고른 선택지로 **심리 테스트**를 해볼 수 있는 앱입니다.
> 
> -   각 선택지마다 결과가 다르게 나타납니다.
> -   이전 버튼이나 홈 버튼으로 화면 이동을 할 수 있습니다.

## 📄 주요 업무
- Kotlin 기본 문법 학습 및 활용
- Android **jetpack**의 **Navigation Component**를 이용하여 Fragment 간 이동 기능 구현
    - 화면 이동에 **animation** 삽입
    - 화면 전환에 쓰이는 **Fragment Manager를 생략**
    - **bundleOf()**를 사용하여 선택지 별로 다른 값을 결과 화면에 넘김

## 💡 문제 해결 과정
-   코틀린은 findViewById() 대신 kotlin extension으로 바로 접근이 가능한 것이 장점이었으나 지원이 중단됨
    -   동일한 id일 경우 오류가 발생하거나, View 가 null 허용 여부를 알려주지 않는 경우가 있기 때문
    -   **View Binding**을 이용하여 접근하여 해결
