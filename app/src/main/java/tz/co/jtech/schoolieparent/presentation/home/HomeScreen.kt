package tz.co.jtech.schoolieparent.presentation.home

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tz.co.jtech.schoolieparent.R
import tz.co.jtech.schoolieparent.presentation.home.components.AcademicsCard
import tz.co.jtech.schoolieparent.presentation.home.components.HomeCard
import tz.co.jtech.schoolieparent.ui.theme.Blue
import tz.co.jtech.schoolieparent.ui.theme.SchoolieParentTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = stringResource(id = R.string.app_name),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = Blue,
                titleContentColor = Color.White
            ),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = null)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = null)
                }
            },
            scrollBehavior = scrollBehavior
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)
        ) {

            HomeCard()

            Spacer(modifier = Modifier.height(24.dp))

            AcademicsCard()

            Spacer(modifier = Modifier.height(24.dp))

            Text(text = "Updates")

            Spacer(modifier = Modifier.height(24.dp))

            Text(text = "Events")
        }
    }

}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun HomeScreenPreview() {
    SchoolieParentTheme {
        HomeScreen()
    }
}