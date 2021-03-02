package com.example.androiddevchallenge.ui.theme

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.viewmodel.MainViewModel
import kotlinx.coroutines.launch

@Composable
fun MyPanda() {
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
        val currentPanda = viewModel.currentPanda
        PandaList(viewModel.pandas) { panda ->
            if (currentPanda == null) {
                viewModel.showPanda(panda)
            }
        }
        if (currentPanda != null) {
            PandaDetails(currentPanda) {
                coroutineScope.launch {
                    snackBarHostState.showSnackbar("You have adopted ${currentPanda.name}")
                }
            }
        }
    }
}