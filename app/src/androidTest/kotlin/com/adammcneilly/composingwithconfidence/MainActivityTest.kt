package com.adammcneilly.composingwithconfidence

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.adammcneilly.composingwithconfidence.home.homeScreenRobot
import com.adammcneilly.composingwithconfidence.login.loginScreenRobot
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun successfulLogin() {
        loginScreenRobot(composeTestRule) {
            verifyLoginButtonDisabled()
            enterUsername("adammc331")
            enterPassword("Hunter2")
            verifyLoginButtonEnabled()
            clickLoginButton()
        }

        homeScreenRobot(composeTestRule) {
            verifyLabelDisplayed()
        }
    }
}
