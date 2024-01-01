package tz.co.jtech.schoolieparent.presentation.home

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tz.co.jtech.schoolieparent.presentation.home.components.AcademicsCard
import tz.co.jtech.schoolieparent.presentation.home.components.HomeCard
import tz.co.jtech.schoolieparent.ui.theme.SchoolieParentTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)
        ) {

            HomeCard()

            Spacer(modifier = Modifier.height(24.dp))

            AcademicsCard()

            Spacer(modifier = Modifier.height(24.dp))



            Spacer(modifier = Modifier.height(24.dp))


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