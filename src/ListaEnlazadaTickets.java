public class ListaEnlazadaTickets {

    //ATRIBUTOS
    private Nodo primero;

    //CONSTRUCTOR
    public ListaEnlazadaTickets() {
        this.primero = null;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void insertarInicio(Ticket ticket) {
        Nodo nuevoNodo = new Nodo(ticket);
        nuevoNodo.setSiguiente(primero);
        primero = nuevoNodo;
    }

    public void insertarFinal(Ticket ticket) {
        Nodo nuevoNodo = new Nodo(ticket);
        if (estaVacia()) {
            primero = nuevoNodo;
            return;
        }
        Nodo temp = primero;
        while (temp.getSiguiente() != null) {
            temp = temp.getSiguiente();
        }
        temp.setSiguiente(nuevoNodo);
    }

    public Ticket buscarPorId(int id) {
        Nodo temp = primero;
        while (temp != null) {
            if (temp.getTicket().getId() == id) {
                return temp.getTicket();
            }
            temp = temp.getSiguiente();
        }
        return null;
    }
}