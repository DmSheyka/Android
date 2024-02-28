package edu.daletB.tarjetasaludo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.daletB.tarjetasaludo.ui.theme.TarjetaSaludoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaSaludoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Saludo("Dalet Belzu")
                }
            }
        }
    }
}

@Composable
fun Saludo(name: String, modifier: Modifier = Modifier) {
    Surface(color = colorResource(id = R.color.purple_200)) {
        Text(
            text = "Hola, mi nombre es $name!",
            // modifier = modifier.padding(start = 16.dp,top = 16.dp)
            modifier = modifier.padding(all = 16.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TarjetaSaludoTheme {
        Saludo("Dalet Belzu")
    }
}