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
package com.example.androiddevchallenge.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Panda

@Composable
fun PandaDetails(panda: Panda, onAdopt: (Panda) -> Unit = {}) {
    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.secondary)
    ) {
        Box {
            Image(
                painterResource(panda.picture),
                "panda picture: ${panda.name}",
                Modifier.aspectRatio(1f),
                contentScale = ContentScale.Crop
            )
            Button(
                { onAdopt(panda) },
                Modifier
                    .align(Alignment.TopStart)
                    .padding(20.dp)
            ) {
                Text(text = "Adopt")
            }
        }
        Column(Modifier.padding(20.dp, 10.dp)) {
            Text("Name: ${panda.name}", style = MaterialTheme.typography.h2)
            ProvideTextStyle(MaterialTheme.typography.h5) {
                Text("Breed: ${panda.breed}")
                Text("Location: ${panda.location}")
                Text("Age: ${panda.age}")
                Text("Gender: ${panda.gender}")
                Text("Size: ${panda.size}")
            }
        }
    }
}

@Preview
@Composable
fun PandaDetailsPreview() {
    PandaDetails(
        Panda(
            "PingPing", "Ailuropoda melanoleuca melanoleuca", "Chengdu, Sichuan",
            "23", "Female", "1.2m", R.drawable.img_puppy_pingping
        )
    )
}
