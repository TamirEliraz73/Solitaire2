package com.nls.game.solitaire2.ui.dialogs

import android.app.Activity
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import com.nls.game.solitaire2.ui.dsl.styled.StyledText

@Composable
fun QuitDialog(
    onDismiss: () -> Unit,
    navController: NavHostController
) {
    val context = LocalContext.current
    val activity = context as? Activity

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { StyledText("Exit App") },
        text = { StyledText("Are you sure you want to quit?") },
        confirmButton = {
            TextButton(
                onClick = {
                    onDismiss()
                    activity?.finish()
                }
            ) {
                StyledText("Yes")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                StyledText("Cancel")
            }
        }
    )
}