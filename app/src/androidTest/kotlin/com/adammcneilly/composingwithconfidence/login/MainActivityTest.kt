package com.adammcneilly.composingwithconfidence.login

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.adammcneilly.composingwithconfidence.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun successfulLogin() {
        composeTestRule
            .onNodeWithTag("login_button")
            .assertIsNotEnabled()

        composeTestRule
            .onNodeWithTag("username_text_field")
            .performTextInput("adammc331")

        composeTestRule
            .onNodeWithTag("login_button")
            .assertIsNotEnabled()

        composeTestRule
            .onNodeWithTag("password_text_field")
            .performTextInput("Hunter2")

        composeTestRule
            .onNodeWithTag("login_button")
            .assertIsEnabled()

        composeTestRule
            .onNodeWithTag("login_button")
            .performClick()

        composeTestRule
            .onNodeWithTag("home_screen_label")
            .assertIsDisplayed()
    }
}
