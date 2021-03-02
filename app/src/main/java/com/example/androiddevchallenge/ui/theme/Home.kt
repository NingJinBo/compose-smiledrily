package com.example.androiddevchallenge.ui.theme

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.viewmodel.MainViewModel
import kotlinx.coroutines.launch

@Composable
fun Home() {
    val snackBarHostState = SnackbarHostState()
    val coroutineScope = rememberCoroutineScope()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Panda Finder")
                }
            )
        },
        snackbarHost = {
            SnackbarHost(snackBarHostState)
        }
    ) {
        val viewModel: MainViewModel = viewModel()
        val currentDog = viewModel.currentPanda
        PandaList(viewModel.pandas) { dog ->
            if (currentDog == null) {
                viewModel.showPanda(dog)
            }
        }
        if (currentDog != null) {
            PandaDetails(currentDog) {
                coroutineScope.launch {
                    snackBarHostState.showSnackbar("You have adopted ${currentDog.name}")
                }
            }
        }
    }
}