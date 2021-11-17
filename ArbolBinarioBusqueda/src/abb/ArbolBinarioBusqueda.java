package abb;

public class ArbolBinarioBusqueda {

    private Nodo raiz;

    public ArbolBinarioBusqueda()
    {
        raiz = null;
    }

    public boolean estaVacio()
    {
        return raiz == null;
    }

    private void insertar(Nodo padre, Nodo hijo, int dato)
    {
        if(hijo == null)
        {
            Nodo nuevo = new Nodo(null, dato, null);
            if(dato >= padre.getDato())
            {
                padre.setDerecho(nuevo);
            }
            else
            {
                padre.setIzquierdo(nuevo);
            }
        }
        else
        {
            if(dato >= padre.getDato())
            {
                insertar(hijo, hijo.getDerecho(), dato);
            }
            else
            {
                insertar(hijo, hijo.getDerecho(), dato);
            }
        }
    }


    public void insertar(int dato)
    {
        if(estaVacio())
        {
            Nodo nuevo = new Nodo(null, dato, null);
            raiz = nuevo;
        }
        else
        {
            if(dato >= raiz.getDato())
            {
                insertar(raiz, raiz.getDerecho(), dato);
            }
            else
            {
                insertar(raiz, raiz.getDerecho(), dato);
            }
        }
    }

    private void mostrarInOrden(Nodo nodo)
    {
        if(nodo == null)
        {

        }
        else
        {
            mostrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + " ");
            mostrarInOrden(nodo.getDerecho());
        }
    }


    public void mostrarInOrden()
    {
        Nodo temp = raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }
}
