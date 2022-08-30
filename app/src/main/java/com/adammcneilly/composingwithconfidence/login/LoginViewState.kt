package com.adammcneilly.composingwithconfidence.login

data class LoginViewState(
    val username: String = "",
    val password: String = "",
) {

    val submitButtonEnabled: Boolean
        get() = username.isNotBlank() && password.isNotBlank()
}
