
package parcial;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.raiz = arbol.insertar(arbol.raiz, 50, "Laptop");
        arbol.insertar(arbol.raiz, 30, "Mouse");
        arbol.insertar(arbol.raiz, 70, "Teclado");
        arbol.insertar(arbol.raiz, 20, "Monitor");
        arbol.insertar(arbol.raiz, 40, "USB");

        System.out.println("Recorrido InOrden:");
        arbol.inOrden(arbol.raiz);

        System.out.println("\nBusqueda:");
        Nodo resultado = arbol.buscar(arbol.raiz, 40);

        if (resultado != null) {
            System.out.println("Producto encontrado: " + resultado.nombre);
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}
