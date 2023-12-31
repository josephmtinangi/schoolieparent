package tz.co.jtech.schoolieparent.presentation.home.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tz.co.jtech.schoolieparent.R
import tz.co.jtech.schoolieparent.ui.theme.SchoolieParentTheme

@Composable
fun Avatar() {
    Image(
        painter = painterResource(id = R.drawable.avatar),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(70.dp)
            .clip(CircleShape)
            .border(2.dp, Color.White, CircleShape)
    )
}

@Preview()
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun AvatarPreview() {
    SchoolieParentTheme {
        Avatar()
    }
}