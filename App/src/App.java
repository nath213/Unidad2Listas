public class App {
    public static void main(String[] args) throws Exception {
        
        SinglyLinkedList lista = new SinglyLinkedList(null);
        //Insertar valores
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        //Mostrar
        lista.mostrar();
        //Buscar un elemento
        lista.buscar(30);
        //Eliminar un elemento
        lista.eliminar(20);
        lista.mostrar();
    }
}
