package com.nls.game.solitaire2.ui.model

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun navController(): NavHostController = rememberNavController()

@Composable
fun currentRoute(navController: NavHostController): String? =
    navController.currentBackStackEntryAsState().value?.destination?.route

@Composable
fun isRtl(): Boolean = LocalLayoutDirection.current == LayoutDirection.Rtl

@Composable
fun isLtr(): Boolean = !isRtl()