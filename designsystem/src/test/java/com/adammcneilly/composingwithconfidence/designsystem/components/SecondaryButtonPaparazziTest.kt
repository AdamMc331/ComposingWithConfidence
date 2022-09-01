package com.adammcneilly.composingwithconfidence.designsystem.components

import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

/**
 * These [Paparazzi] tests render various implementations of a [SecondaryButton]
 * and compares the screenshot to the golden values in the snapshots folder.
 */
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
