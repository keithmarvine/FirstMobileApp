package com.keith.buybloo.ui.screens.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.keith.buybloo.data.AuthViewModel
import com.keith.buybloo.navigation.ROUT_REGISTER
import com.keith.buybloo.ui.theme.blueto

@Composable
fun LoginScreen(navController: NavHostController) {
        //Variables
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Spacer(modifier = Modifier.height(20.dp))
        
        Text(
            text = "Welcome Back!",
            fontSize = 30.sp,
            color = blueto,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(20.dp))

        //Email
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            modifier = Modifier.width(350.dp),
            label = {Text(text = "Email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = blueto,
                unfocusedLeadingIconColor = blueto,
                focusedBorderColor = Color.Black,
                focusedLabelColor = Color.Black
            )
        )
        //End of Email
        Spacer(modifier = Modifier.height(20.dp))
        //Password
        OutlinedTextField(
            value = password,
            onValueChange = {password= it},
            modifier = Modifier.width(350.dp),
            label = {Text(text = "Password")},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = blueto,
                unfocusedLeadingIconColor = blueto,
                focusedBorderColor = Color.Black,
                focusedLabelColor = Color.Black
            ),
            visualTransformation = PasswordVisualTransformation()
        )
        //End of Password

        Spacer(modifier = Modifier.height(20.dp))


        //Button

        // Login Button
        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        androidx.compose.material3.Button(
            onClick = {
                authViewModel.login(email, password)
            },
            modifier = Modifier.height(50.dp).fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(blueto)


        ) {
            Text(text = "Login")
        }
        //End of button

        Spacer(modifier = Modifier.height(10.dp))

        //Clickable Text
        TextButton(onClick = {
            navController.navigate(ROUT_REGISTER)
        }) {
            Text(text = "Don't have an account? Register", color = blueto)

        }
    }

}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){

    LoginScreen(rememberNavController())

}