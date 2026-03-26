package parcial;

class Nodo {
    int id;
    String nombre;
    Nodo izquierda, derecha;

    public Nodo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        izquierda = derecha = null;
    }
}