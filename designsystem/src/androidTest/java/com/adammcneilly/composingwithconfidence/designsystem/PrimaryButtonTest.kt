package com.adammcneilly.composingwithconfidence.designsystem

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.adammcneilly.composingwithconfidence.designsystem.components.PrimaryButton
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PrimaryButtonTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    /**
     * This test ensures that if we render a [PrimaryButton] and it's enabled,
     * the onClick callback should be triggered.
     */
    @Test
    fun handleClickWhenEnabled() {
        var wasClicked = false

        composeTestRule.setContent {
            PrimaryButton(
                text = "Test Button",
                onClick = {
                    wasClicked = true
                },
                enabled = true,
            )
        }

        composeTestRule
            .onNodeWithText("TEST BUTTON")
            .performClick()

        assertTrue(wasClicked)
    }

    /**
     * This test ensures that if we render a [PrimaryButton] and it's disabled,
     * the onClick callback should NOT be triggered.
     */
    @Test
    fun skipHandleClickWhenDisabled() {
        var wasClicked = false

        composeTestRule.setContent {
            PrimaryButton(
                text = "Test Button",
                onClick = {
                    wasClicked = true
                },
                enabled = false,
            )
        }

        composeTestRule
            .onNodeWithText("TEST BUTTON")
            .performClick()

        assertFalse(wasClicked)
    }
}
