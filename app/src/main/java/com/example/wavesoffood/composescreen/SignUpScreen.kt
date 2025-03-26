import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.compose.material3.*
import androidx.navigation.NavHostController

@Composable
fun SignUpScreen() {
    val spacerTextFields = 20.dp
    val context = LocalContext.current
    var mobileFocusedTextKey by remember { mutableStateOf("") }

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (textField, button) = createRefs()

        TextField(
            value = mobileFocusedTextKey,
            onValueChange = { mobileFocusedTextKey = it },
            label = { Text("Mobile Number") },
            modifier = Modifier.constrainAs(textField) {
                top.linkTo(parent.top, margin = 16.dp)
                start.linkTo(parent.start, margin = 16.dp)
                end.linkTo(parent.end, margin = 16.dp)
            }
        )

        Button(
            onClick = { /* Handle sign-up click */ },
            modifier = Modifier.constrainAs(button) {
                top.linkTo(textField.bottom, margin = spacerTextFields)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        ) {
            Text("Sign Up")
        }
    }
}
