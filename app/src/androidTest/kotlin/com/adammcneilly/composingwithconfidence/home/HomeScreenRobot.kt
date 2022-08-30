package com.adammcneilly.composingwithconfidence.home

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onNodeWithTag

class HomeScreenRobot(
    composeTestRule: ComposeTestRule,
) {
    private val homeScreenLabel = composeTestRule.onNodeWithTag("home_screen_label")

    fun verifyLabelDisplayed() {
        homeScreenLabel.assertIsDisplayed()
    }
}

fun homeScreenRobot(
    composeTestRule: ComposeTestRule,
    block: HomeScreenRobot.() -> Unit,
) {
    HomeScreenRobot(composeTestRule).apply(block)
}
