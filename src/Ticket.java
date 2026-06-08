import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {

    // ATRIBUTOS
    private int id;
    private String descripcion;
    private String nombreCompleto;
    private LocalDateTime fechaCreacion;
    private static int cantidad;
    private LocalDateTime fechaResolucion;

    //CONSTRUCTOR
    public Ticket(String nombreCompleto, String descripcion) {
        this.nombreCompleto = nombreCompleto;
        this.descripcion = descripcion;
        cantidad++;
        this.id = cantidad;
        this.fechaCreacion = LocalDateTime.now();
        this.fechaResolucion = null;
    }

    //GETTERS
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getFechaResolucion() {
        return fechaResolucion;
    }

    //OPERACIONES
    public void resolver() {
        this.fechaResolucion = LocalDateTime.now();
    }

    private String formatearFecha(LocalDateTime fecha) {
        if (fecha == null) {
            return "Pendiente";
        }
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return fecha.format(formato);
    }

    //TO STRING
    public String toString() {
        return "Ticket #" + id +
                "\nUsuario: " + nombreCompleto +
                "\nDescripcion: " + descripcion +
                "\nFecha de creacion: " + formatearFecha(fechaCreacion) +
                "\nFecha de resolucion: " + formatearFecha(fechaResolucion);
    }
}