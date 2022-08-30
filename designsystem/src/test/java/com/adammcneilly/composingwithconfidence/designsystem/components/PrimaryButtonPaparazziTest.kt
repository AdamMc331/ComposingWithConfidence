package com.adammcneilly.composingwithconfidence.designsystem.components

import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class PrimaryButtonPaparazziTest {
    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun renderEnabledButton() {
        paparazzi.snapshotScreen {
            PrimaryButton(
                text = "Enabled Button",
                onClick = {},
                enabled = true,
            )
        }
    }

    @Test
    fun renderDisabledButton() {
        paparazzi.snapshotScreen {
            PrimaryButton(
                text = "Disabled Button",
                onClick = {},
                enabled = false,
            )
        }
    }
}
