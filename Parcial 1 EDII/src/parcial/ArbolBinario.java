package parcial;

class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

 
    public Nodo insertar(Nodo raiz, int id, String nombre) {
        if (raiz == null) {
            return new Nodo(id, nombre);
        }

        if (id < raiz.id) {
            raiz.izquierda = insertar(raiz.izquierda, id, nombre);
        } else if (id > raiz.id) {
            raiz.derecha = insertar(raiz.derecha, id, nombre);
        }

        return raiz;
    }

    
    public Nodo buscar(Nodo raiz, int id) {
        if (raiz == null || raiz.id == id) {
            return raiz;
        }

        if (id < raiz.id) {
            return buscar(raiz.izquierda, id);
        } else {
            return buscar(raiz.derecha, id);
        }
    }

  
    public void inOrden(Nodo raiz) {
        if (raiz != null) {
            inOrden(raiz.izquierda);
            System.out.println(raiz.id + " - " + raiz.nombre);
            inOrden(raiz.derecha);
        }
    }
}

