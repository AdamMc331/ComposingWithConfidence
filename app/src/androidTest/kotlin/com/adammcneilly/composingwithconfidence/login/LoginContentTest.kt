package com.adammcneilly.composingwithconfidence.login

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginContentTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun triggerLoginClickedCallback() {
        var loginHasBeenClicked = false

        composeTestRule.setContent {
            LoginContent(
                viewState = LoginViewState(
                    username = "AdamMc331",
                    password = "Hunter2",
                ),
                onLoginClicked = {
                    loginHasBeenClicked = true
                },
            )
        }

        loginScreenRobot(composeTestRule) {
            clickLoginButton()
        }

        assertTrue(loginHasBeenClicked)
    }

    @Test
    fun triggerUsernameChangedCallback() {
        var username = ""

        composeTestRule.setContent {
            LoginContent(
                viewState = LoginViewState(),
                onUsernameChanged = {
                    username = it
                },
            )
        }

        loginScreenRobot(composeTestRule) {
            enterUsername("AdamMc331")
        }

        assertEquals("AdamMc331", username)
    }

    @Test
    fun triggerPasswordChangedCallback() {
        var password = ""

        composeTestRule.setContent {
            LoginContent(
                viewState = LoginViewState(),
                onPasswordChanged = {
                    password = it
                },
            )
        }

        loginScreenRobot(composeTestRule) {
            enterPassword("Hunter2")
        }

        assertEquals("Hunter2", password)
    }
}
