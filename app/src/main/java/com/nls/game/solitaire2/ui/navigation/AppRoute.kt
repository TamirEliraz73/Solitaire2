package com.nls.game.solitaire2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.nls.game.solitaire2.ui.data.strings.StringApp
import com.nls.game.solitaire2.ui.data.strings.StringMenu
import com.nls.game.solitaire2.ui.dialogs.QuitDialog
import com.nls.game.solitaire2.ui.dsl.core.interfaces.IRString
import com.nls.game.solitaire2.ui.screens.HomeScreen
import com.nls.game.solitaire2.ui.screens.SettingsScreen

/**
 * AppRoute represents all navigable destinations in the app,
 * along with metadata like title, back navigation, and popup state.
 */
enum class AppRoute(
    private val _route: String? = null,
    val title: IRString,
    val canNavigateBack: Boolean = false,
    val action: AppAction? = null,
    val content: @Composable ((NavHostController) -> Unit)? = null,
) {
    NEW_GAME(
        title = StringMenu.NEW_GAME,
    ),
    HOME(
        title = StringApp.APP_NAME,
        action = NavigateAction("home"),
        content = { navController -> HomeScreen(navController) }
    ),
    SETTINGS(
        title = StringMenu.SETTINGS,
        canNavigateBack = true,
        action = NavigateAction("settings"),
        content = { navController -> SettingsScreen(navController) }
    ),
    QUIT(
        title = StringMenu.QUIT,
        action = ShowDialogAction { navController, onDismiss ->
            QuitDialog(navController = navController, onDismiss = onDismiss)
        }
    );

    val route: String = _route ?: name.lowercase()

    companion object {
        fun fromRoute(route: String?): AppRoute? =
            entries.firstOrNull {
                (it.action as? NavigateAction)?.route == route
            }
    }
}
