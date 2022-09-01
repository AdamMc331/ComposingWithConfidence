package com.adammcneilly.composingwithconfidence.designsystem.components

import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

/**
 * These [Paparazzi] tests render various implementations of a [CWCTextField]
 * and compares the screenshot to the golden values in the snapshots folder.
 */
class CWCTextFieldPaparazziTest {
    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun renderEmptyTextField() {
        paparazzi.snapshotScreen {
            CWCTextField(
                text = "",
                onTextChanged = {},
                labelText = "Text Field",
            )
        }
    }

    @Test
    fun renderFilledTextField() {
        paparazzi.snapshotScreen {
            CWCTextField(
                text = "Input",
                onTextChanged = {},
                labelText = "Text Field",
            )
        }
    }

    @Test
    fun renderErrorTextField() {
        paparazzi.snapshotScreen {
            CWCTextField(
                text = "Input",
                onTextChanged = {},
                labelText = "Text Field",
                errorMessage = "Invalid Input",
            )
        }
    }
}
