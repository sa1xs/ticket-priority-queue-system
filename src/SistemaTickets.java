public class SistemaTickets {

    //ATRIBUTOS
    private ColaPrioridadTickets colaPendientes;
    private ListaEnlazadaTickets listaResueltos;

    // CONSTRUCTOR
    public SistemaTickets() {
        this.colaPendientes = new ColaPrioridadTickets();
        this.listaResueltos = new ListaEnlazadaTickets();
    }

    public Ticket crearTicket(String nombreCompleto, String descripcion) {
        Ticket nuevoTicket = new Ticket(nombreCompleto, descripcion);
        colaPendientes.encolar(nuevoTicket);
        return nuevoTicket;
    }

    public Ticket buscarTicketResuelto(int id) {
        return listaResueltos.buscarPorId(id);
    }

    public Ticket verSiguienteTicket() {
        return colaPendientes.verFrente();
    }

    public Ticket resolverSiguienteTicket() {
        Ticket ticket = colaPendientes.desencolar();
        if (ticket == null) {
            return null;
        }
        ticket.resolver();
        listaResueltos.insertarFinal(ticket);
        return ticket;
    }
}