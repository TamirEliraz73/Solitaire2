package com.nls.game.solitaire2.ui.dsl.styled.special

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import com.nls.game.solitaire2.ui.dsl.styled.StyledButton
import com.nls.game.solitaire2.ui.dsl.styled.StyledText
import com.nls.game.solitaire2.ui.navigation.AppRoute
import com.nls.game.solitaire2.ui.navigation.ShowDialogAction

@Composable
fun StyledButtonMenu(navController: NavHostController, appRoute: AppRoute) {
    val action = appRoute.action
    val isEnabled = action != null
    var showDialog by remember { mutableStateOf(false) }

    StyledButton {
        content = { StyledText(text = appRoute.title) { fillMaxWidth = false } }
        onClick = {
            when (action) {
                is ShowDialogAction -> showDialog = true
                else -> action?.run(navController)
            }
        }
        enabled = isEnabled
    }

    if (showDialog && action is ShowDialogAction) {
        action.RunDialog(navController) { showDialog = false }
    }
//    val isEnabled = appRoute.content != null || appRoute.onClick != null
//    StyledButton {
//        content = { StyledText(text = appRoute.title) { fillMaxWidth = false } }
//        onClick = {
//            appRoute.onClick?.invoke(navController)
//                ?: navController.navigate(appRoute.route)
//        }
//        enabled = isEnabled
//    }
}