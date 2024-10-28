public class SinglyLinkedList {
    Nodo cabeza;

    public SinglyLinkedList(Nodo cabeza) {//lo inicializamos en nulo
        this.cabeza = null;
    }

    public void insertar(Integer dato){
        //Crear un nodo
        Nodo nuevoNodo=new Nodo(dato);
        //Verficar si la lista esta vacia
        if (cabeza==null) {
            //coloca el nodo nuevo como cabeza
            cabeza=nuevoNodo;
        }else{
            Nodo temp = cabeza;//iniciamos desde la cabeza(el primero)
            //recorremos todos los nodos hasta encontrar un null en las posiciones
            while (temp.siguiente != null) {
                temp=temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public void mostrar(){//recorremos todo //temp.dato para comparar
        Nodo temp = cabeza;
        //mientras temp no sea nulo 
        while (temp!=null) {
            System.out.print(temp.dato+"->");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }

    public boolean buscar(Integer valor){
        if (cabeza==null) {
            System.out.println("La lista esta vacia");
            return false;
        }else{
            Nodo temp = cabeza;
            //mientras temp no sea nulo 
            while (temp!=null) {//empezamos a comparar del de la primera posicion
                if (valor == temp.dato) {
                    System.out.println("Se encontro");
                    return true;
                }
                temp = temp.siguiente;//terminando con la primera posicion se convierte el siguiente y vuelve a entrar
            }
            System.out.println("No esta en la lista");
        }
        return false;
    }

    public void eliminar(Integer valor){
        if (cabeza==null) {
            System.out.println("La lista esta vacia");
        }
        if (cabeza.dato==valor) {
            cabeza=cabeza.siguiente;
            System.out.println("Se elimino correctamente: "+valor);
            return;
        }
        Nodo temp = cabeza;
        Nodo anterior = null;
        while (temp!=null && temp.dato!=valor) {//recorrer hasta encontrar el nodo con el valor a eliminar
            anterior = temp;
            temp = temp.siguiente;
        }
        if (temp==null) {
            System.out.println("No se encuentra el valor");
            return;
        }
        anterior.siguiente=temp.siguiente;
        System.out.println("Se elimino correctamente: "+valor);
    }
}
