package com.adammcneilly.composingwithconfidence.designsystem.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class PrimaryButtonPaparazziTest {
    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun renderEnabledButton() {
        paparazzi.snapshot {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
            ) {
                PrimaryButton(
                    text = "Enabled Button",
                    onClick = {},
                    enabled = true,
                )
            }
        }
    }

    @Test
    fun renderDisabledButton() {
        paparazzi.snapshot {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
            ) {
                PrimaryButton(
                    text = "Disabled Button",
                    onClick = {},
                    enabled = false,
                )
            }
        }
    }
}
