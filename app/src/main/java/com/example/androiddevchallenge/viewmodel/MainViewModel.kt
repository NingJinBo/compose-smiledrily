/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Panda

class MainViewModel : ViewModel() {
    val pandas by mutableStateOf(
        listOf(
            Panda(
                "PingPing", "Ailuropoda melanoleuca melanoleuca", "Chengdu, Sichuan",
                "23", "Female", "1.2m", R.drawable.img_puppy_pingping
            ),
            Panda(
                "Anan", "Brown panda", "Chengdu, Sichuan",
                "26", "Female", "1.5m", R.drawable.img_puppy_anan
            ),
            Panda(
                "Lingling", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "27", "Male", "1.8m", R.drawable.img_puppy_lingling
            ),
            Panda(
                "Xingxing", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "28", "Male", "1.7m", R.drawable.img_puppy_xingxing
            ),
            Panda(
                "Tiantian", "Ailuropoda melanoleuca melanoleuca", "Chengdu, Sichuan",
                "30", "Female", "1.4m", R.drawable.img_puppy_tiantian
            ),
            Panda(
                "Baobao", "Ailuropoda melanoleuca melanoleuca", "Chengdu, Sichuan",
                "25", "Male", "1.7m", R.drawable.img_puppy_baobao
            ),
            Panda(
                "Yingying", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "31", "Male", "1.68m", R.drawable.img_puppy_yingying
            ),
            Panda(
                "Beibei", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "18", "Male", "1.72m", R.drawable.img_puppy_beibei
            ),
            Panda(
                "Qiangqiang", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "40", "Female", "1.81m", R.drawable.img_puppy_qiangqiang
            ),
            Panda(
                "Maomao", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "35", "Female", "1.66m", R.drawable.img_puppy_maomao
            ),
            Panda(
                "Kaikai", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "22", "Female", "1.77m", R.drawable.img_puppy_kaikai
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
