package mx.com.erick.ejemplo002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class PesoNormal extends AppCompatActivity {

    TextView Recomendacion;
    ImageButton Imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_normal);

        //relacionando
        Recomendacion=(TextView)findViewById(R.id.txtNormal);
        Imagen=(ImageButton)findViewById(R.id.imagNormal);
    }
}
