package com.example.androiddevchallenge.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Panda

class MainViewModel :ViewModel(){
    val pandas by mutableStateOf(
        listOf(
            Panda(
                "PingPing", "Ailuropoda melanoleuca melanoleuca", "Chengdu, Sichuan",
                "23", "Female", "Large", R.drawable.img_puppy_pingping
            ),
            Panda(
                "Anan", "Brown panda", "Chengdu, Sichuan",
                "26", "Female", "Medium", R.drawable.img_puppy_anan
            ),
            Panda(
                "lingling", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "27", "Male", "Large", R.drawable.img_puppy_lingling
            ),
            Panda(
                "Xingxing", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "28", "Male", "Small", R.drawable.img_puppy_xingxing
            ),
            Panda(
                "Tiantian", "Ailuropoda melanoleuca melanoleuca", "Chengdu, Sichuan",
                "30", "Female", "Medium", R.drawable.img_puppy_tiantian
            ),
            Panda(
                "Baobao", "Ailuropoda melanoleuca melanoleuca", "Chengdu, Sichuan",
                "25", "Male", "Medium", R.drawable.img_puppy_baobao
            ),
            Panda(
                "Yingying", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "31", "Male", "Medium", R.drawable.img_puppy_yingying
            ),
            Panda(
                "Beibei", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "18", "Male", "Medium", R.drawable.img_puppy_beibei
            ),
            Panda(
                "Qiangqiang", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "40", "Female", "Medium", R.drawable.img_puppy_qiangqiang
            ),
            Panda(
                "Maomao", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "35", "Female", "Large", R.drawable.img_puppy_maomao
            ),
            Panda(
                "Kaikai", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "22", "Female", "Medium", R.drawable.img_puppy_kaikai
            ),
        )
    )

    var currentPanda: Panda? by mutableStateOf(null)

    fun showPanda(Panda: Panda) {
        currentPanda = Panda
    }

    fun closePanda() {
        currentPanda = null
    }
}