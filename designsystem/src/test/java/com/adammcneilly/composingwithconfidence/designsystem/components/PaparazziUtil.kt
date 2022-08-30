package com.adammcneilly.composingwithconfidence.designsystem.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi

/**
 * Renders the [content] inside of a [Box] composable with some padding
 * so we can see how our component looks when placed inside an actual screen.
 *
 * Otherwise, paparazzi tries to fill the whole screen with its content.
 */
fun Paparazzi.snapshotScreen(
    content: @Composable () -> Unit,
) {
    this.snapshot {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
        ) {
            content()
        }
    }
}
