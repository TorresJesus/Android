package mx.edu.utng.recyclecardejemplo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Erick on 07/02/2017.
 */

public class MainActivity extends AppCompatActivity {

    private RecyclerView reciclador;
    private RecyclerView.LayoutManager lmanager;
    private RecyclerView.Adapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ClsProducto> datos = new ArrayList<ClsProducto>();
        datos.add(new ClsProducto(R.drawable.audi_a4, "Audi A4", "39,400 $us"));
        datos.add(new ClsProducto(R.drawable.bugatti_veyron, "Bugattu Veyron", "108.000 €"));
        datos.add(new ClsProducto(R.drawable.camaro, "Camaro 2017", "62,135 $us"));
        datos.add(new ClsProducto(R.drawable.challenger, "Challenger 2017", "40,985 $us"));
        datos.add(new ClsProducto(R.drawable.chevrolet_lycan, "W Motors Lykan HiperSport", "3.4 Millones $us"));
        datos.add(new ClsProducto(R.drawable.lamborghini_embolado, "Lamborghini Ebolado", "1.000.000 €"));


        reciclador = (RecyclerView) findViewById(R.id.reciclador);
        lmanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        reciclador.setLayoutManager(lmanager);

        adaptador = new ProductoAdaptador(datos);
        reciclador.setAdapter(adaptador);
    }
}
