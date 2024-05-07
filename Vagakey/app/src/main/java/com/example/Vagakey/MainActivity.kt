package com.example.Vagakey

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import com.example.Vagakey.ui.theme.VagakeyTheme
import androidx.compose.runtime.*
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.Vagakey.MainActivity

@Composable
fun SetupNavigation() {
    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginPage(
                onLoginClick = {
                    navController.navigate("registration")
                }
            )
        }
        composable("registration") {
            RegistrationScreen(
                onRegistrationComplete = {
                    navController.navigate("home")
                }
            )
        }
    }
}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VagakeyTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    LoginPage()
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistrationScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF480CA8)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .padding(40.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(7.dp))
                .background(Color.White)
                .padding(40.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(
                text = "Dados Pessoais!",
                textAlign = TextAlign.Center,
                color = Color(0xFFff009d),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Spacer(modifier = Modifier.height(25.dp))
            Text(
                text = "Se voc\u00ea j\u00e1 possui uma conta, fa\u00e7a o ",
                color = Color(0xFF666666),
                fontSize = 14.sp
            )
            Text(
                text = "login",
                color = Color(0xFF555555),
                fontSize = 13.sp,
                modifier = Modifier.clickable(
                    onClick = { /* TODO: Implement navigation to login screen */ }
                )
            )
            Text(
                text = " para acessar o sistema.",
                color = Color(0xFF666666),
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(25.dp))
            Text(
                text = "Digite os seus dados de acesso no campo abaixo.",
                color = Color(0xFF666666),
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
            TextFieldDefaults.outlinedTextFieldColors()
            OutlinedTextField(
                value = TextFieldValue(),
                onValueChange = {},
                label = { Text("Nome Completo") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFFf72585),
                    unfocusedBorderColor = Color(0xFFCCCCCC),
                    cursorColor = Color.Black
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(
                value = TextFieldValue(),
                onValueChange = {},
                label = { Text("CPF") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFFf72585),
                    unfocusedBorderColor = Color(0xFFCCCCCC),
                    cursorColor = Color.Black
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(
                value = TextFieldValue(),
                onValueChange = {},
                label = { Text("Digite seu email") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFFf72585),
                    unfocusedBorderColor = Color(0xFFCCCCCC),
                    cursorColor = Color.Black
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(
                value = TextFieldValue(),
                onValueChange = {},
                label = { Text("Digite seu telefone") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFFf72585),
                    unfocusedBorderColor = Color(0xFFCCCCCC),
                    cursorColor = Color.Black
                )
            )
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(
                value = TextFieldValue(),
                onValueChange = {},
                label = { Text("Digite sua senha") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFFf72585),
                    unfocusedBorderColor = Color(0xFFCCCCCC),
                    cursorColor = Color.Black
                ),
                //visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(
                value = TextFieldValue(),
                onValueChange = {},
                label = { Text("Confirma\u00e7\u00e3o de Senha") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFFf72585),
                    unfocusedBorderColor = Color(0xFFCCCCCC),
                    cursorColor = Color.Black
                ),
                //visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { /* TODO: Implement form submission */ },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFf72585)),
                elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 0.dp)
            ) {
                Text(
                    text = "Prosseguir",
                    color = Color.White,
                    fontWeight = FontWeight.W600
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRegistrationScreen() {
    RegistrationScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage() {
    var email by remember { mutableStateOf(TextFieldValue()) }
    var password by remember { mutableStateOf(TextFieldValue()) }
    var submenuVisible by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxSize().background(Color(0xFF480CA8))) {
        // Menu header
        Box(modifier = Modifier
            .background(Color(0xFFFF009D))
            .fillMaxWidth()
            .height(100.dp)
            .clickable { submenuVisible = !submenuVisible },
            contentAlignment = Alignment.Center
        ) {
            //Image(painter = painterResource(id = R.drawable.placeholder), contentDescription = "Logo-VagaKey")
        }

        // Submenu
        if (submenuVisible) {
            Row(modifier = Modifier
                .background(Color(0xFFFF009D))
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text("P\u00E1gina Inicial", color = Color.White, modifier = Modifier.padding(5.dp))
                Text("Meu Perfil", color = Color.White, modifier = Modifier.padding(5.dp))
                Text("Hist\u00F3rico", color = Color.White, modifier = Modifier.padding(5.dp))
                Text("Carteira", color = Color.White, modifier = Modifier.padding(5.dp))
                Text("Sair", color = Color.White, modifier = Modifier.padding(5.dp))
            }
        }

        // Login form
        Column(modifier = Modifier
            .padding(40.dp)
            .clip(RoundedCornerShape(7.dp))
            .background(Color.White)
            //.shadow(10.dp, RoundedCornerShape(7.dp))
            .padding(40.dp)
            .align(Alignment.CenterHorizontally),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Bem vindo ao VAGAKEY!", fontWeight = FontWeight.Bold, fontSize = 24.sp, color = Color(0xFFFF009D))
            Spacer(Modifier.size(20.dp))
            //Image(painter = painterResource(id = R.drawable.placeholder), contentDescription = "carro-img")
            Text("Digite os seus dados de acesso no campo abaixo.", fontSize = 14.sp, color = Color(0xFF666666))
            Spacer(Modifier.size(20.dp))

            Text("E-mail", fontWeight = FontWeight.Bold, fontSize = 14.sp)
            TextField(
                value = email,
                onValueChange = { newEmail -> email = newEmail },
                singleLine = true,
                modifier = Modifier
                    .background(Color(0xFFCCCCCC), RoundedCornerShape(4.dp))
                    .padding(horizontal = 15.dp, vertical = 10.dp)
                    .fillMaxWidth()
            )
            Spacer(Modifier.size(10.dp))

            Text("Senha", fontWeight = FontWeight.Bold, fontSize = 14.sp)
            TextField(
                value = password,
                onValueChange = { newPassword -> password = newPassword },
                singleLine = true,
                modifier = Modifier
                    .background(Color(0xFFCCCCCC), RoundedCornerShape(4.dp))
                    .padding(horizontal = 15.dp, vertical = 10.dp)
                    .fillMaxWidth()
            )

            Spacer(Modifier.size(10.dp))

            Text("Esqueci minha senha", color = Color(0xFF555555))
            Text("Politica de Privacidade", color = Color(0xFF555555))
            Spacer(Modifier.size(20.dp))

            Button(
                onClick = { /*TODO: handle login*/ },
                //colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF72585))
            ) {
                Text("Acessar", color = Color.White)
            }
        }
    }
}

@Composable
@Preview
fun LoginPagePreview() {
    LoginPage()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyNavigationBar() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color(0xFFFF009D))) {
        Text(
            text = "Home",
            modifier = Modifier
                .clickable {
                    // Handle the click
                }
                .weight(1f)
                .padding(14.dp),
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            color = Color.White
        )
        // Repeat for other navigation items
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF480CA8)), contentAlignment = Alignment.Center) {
        Column(
            modifier = Modifier
                .padding(50.dp)
                .background(Color.White, shape = RoundedCornerShape(5.dp))
                .width(400.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text(
                text = "Acesse o VagaKey",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color(0xFFFF009D)
            )
            Button(
                onClick = { /* TODO: Implement click */ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF72585)),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "Cadastre-se", fontSize = 14.sp, color = Color.White)
            }
            Button(
                onClick = { /* TODO: Implement click */ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF256FF7)),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "Já tem cadastro? Entre aqui", fontSize = 14.sp, color = Color.White)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Logo() {
    Image(
        painter = painterResource(R.drawable.placeholder),
        contentDescription = "Logo VagaKey",
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .size(110.dp, 100.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Column {
            MyNavigationBar()
            HomePage()
            Spacer(modifier = Modifier.height(30.dp))
            Logo()
        }
    }
}
