package Lista;

public class ListaLigada {
    private Nodo cabeza;

    public ListaLigada(){
        cabeza = null ;
    }

    public void insertar(String dato){
        Nodo nuevo = new Nodo(dato);

        if(cabeza == null){
            cabeza = nuevo ;
        }else{
            Nodo actual = cabeza ;

            while (actual.siguiente != null ){
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }

    public void eliminar(String dato){

        if(cabeza == null) return;

        if(cabeza.dato.equalsIgnoreCase(dato)){
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo aux = cabeza;
        while (
                aux.siguiente != null &&
                !cabeza.dato.equalsIgnoreCase(dato)
        ){
            aux = aux.siguiente;
        }
        if(aux.siguiente != null){
            aux.siguiente = aux.siguiente.siguiente;
        }
    }

    public String mostrar(){
        StringBuilder sb = new StringBuilder("Lista Ligada \n");

        Nodo aux = cabeza;
        while(aux != null){
            sb.append(aux.dato).append("->");
            aux = aux.siguiente;
        }

        sb.append("null");
        return sb.toString();
    }
}
