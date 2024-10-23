package com.wahcah.wahcahlearning

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@ExperimentalMaterial3Api
//@Preview(showBackground = true, device = "id:Nexus One")
@Composable
fun wahcah_state(nav:NavController) {
    var text by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Jetpack Mobile")
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
                modifier = Modifier.height(30.dp)
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "@wahcah dev",
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {  }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) {
        paddingParent ->
        Column(
            modifier = Modifier
                .padding(paddingParent)
                .padding(top = 50.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.FillHeight,
                painter = painterResource(
                    id = R.drawable.avatar
                ), contentDescription = "ikon apps"
            )

            wahcahTextField("Username", text) {
                text = it
            }

            Spacer(modifier = Modifier.padding(2.dp))
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("password") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
            Spacer(modifier = Modifier.padding(2.dp))
            Button(onClick = {
                if (text == "wahcah" && password == "wahcah") {
                    nav.navigate("halaman_utama/wahyu")
                }
            }) {
                Text("Login")
            }
        }
    }


}

@ExperimentalMaterial3Api
@Composable
fun wahcahTextField(
    label: String,
    stateText: String,
    onChange: (String) -> Unit
) {
    OutlinedTextField(
        value = stateText,
        onValueChange = onChange,
        label = { Text(text = label) }
    )
}