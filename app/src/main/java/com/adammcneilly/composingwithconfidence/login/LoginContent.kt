package com.adammcneilly.composingwithconfidence.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.adammcneilly.composingwithconfidence.designsystem.components.CWCTextField
import com.adammcneilly.composingwithconfidence.designsystem.components.PrimaryButton

@Composable
fun LoginContent(
    viewState: LoginViewState,
    modifier: Modifier = Modifier,
    onUsernameChanged: (String) -> Unit = {},
    onPasswordChanged: (String) -> Unit = {},
    onLoginClicked: () -> Unit = {},
) {
    Column(
        modifier = modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        CWCTextField(
            text = viewState.username,
            onTextChanged = onUsernameChanged,
            labelText = "Username",
        )

        CWCTextField(
            text = viewState.password,
            onTextChanged = onPasswordChanged,
            labelText = "Password",
            visualTransformation = PasswordVisualTransformation(),
        )

        PrimaryButton(
            text = "Login",
            onClick = onLoginClicked,
            enabled = viewState.submitButtonEnabled,
        )
    }
}
