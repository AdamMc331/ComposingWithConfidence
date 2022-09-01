package com.adammcneilly.composingwithconfidence.login

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.adammcneilly.composingwithconfidence.home.HomeScreenRobot

/**
 * This is a test robot that defines all of the components on the login screen that we may want
 * to interact with, and exposes public functions allowing us to do so.
 *
 * This helps with re-usability, so any tests that touch the login screen can reference this code, and if our
 * login screen changes this is all we have to update.
 */
class LoginScreenRobot(
    composeTestRule: ComposeTestRule,
) {
    private val loginScreenContent = composeTestRule.onNodeWithTag("login_content")
    private val usernameInput = composeTestRule.onNodeWithTag("username_text_field")
    private val passwordInput = composeTestRule.onNodeWithTag("password_text_field")
    private val loginButton = composeTestRule.onNodeWithTag("login_button")

    fun enterUsername(username: String) {
        usernameInput.performTextInput(username)
    }

    fun enterPassword(password: String) {
        passwordInput.performTextInput(password)
    }

    fun clickLoginButton() {
        loginButton.performClick()
    }

    fun verifyLoginButtonEnabled() {
        loginButton.assertIsEnabled()
    }

    fun verifyLoginButtonDisabled() {
        loginButton.assertIsNotEnabled()
    }

    fun verifyScreenVisible() {
        loginScreenContent.assertIsDisplayed()
    }
}

/**
 * This works some Kotlin magic so we can call a function to create a [LoginScreenRobot] and
 * pass in a function of all the actions to be triggered on this screen.
 */
fun loginScreenRobot(
    composeTestRule: ComposeTestRule,
    block: LoginScreenRobot.() -> Unit,
) {
    LoginScreenRobot(composeTestRule).apply(block)
}
