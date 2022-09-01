package com.adammcneilly.composingwithconfidence.login

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput

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

fun loginScreenRobot(
    composeTestRule: ComposeTestRule,
    block: LoginScreenRobot.() -> Unit,
) {
    LoginScreenRobot(composeTestRule).apply(block)
}
