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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Panda

@Composable
fun PandaList(pandas: List<Panda>, onPandaClick: (Panda) -> Unit = {}) {
    LazyColumn(
        Modifier.background(MaterialTheme.colors.secondary),
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(pandas) { panda ->
            PandaItem(
                panda,
                Modifier
                    .clickable {
                        onPandaClick(panda)
                    }
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun PandaItem(panda: Panda, modifier: Modifier = Modifier) {
    Card(modifier) {
        Row {
            Image(
                painterResource(panda.picture),
                "Picture of Panda: ${panda.name}",
                Modifier.size(120.dp),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(10.dp)) {
                Text(panda.name, style = MaterialTheme.typography.h4)
                Text(panda.breed)
                Text(panda.location)
            }
        }
    }
}

@Preview
@Composable
fun PandaListPreview() {
    val pandas = listOf(
        Panda(
            "PingPing", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
            "23", "Female", "1.2m", R.drawable.img_puppy_pingping
        ),
        Panda(
            "Anan", "Brown panda", "Chengdu, Sichuan",
            "26", "Female", "1.5m", R.drawable.img_puppy_anan
        ),
        Panda(
            "Lingling", "Ailuropoda melanoleuca melanoleuca", "Chengdu, Sichuan",
            "27", "Male", "1.8m", R.drawable.img_puppy_lingling
        )
    )
    MyTheme {
        PandaList(pandas)
    }
}

@Preview
@Composable
fun PandaListPreviewDark() {
    val pandas = listOf(
        Panda(
            "PingPing", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
            "23", "Female", "1.2m", R.drawable.img_puppy_pingping
        ),
        Panda(
            "Anan", "Brown panda", "Chengdu, Sichuan",
            "26", "Female", "1.5m", R.drawable.img_puppy_anan
        ),
        Panda(
            "lingling", "Ailuropoda melanoleuca melanoleuca", "Chengdu, Sichuan",
            "27", "Male", "1.8m", R.drawable.img_puppy_lingling
        )
    )
    MyTheme(darkTheme = true) {
        PandaList(pandas)
    }
}

@Preview
@Composable
fun PandaItemPreview() {
    MyTheme {
        PandaItem(
            Panda(
                "PingPing", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "23", "Female", "1.2m", R.drawable.img_puppy_pingping
            )
        )
    }
}

@Preview
@Composable
fun PandaItemPreviewDark() {
    MyTheme(darkTheme = true) {
        PandaItem(
            Panda(
                "PingPing", "Ailuropoda melanoleuca qinlingensis", "Chengdu, Sichuan",
                "23", "Female", "1.2m", R.drawable.img_puppy_pingping
            )
        )
    }
}
