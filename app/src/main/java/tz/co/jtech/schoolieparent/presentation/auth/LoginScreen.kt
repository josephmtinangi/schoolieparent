package tz.co.jtech.schoolieparent.presentation.auth

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tz.co.jtech.schoolieparent.R
import tz.co.jtech.schoolieparent.presentation.common.AuthCard
import tz.co.jtech.schoolieparent.ui.theme.Blue
import tz.co.jtech.schoolieparent.ui.theme.SchoolieParentTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column {
            AuthCard(title = "Welcome!", body = "Sign in and get started")

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp)
            ) {


                val username = remember { mutableStateOf(TextFieldValue()) }
                val password = remember { mutableStateOf(TextFieldValue()) }
                var showPassword by remember { mutableStateOf(false) }

                Text(text = "Phone Number")
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = username.value,
                    onValueChange = {},
                    trailingIcon = {
                        Icon(imageVector = Icons.Default.Phone, contentDescription = null)
                    },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Default)
                )
                Text(text = "Password")
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = password.value,
                    onValueChange = {},
                    visualTransformation = if (showPassword) {
                        VisualTransformation.None
                    } else {
                        PasswordVisualTransformation()
                    },
                    trailingIcon = {
                        if (showPassword) {
                            IconButton(onClick = { showPassword = false }) {
                                Icon(imageVector = Icons.Default.Lock, contentDescription = null)
                            }
                        } else {
                            IconButton(onClick = { showPassword = true }) {
                                Icon(
                                    imageVector = Icons.Filled.Lock,
                                    contentDescription = null
                                )
                            }
                        }
                    },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Default)
                )

                Row(
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(onClick = { }) {
                        Text(
                            text = "Forgot Password?",
                            color = colorResource(id = R.color.text_secondary)
                        )
                    }
                }

                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(Blue)
                ) {
                    Text(text = "Sign in")
                }
            }
        }

        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(text = "Don't have an account?")
                TextButton(onClick = { }) {
                    Text(text = "Sign Up", color = colorResource(id = R.color.text_secondary))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun LoginScreenPreview() {
    SchoolieParentTheme {
        LoginScreen()
    }
}