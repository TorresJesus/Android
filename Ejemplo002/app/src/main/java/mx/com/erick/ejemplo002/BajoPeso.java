package mx.com.erick.ejemplo002;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class BajoPeso extends AppCompatActivity {

    TextView Recomendacion;
    ImageButton Imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajo_peso);
        //relacionando
        Recomendacion=(TextView)findViewById(R.id.txtBajo);
        Imagen=(ImageButton)findViewById(R.id.ImgBajo);
    }
}
