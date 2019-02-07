package tolbar.com.nasa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_AppCompat_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void abrirActivityRegistroLogin(View view) {
        Intent intent = new Intent(this, RegistroLoginActivity.class);
        startActivity(intent);
    }

}
