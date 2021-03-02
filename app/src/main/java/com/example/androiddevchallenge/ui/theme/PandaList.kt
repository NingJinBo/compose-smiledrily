package com.example.androiddevchallenge.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
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
            Column(Modifier.padding(8.dp)) {
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
            "23", "Female", "Large", R.drawable.img_puppy_pingping
        ),
        Panda(
            "Anan", "Brown panda", "Chengdu, Sichuan",
            "26", "Female", "Medium", R.drawable.img_puppy_anan
        ),
        Panda(
            "lingling", "Ailuropoda melanoleuca melanoleuca", "Chengdu, Sichuan",
            "27", "Male", "Large", R.drawable.img_puppy_lingling
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
            "23", "Female", "Large", R.drawable.img_puppy_pingping
        ),
        Panda(
            "Anan", "Brown panda", "Chengdu, Sichuan",
            "26", "Female", "Medium", R.drawable.img_puppy_anan
        ),
        Panda(
            "lingling", "Ailuropoda melanoleuca melanoleuca", "Chengdu, Sichuan",
            "27", "Male", "Large", R.drawable.img_puppy_lingling
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
                "Nala", "Ailuropoda melanoleuca qinlingensis", "Sunnyvale, CA",
                "Adult", "Female", "Large", R.drawable.img_puppy_pingping
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
                "Nala", "Ailuropoda melanoleuca qinlingensis", "Sunnyvale, CA",
                "Adult", "Female", "Large", R.drawable.img_puppy_pingping
            )
        )
    }
}