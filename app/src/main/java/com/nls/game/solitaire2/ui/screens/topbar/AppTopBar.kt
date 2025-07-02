package com.nls.game.solitaire2.ui.screens.topbar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.nls.game.solitaire2.ui.components.BackIcon
import com.nls.game.solitaire2.ui.data.strings.StringApp
import com.nls.game.solitaire2.ui.dsl.core.interfaces.IRString
import com.nls.game.solitaire2.ui.dsl.styled.StyledText
import com.nls.game.solitaire2.ui.theme.NavyBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    titleResId: IRString = StringApp.APP_NAME,
    fontColor: Color = Color.White,
    canNavigateBack: Boolean = false,
    onBackClick: () -> Unit = {}
) {
    TopAppBar(
        title = { StyledText(titleResId) { color = fontColor } },
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = onBackClick) {
                    BackIcon()
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = NavyBlue
        )
    )
}