package com.nls.game.solitaire2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.nls.game.solitaire2.ui.data.strings.StringColors
import com.nls.game.solitaire2.ui.dsl.core.base.SpacingStyle
import com.nls.game.solitaire2.ui.dsl.core.base.StyleProps
import com.nls.game.solitaire2.ui.dsl.core.interfaces.IRString
import com.nls.game.solitaire2.ui.dsl.extensions.withToast
import com.nls.game.solitaire2.ui.dsl.styled.StyledButton
import com.nls.game.solitaire2.ui.dsl.styled.StyledText
import com.nls.game.solitaire2.ui.theme.Solitaire2Theme

object APP_NAME : IRString {
    override val stringResId = R.string.app_name
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Solitaire2Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column {

                        StyledText(text = APP_NAME) {
                            textAlign = TextAlign.Center
                            fontSize = 50
                            style = StyleProps(
                                padding = SpacingStyle(
                                    vertical = 20
                                )
                            )
                            fontWeight = FontWeight.Bold
                            color = Color.Green
                        }
                        StyledButton {
                            style = StyleProps(
                                padding = SpacingStyle(
                                    horizontal = 50,
                                    vertical = 20
                                )
                            )
                            content = { StyledText("click here"){
                                fillMaxWidth = false
                            } }
                            withToast(StringColors.RED)
                        }
                    }
                }
            }
        }
    }
}