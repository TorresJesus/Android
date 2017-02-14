package mx.edu.utng.recyclecardejemplo2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Erick on 07/02/2017.
 */

public class ProductoAdaptador extends RecyclerView.Adapter<ProductoAdaptador.ProductViewHolder> {
    private ArrayList<ClsProducto> item;

    public ProductoAdaptador(ArrayList<ClsProducto> item) {

        this.item = item;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_productos,parent,false);
            ProductViewHolder producto=new ProductViewHolder(v);
            return producto;

    }


    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
     holder.nombre.setText(item.get(position).getNombre_p());
        holder.precio.setText(item.get(position).getPrecio_p());
        holder.imagen.setImageResource(item.get(position).getImagen_p());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView nombre, precio;
        ImageView imagen;

        public ProductViewHolder(View itemView){
            super(itemView);
            nombre=(TextView)itemView.findViewById(R.id.lblNombre);
            precio=(TextView)itemView.findViewById(R.id.lblPrecio);
            imagen=(ImageView) itemView.findViewById(R.id.imgProducto);
        }
    }
}
