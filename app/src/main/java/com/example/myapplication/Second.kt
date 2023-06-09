package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun SecondScreen(count: NavHostController) {
    Column(modifier = Modifier.fillMaxSize().background(Color(0xff386953)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Welcome!", fontSize = 30.sp, color = (Color(0xFFEEEEEE)))
        Button(onClick = {
            count.navigate(Home.route)
        },  modifier = Modifier.padding(all = Dp(15F)),
            border = BorderStroke(width = 1.dp, brush = SolidColor(Color(0xFF999999))),
            shape = MaterialTheme.shapes.small,
            colors = ButtonDefaults.buttonColors(Color(0xFF679f8c))) {
            Text(text = "GO Back", fontSize = 20.sp, color = (Color(0xFFDDDDDD)))
        }
    }
}