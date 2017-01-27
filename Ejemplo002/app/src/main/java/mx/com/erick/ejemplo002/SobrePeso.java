package mx.com.erick.ejemplo002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class SobrePeso extends AppCompatActivity {
    TextView Recomendacion;
    ImageButton Imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_peso);

        //relacionando
        Recomendacion=(TextView)findViewById(R.id.txtsobre);
        Imagen=(ImageButton)findViewById(R.id.Imgsobre);
    }
}
