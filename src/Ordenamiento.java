import java.util.ArrayList;
import java.util.List;

public class Ordenamiento {
    private List<Plato> menu;

    public Ordenamiento() {
        menu = new ArrayList<>();
    }

    public List<Plato> getMenu() {
        return menu;
    }

    public void agregarPlato(Plato plato) {
        menu.add(plato);
    }

    public void quemarDatos() {
        menu.clear();
        // Agregar platos al menú
        menu.add(new Plato("Platorico1", 5, 220, 17));
        menu.add(new Plato("Platorico2", 20, 600, 20));
        menu.add(new Plato("Platorico3", 10, 10, 18));
        menu.add(new Plato("Platorico4", 55, 432, 5));
        menu.add(new Plato("Platorico5", 6, 350, 60));
    }

    public Plato buscarPlatoPorNombre(String nombre) {
        for (Plato plato : menu) {
            if (plato.getNombre().equals(nombre)) {
                return plato;
            }
        }
        return null;
    }

    public boolean modificarPlato(Plato plato, String nuevoNombre, int nuevoPrecio, int nuevasCalorias, int nuevoTiempo) {
        if (!plato.getNombre().equals(nuevoNombre) && buscarPlatoPorNombre(nuevoNombre) != null) {
            // Nuevo nombre ya existe en el menú
            return false;
        }

        plato.setNombre(nuevoNombre);
        plato.setPrecio(nuevoPrecio);
        plato.setCalorias(nuevasCalorias);
        plato.setTiempoPreparacion(nuevoTiempo);

        return true;
    }

    public boolean eliminarPlato(String nombre) {
        for (Plato plato : menu) {
            if (plato.getNombre().equals(nombre)) {
                menu.remove(plato);
                return true;
            }
        }
        return false;
    }
}

