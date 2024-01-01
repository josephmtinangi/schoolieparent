package tz.co.jtech.schoolieparent.presentation.navgraph

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Route(
    val route: String,
    val label: String,
    val icon: ImageVector
) {
    object Home : Route("home", "Home", Icons.Outlined.Home)
    object Calendar : Route("calendar", "Calendar", Icons.Outlined.DateRange)
    object Account : Route("account", "Account", Icons.Outlined.AccountBox)
}