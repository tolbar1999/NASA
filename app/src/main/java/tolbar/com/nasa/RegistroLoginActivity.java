package tolbar.com.nasa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegistroLoginActivity extends AppCompatActivity {

    private EditText txtNombreRegistro;
    private EditText txtApellidoRegistro;
    private EditText txtCelularRegistro;
    private EditText txtCorreoRegistro;
    private EditText txtClaveRegistro;
    private CheckBox cbAceptoTerminosRegistro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_login);

        txtNombreRegistro = findViewById(R.id.txtNombreRegistro);
        txtApellidoRegistro = findViewById(R.id.txtApellidoRegistro);
        txtCelularRegistro = findViewById(R.id.txtCelularRegistro);
        txtCorreoRegistro = findViewById(R.id.txtCorreoRegistro);
        txtClaveRegistro = findViewById(R.id.txtClaveRegistro);
        cbAceptoTerminosRegistro = findViewById(R.id.cbAceptoTerminosRegistro);
    }
}
