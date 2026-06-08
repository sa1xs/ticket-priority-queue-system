public class ColaPrioridadTickets {

    //ATRIBUTOS
    private Nodo frente;

    // CONSTRUCTOR
    public ColaPrioridadTickets() {
        this.frente = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(Ticket ticket) {
        Nodo nuevoNodo = new Nodo(ticket);
        if (estaVacia()) {
            frente = nuevoNodo;
            return;
        }
        if (ticket.getId() < frente.getTicket().getId()) {
            nuevoNodo.setSiguiente(frente);
            frente = nuevoNodo;
            return;
        }
        Nodo actual = frente;
        while (actual.getSiguiente() != null && actual.getSiguiente().getTicket().getId() <= ticket.getId()) {
            actual = actual.getSiguiente();
        }
        nuevoNodo.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(nuevoNodo);
    }

    public Ticket verFrente() {
        if (estaVacia()) {
            System.out.println("No hay tickets pendientes.");
            return null;
        }
        return frente.getTicket();
    }

    public Ticket desencolar() {
        if (estaVacia()) {
            System.out.println("No hay tickets pendientes.");
            return null;
        }
        Ticket ticket = frente.getTicket();
        frente = frente.getSiguiente();
        return ticket;
    }
}