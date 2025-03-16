package com.example.uicoban.navigation

sealed class Screen(val route: String) {
    object Welcome : Screen("welcome")
    object ComponentsList : Screen("components_list")
    object TextDetail : Screen("text_detail")
} 