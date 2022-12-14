package com.adammcneilly.composingwithconfidence.designsystem.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp

/**
 * This is a custom [Button] that has a fixed height and shape to match a design system.
 *
 * @param[text] The text inside the button.
 * @param[onClick] A callback invoked when the user clicks the button.
 * @param[modifier] An optional [Modifier] to configure this component.
 */
@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    TextButton(
        onClick = onClick,
        shape = RoundedCornerShape(50),
        modifier = modifier
            .height(48.dp)
            .fillMaxWidth(),
        enabled = enabled,
    ) {
        Text(
            text = text.toUpperCase(Locale.current),
        )
    }
}
