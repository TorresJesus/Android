package mx.com.berserker.apppanfleto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Asociar con el menu xml
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        ListView list;
        ArrayAdapter<String> adapter;
        list = (ListView) findViewById(R.id.list_main);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        adapter.add(getResources().getString(R.string.temas));
        adapter.add(getResources().getString(R.string.activs));
        adapter.add(getResources().getString(R.string.eval));
        adapter.add(getResources().getString(R.string.progress));

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int opc = position;
                Intent intent = new Intent(getApplicationContext(), ContenidoActivity.class);
                Toast.makeText(getApplicationContext(), "Opci\u00f3n..."+opc, Toast.LENGTH_SHORT).show();
                switch(opc){
                    case 0:
                        intent.putExtra("OPCION",0);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("OPCION",1);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("OPCION",2);
                        startActivity(intent);
                        break;

                    case 3:
                        intent.putExtra("OPCION",3);
                        startActivity(intent);
                        break;

                }
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), ContenidoActivity.class);
        switch(item.getItemId()){
            case R.id.itmTemas:
                Toast.makeText(this, "Temas del lenguaje",Toast.LENGTH_SHORT).show();

                intent.putExtra("OPCION",0);
                startActivity(intent);
                break;
            case R.id.itmActivs:
                Toast.makeText(this, "Actividades de Aprendizaje", Toast.LENGTH_SHORT).show();
                intent.putExtra("OPCION",1);
                startActivity(intent);
                break;
            case R.id.itmEval:
                Toast.makeText(this, "Evaluaciones", Toast.LENGTH_SHORT).show();
                intent.putExtra("OPCION",2);
                startActivity(intent);
                break;
            case R.id.itmProgress:
                Toast.makeText(this, "Progreso del Usuario", Toast.LENGTH_SHORT).show();
                intent.putExtra("OPCION",3);
                startActivity(intent);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        finish();
        return true;
    }
}
