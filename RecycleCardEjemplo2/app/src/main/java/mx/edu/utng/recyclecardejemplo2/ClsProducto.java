package mx.edu.utng.recyclecardejemplo2;

/**
 * Created by Erick on 07/02/2017.
 */

public class ClsProducto {
    private int imagen_p;
    private String nombre_p;
    private String precio_p;

    public ClsProducto(int imagen_p, String nombre_p, String precio_p){
        this.imagen_p=imagen_p;
        this.nombre_p=nombre_p;
        this.precio_p=precio_p;

    }

    public int getImagen_p() {
        return imagen_p;
    }

    public void setImagen_p(int imagen_p) {
        this.imagen_p = imagen_p;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public String getPrecio_p() {
        return precio_p;
    }

    public void setPrecio_p(String precio_p) {
        this.precio_p = precio_p;
    }
}
