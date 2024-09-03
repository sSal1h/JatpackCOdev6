package com.hsalihkucuk.jetpackcodev6.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.core.view.WindowInsetsControllerCompat

private val DarkColorScheme = darkColorScheme(
    primary = MainColor,
    secondary = SecondColor,
    tertiary = GrayColor,
    background = Color.White,
    onPrimary = MainColor,
    onSecondary = SecondColor,
    onTertiary = Color.White,
    onBackground = Color.White,
)

private val LightColorScheme = lightColorScheme(
    primary = MainColor,
    secondary = SecondColor,
    tertiary = GrayColor,
    background = Color.White,
    onPrimary = MainColor,
    onSecondary = SecondColor,
    onTertiary = Color.Gray,
    onBackground = Color.White,
)

@Composable
fun JetpackCOdev6Theme(
    darkTheme: Boolean = false,
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val window = (LocalContext.current as Activity).window
    SideEffect {
        window.statusBarColor = AppBarColor.toArgb()
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}