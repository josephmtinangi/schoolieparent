package tz.co.jtech.schoolieparent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import tz.co.jtech.schoolieparent.presentation.auth.LoginScreen
import tz.co.jtech.schoolieparent.presentation.common.AuthCard
import tz.co.jtech.schoolieparent.presentation.home.HomeScreen
import tz.co.jtech.schoolieparent.presentation.onboarding.SplashScreen
import tz.co.jtech.schoolieparent.ui.theme.SchoolieParentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SchoolieParentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SchoolieParentTheme {
        Greeting("Android")
    }
}