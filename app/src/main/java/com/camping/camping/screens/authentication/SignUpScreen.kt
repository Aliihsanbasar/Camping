package com.camping.camping.screens.authentication

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.camping.camping.Header

@Composable
fun SignUpScreen(navController: NavHostController) {

}

@Composable
@Preview
fun HandleScreen(){
    Surface(modifier = Modifier.fillMaxSize()) {

        Column(modifier = Modifier.padding(start = 40.dp, end = 40.dp, top = 55.dp)) {
            Header()
            SignUpContent()
        }
    }
}

@Composable
fun SignUpContent(){

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
            Text(modifier = Modifier.padding(bottom = 8.dp) , text = "Name", color = Color(0XFF71717A))

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

            Text(modifier = Modifier.padding(bottom = 8.dp, top = 20.dp) , text = "Email", color = Color(0XFF71717A))

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

            Text(modifier = Modifier.padding(bottom = 8.dp, top = 20.dp) , text = "Phone", color = Color(0XFF71717A))

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

            Text(modifier = Modifier.padding(bottom = 8.dp, top = 20.dp) , text = "Password", color = Color(0XFF71717A))

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

