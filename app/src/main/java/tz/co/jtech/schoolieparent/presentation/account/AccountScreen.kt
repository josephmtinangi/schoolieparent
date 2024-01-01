package tz.co.jtech.schoolieparent.presentation.account

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import tz.co.jtech.schoolieparent.presentation.calendar.CalendarScreen
import tz.co.jtech.schoolieparent.ui.theme.SchoolieParentTheme

@Composable
fun AccountScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Account")
    }
}


@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun AccountScreenPreview() {
    SchoolieParentTheme {
        AccountScreen()
    }
}
