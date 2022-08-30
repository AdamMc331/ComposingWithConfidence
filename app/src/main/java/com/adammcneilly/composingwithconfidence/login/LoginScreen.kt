package com.adammcneilly.composingwithconfidence.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onLoginClicked: () -> Unit,
) {
    var viewState by remember {
        mutableStateOf(LoginViewState())
    }

    LoginContent(
        viewState = viewState,
        modifier = modifier,
        onUsernameChanged = { username ->
            viewState = viewState.copy(username = username)
        },
        onPasswordChanged = { password ->
            viewState = viewState.copy(
                password = password,
            )
        },
        onLoginClicked = onLoginClicked,
    )
}
