package com.nls.game.solitaire2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.nls.game.solitaire2.ui.data.strings.StringApp
import com.nls.game.solitaire2.ui.data.strings.StringMenu
import com.nls.game.solitaire2.ui.dsl.core.interfaces.IRString
import com.nls.game.solitaire2.ui.screens.HomeScreen
import com.nls.game.solitaire2.ui.screens.SettingsScreen

/**
 * AppRoute represents all navigable destinations in the app,
 * along with metadata like title, back navigation, and popup state.
 */
enum class AppRoute(
    val route: String,
    val title: IRString,
    val canNavigateBack: Boolean = false,
    val content: @Composable (NavHostController) -> Unit
) {
    HOME(
        route = "home",
        title = StringApp.APP_NAME,
        content = { navController -> HomeScreen(navController) }
    ),
    SETTINGS(
        route = "settings",
        title = StringMenu.SETTINGS,
        canNavigateBack = true,
        content = { navController -> SettingsScreen(navController) }
    );

    companion object {
        fun fromRoute(route: String?): AppRoute? =
            entries.firstOrNull { it.route == route }
    }
}
