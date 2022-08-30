package com.adammcneilly.composingwithconfidence.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Text(
            text = "This is the home screen!",
            modifier = Modifier
                .align(Alignment.Center),
        )
    }
}
