package com.nls.game.solitaire2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.nls.game.solitaire2.ui.data.strings.StringApp
import com.nls.game.solitaire2.ui.model.currentRoute
import com.nls.game.solitaire2.ui.navigation.AppRoute
import com.nls.game.solitaire2.ui.navigation.NavGraph
import com.nls.game.solitaire2.ui.screens.topbar.AppTopBar
import com.nls.game.solitaire2.ui.theme.Solitaire2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Solitaire2Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MainContent()
                }
            }
        }
    }

    @Composable
    fun MainContent() {
        val navController = rememberNavController()
        Scaffold(
            topBar = {
                val route = currentRoute(navController)
                val meta = AppRoute.fromRoute(route)

                AppTopBar(
                    titleResId = meta?.title ?: StringApp.APP_NAME,
                    canNavigateBack = meta?.canNavigateBack ?: false,
                    onBackClick = { navController.popBackStack() }
                )
            }
        ) { innerPadding ->
            Box(Modifier.padding(innerPadding)) {
                NavGraph(navController)
            }
        }
    }
}