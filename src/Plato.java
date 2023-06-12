//Imagina que estás trabajando en un sistema de administración para un restaurante.
// El restaurante tiene un menú que consiste en varios platos, y cada plato tiene
// un nombre, un precio, un valor calórico y un tiempo de preparación.
//Para este examen, asumiremos que todos los nombres de los platos son únicos (considéralos
// un Id y por lo tanto se debe controlar que no se repitan).
public class Plato {
    private String nombre;
    private int precio, calorias, tiempoPreparacion;

    public Plato(String nombre, int precio, int calorias, int tiempoPreparacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public Plato() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCalorias() {
        return calorias;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", calorias=" + calorias +
                ", tiempoPreparacion=" + tiempoPreparacion +
                '}';
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Plato plato = (Plato) obj;
        return nombre.equals(plato.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}

