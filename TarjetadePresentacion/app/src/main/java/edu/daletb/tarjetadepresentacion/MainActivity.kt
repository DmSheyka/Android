package edu.daletb.tarjetadepresentacion

import android.graphics.drawable.Icon
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.daletb.tarjetadepresentacion.ui.theme.TarjetaDePresentaciónTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentaciónTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppTarjetaPresentacion()
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.M)
@Composable
fun AppTarjetaPresentacion() {
    TarjetaPresentacion(
        img = painterResource(R.drawable.android_logo) ,
        nombre = stringResource(R.string.texto_nombre) ,
        ocupacion = stringResource(R.string.texto_ocupacion),
        modifier = Modifier.fillMaxWidth()
            .background(colorResource(id = R.color.yellow_200))
    )
}

@RequiresApi(Build.VERSION_CODES.M)
@Composable
fun TarjetaPresentacion(
    img : Painter,
    nombre: String,
    ocupacion: String,
    iconos : Painter,
    modifier: Modifier
    ){
    Column {
        Image(
            painter = img,
            contentDescription = null,
            modifier = Modifier
                .background(color = colorResource(id = R.color.blue_gray_50))

            )
        Text(
            text = nombre,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = ocupacion,
            modifier = Modifier.padding(16.dp)
        )

    }

}

@RequiresApi(Build.VERSION_CODES.M)
@Preview(showBackground = true)
@Composable
fun VistaPreviaTarjeta() {
    TarjetaDePresentaciónTheme {
        AppTarjetaPresentacion()
    }
}