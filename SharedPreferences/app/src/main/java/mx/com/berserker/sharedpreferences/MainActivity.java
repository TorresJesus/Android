package mx.com.berserker.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText campoUsuario;
    EditText campoPass;
    EditText campoTipo;
    TextView txtUsuario;
    TextView txtPass;
    TextView txtTipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoUsuario=(EditText)findViewById(R.id.etUser);
        campoPass=(EditText)findViewById(R.id.etPass);
        campoTipo = (EditText) findViewById(R.id.etTipo);
        txtUsuario=(TextView) findViewById(R.id.tvUser);
        txtPass=(TextView) findViewById(R.id.tvPass);
        txtTipo = (TextView) findViewById(R.id.tvtipo);

        cargarPreferencias();
    }

    public void onClick(View view){
        String opc = "";
        opc = campoTipo.getText().toString();
        switch (view.getId()){
            case R.id.btnGuardar:
                guardarPreferencias();
                break;
            case R.id.btnCargar:
                if(opc.toLowerCase().equals("invitado")){
                    Intent intent=new Intent(this, Invitado.class);
                    startActivity(intent);
                    break;
                }else if(opc.toLowerCase().equals("admin")){
                    Intent intent=new Intent(this, ConsultaPreferencias.class);
                    startActivity(intent);
                    break;
                }else{
                    Toast.makeText(this, "Ingrese un tipo de usuario correcto [admin/invitado]", Toast.LENGTH_SHORT).show();
                }

        }
    }

    private void cargarPreferencias() {
        SharedPreferences preferences=getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        String user = preferences.getString("user", "No existe la información");
        String pass = preferences.getString("pass", "No existe la información");
        String tipo = preferences.getString("tipo", "No existe la información");
        txtUsuario.setText(user);
        txtPass.setText(pass);
        txtTipo.setText(tipo);
    }


    private void guardarPreferencias(){
        SharedPreferences preferences=getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        String usuario=campoUsuario.getText().toString();
        String pass=campoPass.getText().toString();
        String tipo = campoTipo.getText().toString();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("user",usuario); editor.putString("pass",pass);editor.putString("tipo",tipo);
        txtUsuario.setText(usuario); txtPass.setText(pass);

        editor.commit();
    }

}
