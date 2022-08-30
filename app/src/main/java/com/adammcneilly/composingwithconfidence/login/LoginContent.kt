package com.adammcneilly.composingwithconfidence.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.input.KeyboardType
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
            .padding(16.dp)
            .testTag("login_content"),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        CWCTextField(
            text = viewState.username,
            onTextChanged = onUsernameChanged,
            labelText = "Username",
            modifier = Modifier
                .testTag("username_text_field"),
        )

        CWCTextField(
            text = viewState.password,
            onTextChanged = onPasswordChanged,
            labelText = "Password",
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Password,
            ),
            modifier = Modifier
                .testTag("password_text_field"),
        )

        PrimaryButton(
            text = "Login",
            onClick = onLoginClicked,
            enabled = viewState.submitButtonEnabled,
            modifier = Modifier
                .testTag("login_button"),
        )
    }
}
