package mx.com.berserker.apppanfleto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContenidoActivity extends AppCompatActivity {

    Button btnRegresar;
    TextView tvContenido;
    ImageView ivContenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido);

        tvContenido = (TextView) findViewById(R.id.tvContenido);
        ivContenido = (ImageView) findViewById(R.id.ivContenido);
        btnRegresar = (Button)findViewById(R.id.btnRegresar);

        ArrayList<String> content = new ArrayList<String>();
        content.add(getResources().getString(R.string.tema_content));
        content.add(getResources().getString(R.string.activs_didact));
        content.add(getResources().getString(R.string.eval_usuario));
        content.add(getResources().getString(R.string.progres_usuario));

        Intent intent = getIntent();
        int position = intent.getIntExtra("OPCION",0);
        tvContenido.setText(content.get(position));
        switch (position){
            case 0: ivContenido.setImageResource(R.drawable.introduction);break;
            case 1: ivContenido.setImageResource(R.drawable.logo);break;
            case 2: ivContenido.setImageResource(R.drawable.logo_ext);break;
            case 3: ivContenido.setImageResource(R.drawable.logo_learn);break;


        }
        btnRegresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContenidoActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
