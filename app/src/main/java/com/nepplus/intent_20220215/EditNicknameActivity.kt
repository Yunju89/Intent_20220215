package com.nepplus.intent_20220215

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        btnSave.setOnClickListener {

//            입력된 닉네임을 변수에 저장
            val inputNickname = edtNickname.text.toString()

//            복귀 시 데이터를 들고 갈 Intent 생성.
            val resultIntent = Intent()  // 결과를 담기 위한 용도로만. 출발지 / 도착지 명시 X 메인에서 결과를 얻으러옴

//            Intent에 결과(데이터) 담기 -> putExtra사용
            resultIntent.putExtra("nick",inputNickname)

//            실제 복귀 결과로 세팅
            setResult(RESULT_OK, resultIntent)
            finish()

        }
    }
}