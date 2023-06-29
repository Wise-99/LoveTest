# 💘 LoveTest
## 📖 프로젝트 소개
| 메인 화면 | 질문 화면 | 답변 선택 화면 |
|--|--|--|
| ![메인 화면](https://github.com/Wise-99/LoveTest/assets/90273263/480788f4-0dff-4a25-86e3-3fae55e45908)
| ![질문 화면](https://file.notion.so/f/s/7f4063c5-ee21-42c2-9c7f-9ccf2a9a8d15/Untitled.png?id=6b2bb482-5bf0-433e-b49c-4ededea2907d&table=block&spaceId=4fee607c-9fab-47df-96d0-8ba12808c88d&expirationTimestamp=1687417970002&signature=hsT_yO8rxJRNi236FDTRWYHMiFsl1KKYVIVTcB3EJoo&downloadName=Untitled.png) | ![답변 선택 화면](https://file.notion.so/f/s/196f1a58-6ded-41dd-8e0a-806d8523eaf2/Untitled.png?id=77da3aa1-ee28-48e7-bc93-e9406634246d&table=block&spaceId=4fee607c-9fab-47df-96d0-8ba12808c88d&expirationTimestamp=1687417975061&signature=G3THVHkoqJLpBVnV81v0tDlyrl8uFrGuXwnx08_FGlg&downloadName=Untitled.png) |


> 💘 Kotlin의 기본 문법을 학습하고 활용하기 위해 제작하였습니다. 질문에 대해 고른 선택지로 **심리 테스트**를 해볼 수 있는 앱입니다.
> 
> -   각 선택지마다 결과가 다르게 나타납니다.
> -   이전 버튼이나 홈 버튼으로 화면 이동을 할 수 있습니다.

## 📄 주요 업무
-   Android jetpack의 Navigation Component를 이용하여 앱 화면 간 이동 기능 구현
-   여러 개의 Fragment를 활용하여 UI 구현
-   View binding을 이용하여 OnClickListener 구현

## 💡 깨달은 점
-   Java 기반 언어이기에 구조가 비슷하지만 문법이 간단하여 코드 양을 줄일 수 있었음
-   navigation과 **Fragment**를 이용하여 앱 생명주기에 대해 다시 생각해 볼 수 있었음
-   코틀린은 findViewById() 대신 kotlin extension으로 바로 접근이 가능한 것이 장점이었으나 지원이 중단됨
    -   동일한 id일 경우 오류가 발생하거나, View 가 null 허용 여부를 알려주지 않는 경우가 있기 때문
    -   따라서 **뷰 바인딩**을 이용하여 접근해야 함
