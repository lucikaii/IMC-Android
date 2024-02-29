package br.senai.sp.jandira.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc.ui.theme.IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
       Column (
           modifier = Modifier
               .fillMaxWidth()
               .height(200.dp)
               .background(Color(0xff0086ad))
               .padding(top = 16.dp),
           horizontalAlignment = Alignment.CenterHorizontally,
       ){
           Image(
               painter = painterResource(id = R.drawable.imc) ,
               contentDescription = "logo" )
           Text(
               text = "Calculadora IMC",
               color = Color.White,
               fontSize = 24.sp,
               fontWeight = FontWeight.ExtraBold)
       }

        Column (
            modifier = Modifier
                .background(color = Color(0xffF7F3F2), shape = RoundedCornerShape(15.dp),)
                .width(300.dp)
                .padding(top = 50.dp, start = 15.dp, end = 15.dp, bottom = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,


        ){
            Text(text = "Seus dados", color = Color(0xff0086ad), fontSize = 25.sp, fontWeight = FontWeight.ExtraBold)

            Column (
                modifier = Modifier
                    .padding(top = 20.dp)
            ){
                Text(text = "Seu peso", color = Color(0xff0086ad))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = {
                    Text(text = "Insira seu peso em kg")
                },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xff0086ad),
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White,
                        focusedBorderColor = Color(0xff0086ad)

                    ),
                    shape = RoundedCornerShape(10.dp)

                )
            }
            Column (
                modifier = Modifier
                    .padding(top = 20.dp)
            ){
                Text(text = "Sua altura", color = Color(0xff0086ad))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = {
                    Text(text = "Insira sua altura em cm")
                },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xff0086ad),
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White,
                        focusedBorderColor = Color(0xff0086ad)

                    ),
                    shape = RoundedCornerShape(10.dp)
                )

            }

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0086ad)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(text = "CALCULAR", fontWeight = FontWeight.ExtraBold, fontSize = 18.sp)
            }
        }

        Row (
            modifier = Modifier
                .width(280.dp)
                .height(100.dp)
                .background(color = Color(0xff2D9560), shape = RoundedCornerShape(10.dp))
                .border(width = 0.5.dp, color = Color.Red, shape = RoundedCornerShape(10.dp)),
            horizontalArrangement = Arrangement.SpaceEvenly,

        ){

            Column (
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Resultado", color = Color.White)
                Text(text = "Peso Ideal", fontSize = 20.sp, color = Color.White)
            }
            Column (
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ){
                Text(text = "21.3", fontSize = 32.sp, fontWeight = FontWeight.ExtraBold, color = Color.White)
            }
        }
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    IMCTheme {
        Greeting()
    }
}