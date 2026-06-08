public class Nodo {

    //ATRIBUTOS
    private Ticket ticket;
    private Nodo siguiente;

    public Nodo(Ticket ticket) {
        this.ticket = ticket;
        this.siguiente = null;
    }

    //GETTERS
    public Ticket getTicket() {
        return ticket;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    //SETTERS
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    //TO STRING
    public String toString() {
        return ticket.toString();
    }
}