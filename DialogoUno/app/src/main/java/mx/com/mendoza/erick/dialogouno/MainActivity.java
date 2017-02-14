package mx.com.mendoza.erick.dialogouno;

import android.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.Toast;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    Button btnToast, btnDialogo, btnFecha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast=(Button)findViewById(R.id.btnToast);
        btnDialogo=(Button)findViewById(R.id.btnDialogo);
        btnFecha=(Button)findViewById(R.id.btnFecha);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast1 = Toast.makeText(getApplicationContext(),
                        "Mensaje por medio del Toast", Toast.LENGTH_SHORT);
                toast1.show();
            }
        });

        btnDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                DialogoAlerta dialogo = new DialogoAlerta();
                dialogo.show(fragmentManager, "tagAlerta");
            }
        });



        btnFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new DatePickerFragment();

                newFragment.show(getFragmentManager(), "datePicker");
            }
        });

    }
}

