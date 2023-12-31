package tz.co.jtech.schoolieparent.presentation.home.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tz.co.jtech.schoolieparent.R
import tz.co.jtech.schoolieparent.ui.theme.Blue
import tz.co.jtech.schoolieparent.ui.theme.SchoolieParentTheme

@Composable
fun HomeCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(Blue)
            .height(150.dp)
            .padding(15.dp)
    ) {
        Row(
            modifier=Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(

            ) {
                Text(
                    text = "Joseph Mtinangi",
                    color = colorResource(id = R.color.text_primary),
                    style = MaterialTheme.typography.titleLarge
                )
                Row {
                    Text(
                        text = "Darasa la IV",
                        color = colorResource(id = R.color.text_primary),
                        style = MaterialTheme.typography.titleSmall
                    )
                    Text(
                        text = " | ",
                        color = colorResource(id = R.color.text_primary),
                        style = MaterialTheme.typography.titleSmall
                    )
                    Text(
                        text = "JM768768",
                        color = colorResource(id = R.color.text_primary),
                        style = MaterialTheme.typography.titleSmall
                    )
                }
            }
            Avatar()
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun HomeCardPreview() {
    SchoolieParentTheme {
        HomeCard()
    }
}