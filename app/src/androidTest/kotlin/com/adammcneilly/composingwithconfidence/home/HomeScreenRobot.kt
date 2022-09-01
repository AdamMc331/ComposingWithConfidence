package com.adammcneilly.composingwithconfidence.home

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onNodeWithTag

/**
 * This is a test robot that defines all of the components on the home screen that we may want
 * to interact with, and exposes public functions allowing us to do so.
 *
 * This helps with re-usability, so any tests that touch the login screen can reference this code, and if our
 * login screen changes this is all we have to update.
 */
class HomeScreenRobot(
    composeTestRule: ComposeTestRule,
) {
    private val homeScreenLabel = composeTestRule.onNodeWithTag("home_screen_label")

    fun verifyLabelDisplayed() {
        homeScreenLabel.assertIsDisplayed()
    }
}

/**
 * This works some Kotlin magic so we can call a function to create a [HomeScreenRobot] and
 * pass in a function of all the actions to be triggered on this screen.
 */
fun homeScreenRobot(
    composeTestRule: ComposeTestRule,
    block: HomeScreenRobot.() -> Unit,
) {
    HomeScreenRobot(composeTestRule).apply(block)
}
