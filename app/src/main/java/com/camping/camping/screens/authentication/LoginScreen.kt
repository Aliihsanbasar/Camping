package com.camping.camping.screens.authentication

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.camping.camping.Header


@Composable
fun LoginScreen(navController: NavHostController) {
    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Header()
            EmailPassword()
        }
    }
}

@Composable
fun EmailPassword() {
    var emailText by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var passwordText by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, end = 40.dp, top = 64.dp)
    ) {
        Text(
            modifier = Modifier.padding(bottom = 8.dp),
            text = "Email",
            color = Color(0xFF71717A)
        )

        TextField(
            modifier = Modifier
                .border(1.dp, Color(0xFFF4F4F5), RoundedCornerShape(12.dp))
                .fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            value = emailText, onValueChange = {
                emailText = it
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color(0xFFFAFAFA),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Text(
            modifier = Modifier.padding(top = 20.dp, bottom = 8.dp),
            text = "Password",
            color = Color(0xFF71717A)
        )

        TextField(
            modifier = Modifier
                .border(1.dp, Color(0xFFF4F4F5), RoundedCornerShape(12.dp))
                .fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            value = passwordText, onValueChange = {
                passwordText = it
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color(0xFFFAFAFA),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,

                )
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(modifier = Modifier.padding(top = 16.dp, bottom = 24.dp),
                text = "Forgot Password?",
                color = Color(0xFFA1A1AA)
            )

            Button(modifier = Modifier.fillMaxWidth().height(44.dp),
                onClick = {},
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF84CC16)),

                ) {
                Text(text = "Log In", color = Color.White)
            }

            Button(modifier = Modifier.fillMaxWidth().padding(top = 20.dp).height(44.dp).border(0.5.dp, Color(0xFF84CC16), RoundedCornerShape(12.dp)),
                onClick = {},
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFFFFF)),

                ) {
                Text(text = "Register", color = Color(0xFF84CC16))
            }
        }
    }
}