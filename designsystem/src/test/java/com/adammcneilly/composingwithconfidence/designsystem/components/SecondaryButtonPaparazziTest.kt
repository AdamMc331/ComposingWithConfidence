package com.adammcneilly.composingwithconfidence.designsystem.components

import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class SecondaryButtonPaparazziTest {
    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun renderEnabledButton() {
        paparazzi.snapshotScreen {
            SecondaryButton(
                text = "Enabled Button",
                onClick = {},
                enabled = true,
            )
        }
    }

    @Test
    fun renderDisabledButton() {
        paparazzi.snapshotScreen {
            SecondaryButton(
                text = "Disabled Button",
                onClick = {},
                enabled = false,
            )
        }
    }
}
