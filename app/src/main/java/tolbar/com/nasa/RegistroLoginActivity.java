package tolbar.com.nasa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegistroLoginActivity extends AppCompatActivity {

    @BindView(R.id.txtNombreRegistro)
    EditText txtNombreRegistro;

    @BindView(R.id.txtApellidoRegistro)
    EditText txtApellidoRegistro;

    @BindView(R.id.txtCelularRegistro)
    EditText txtCelularRegistro;

    @BindView(R.id.txtCorreoRegistro)
    EditText txtCorreoRegistro;

    @BindView(R.id.txtClaveRegistro)
    EditText txtClaveRegistro;

    @BindView(R.id.cbAceptoTerminosRegistro)
    CheckBox cbAceptoTerminosRegistro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_login);

        ButterKnife.bind(this);
    }

    public void verAhora(View view) {
        Toast.makeText(this, txtNombreRegistro.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
