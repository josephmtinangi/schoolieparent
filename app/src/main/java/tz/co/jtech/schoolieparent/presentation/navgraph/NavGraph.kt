package tz.co.jtech.schoolieparent.presentation.navgraph

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import tz.co.jtech.schoolieparent.presentation.account.AccountScreen
import tz.co.jtech.schoolieparent.presentation.calendar.CalendarScreen
import tz.co.jtech.schoolieparent.presentation.common.SIMSTopBar
import tz.co.jtech.schoolieparent.presentation.home.HomeScreen

@Composable
fun NavGraph(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Route.Home.route) {
        composable(Route.Home.route) {
            HomeScreen()
        }

        composable(Route.Calendar.route) {
            CalendarScreen()
        }

        composable(Route.Account.route) {
            AccountScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation() {
    val navController = rememberNavController()

    val items = listOf(Route.Home, Route.Calendar, Route.Account)

    Scaffold(
        topBar = {SIMSTopBar()},
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route

                items.forEach { it ->
                    NavigationBarItem(
                        selected = currentRoute == it.route,
                        label = {
                            Text( 
                                text = it.label,
                                color = if (currentRoute == it.route) Color.DarkGray else Color.LightGray
                            )
                        },
                        icon = {
                            Icon(
                                imageVector = it.icon,
                                contentDescription = null,
                                tint = if (currentRoute == it.route) Color.DarkGray else Color.LightGray
                            )
                        },
                        onClick = {
                            if (currentRoute != it.route) {
                                navController.graph.startDestinationRoute?.let {
                                    navController.popBackStack(it, true)
                                }

                                navController.navigate(it.route) {
                                    launchSingleTop = true
                                }
                            }
                        }

                    )
                }
            }
        }) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = innerPadding)
        ) {
            NavGraph(navController = navController)
        }
    }
}