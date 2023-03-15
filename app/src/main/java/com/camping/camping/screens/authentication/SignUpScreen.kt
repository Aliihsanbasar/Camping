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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.camping.camping.Header
import com.camping.camping.navigation.CampingScreens

@Composable
fun SignUpScreen(navController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier.padding(start = 40.dp, end = 40.dp, top = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Header()
            SignUpContent()
            Button(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .fillMaxWidth()
                    .height(44.dp),
                onClick = {
                          navController.navigate(CampingScreens.LoginScreen.name)
                },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF84CC16)),

                ) {
                Text(text = "Sign Up", color = Color.White)
            }
        }
    }
}

@Composable
fun SignUpContent() {

    var nameText by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var emailText by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var phoneText by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var passwordText by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Surface(modifier = Modifier.padding(top = 40.dp)) {
        Column {
            Text(
                modifier = Modifier.padding(bottom = 8.dp),
                text = "Name",
                color = Color(0XFF71717A)
            )

            TextField(
                modifier = Modifier
                    .border(1.dp, Color(0xFFF4F4F5), RoundedCornerShape(12.dp))
                    .fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                value = nameText, onValueChange = {
                    nameText = it
                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xFFFAFAFA),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,

                    )
            )

            Text(
                modifier = Modifier.padding(bottom = 8.dp, top = 20.dp),
                text = "Email",
                color = Color(0XFF71717A)
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
                    unfocusedIndicatorColor = Color.Transparent,

                    )
            )

            Text(
                modifier = Modifier.padding(bottom = 8.dp, top = 20.dp),
                text = "Phone",
                color = Color(0XFF71717A)
            )

            TextField(
                modifier = Modifier
                    .border(1.dp, Color(0xFFF4F4F5), RoundedCornerShape(12.dp))
                    .fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                value = phoneText, onValueChange = {
                    phoneText = it
                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color(0xFFFAFAFA),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,

                    )
            )

            Text(
                modifier = Modifier.padding(bottom = 8.dp, top = 20.dp),
                text = "Password",
                color = Color(0XFF71717A)
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
        }

    }
}

