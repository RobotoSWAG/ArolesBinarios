import abb.ArbolBinarioBusqueda;

public class Main {
    public static void main(String[] args)
    {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();

        abb.insertar(1);
        abb.insertar(3);
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(3);
        abb.insertar(5);
        abb.insertar(7);
        abb.insertar(6);

        abb.mostrarInOrden();

        abb.insertar(21);
        abb.insertar(9);

        abb.mostrarInOrden();
    }
}
