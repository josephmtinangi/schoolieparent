package tz.co.jtech.schoolieparent.presentation.home.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tz.co.jtech.schoolieparent.ui.theme.SchoolieParentTheme

@Composable
fun AcademicsCard() {

    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        )
    ) {
        Text(
            text = "Academics",
            modifier = Modifier
                .padding(5.dp),
            fontWeight = FontWeight.SemiBold
        )

        Row(
            modifier=Modifier.fillMaxWidth().padding(10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            MenuCard(icon = Icons.Outlined.CheckCircle, title = "Attendance")
            MenuCard(icon = Icons.Outlined.Info, title = "Fees")
            MenuCard(icon = Icons.Outlined.Email, title = "Ask")
            MenuCard(icon = Icons.Outlined.LocationOn, title = "Location")
        }

        Row(
            modifier=Modifier.fillMaxWidth().padding(10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            MenuCard(icon = Icons.Outlined.Edit, title = "Exams")
            MenuCard(icon = Icons.Outlined.List, title = "Results")
            MenuCard(icon = Icons.Outlined.Favorite, title = "Events")
            MenuCard(icon = Icons.Outlined.DateRange, title = "Time Table")
        }

    }


}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun AcademicsCardPreview() {
    SchoolieParentTheme {
        AcademicsCard()
    }
}