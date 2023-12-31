package tz.co.jtech.schoolieparent.presentation.common

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tz.co.jtech.schoolieparent.R
import tz.co.jtech.schoolieparent.ui.theme.Blue
import tz.co.jtech.schoolieparent.ui.theme.SchoolieParentTheme

@Composable
fun AuthCard(
    title: String,
    body: String,
) {

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .clip(RoundedCornerShape(bottomEnd = 70.dp))
            .background(Blue),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            color = colorResource(id = R.color.text_primary),
            fontSize = 30.sp
        )
        Text(
            text = body,
            color = colorResource(id = R.color.text_primary)
        )
    }

}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun CardPreview() {
    SchoolieParentTheme {
        AuthCard(title = "Welcome!", body = "Sign in and get started")
    }
}