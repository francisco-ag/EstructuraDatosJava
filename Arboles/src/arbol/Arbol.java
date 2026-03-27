package arbol;

public class Arbol {

    private Nodo raiz ;

    public Arbol(){
        raiz = null;
    }

    public void insertar(int valor){
        raiz = insertarRecursivo(raiz, valor);
    }

    public Nodo insertarRecursivo(Nodo actual, int valor){
        if(actual == null){
            return new Nodo(valor);
        }

        if( valor < actual.valor ){
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        }else if(valor > actual.valor){
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }
        return actual;
    }

    public boolean buscar(int valor){
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo actual, int valor){
        if( actual == null ) return false;
        if( valor == actual.valor ) return true;

        return valor < actual.valor //condicion logica
                ? buscarRecursivo(actual.izquierdo,valor)
                : buscarRecursivo(actual.derecho, valor);
    }

    //  Recorridos

    public String inOrden(){
        StringBuilder sb = new StringBuilder();
        inOrdenRecursivo(raiz, sb);
        return sb.toString();
    }

    private void inOrdenRecursivo(Nodo actual, StringBuilder sb){
        if(actual != null) {
            inOrdenRecursivo(actual.izquierdo, sb);
            sb.append(actual.valor).append(" ");
            inOrdenRecursivo(actual.derecho, sb);
        }
    }



}
