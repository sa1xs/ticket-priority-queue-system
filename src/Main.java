import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaTickets sistema = new SistemaTickets();

        int opcionPrincipal;

        do {
            System.out.println("\n===== SISTEMA DE TICKETS =====");
            System.out.println("1. Menu de usuario");
            System.out.println("2. Menu de administrador");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcionPrincipal = leerEntero(scanner);

            switch (opcionPrincipal) {
                case 1:
                    mostrarMenuUsuario(scanner, sistema);
                    break;

                case 2:
                    mostrarMenuAdministrador(scanner, sistema);
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
                    break;
            }
        } while (opcionPrincipal != 3);
        scanner.close();
    }

    private static void mostrarMenuUsuario(Scanner scanner, SistemaTickets sistema) {
        int opcionUsuario;

        do {
            System.out.println("\n===== MENU USUARIO =====");
            System.out.println("1. Crear ticket");
            System.out.println("2. Buscar ticket resuelto");
            System.out.println("3. Volver");
            System.out.print("Seleccione una opcion: ");

            opcionUsuario = leerEntero(scanner);

            switch (opcionUsuario) {
                case 1:
                    crearTicket(scanner, sistema);
                    break;

                case 2:
                    buscarTicketResuelto(scanner, sistema);
                    break;

                case 3:
                    System.out.println("Volviendo al menu principal...");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
                    break;
            }

        } while (opcionUsuario != 3);
    }

    private static void mostrarMenuAdministrador(Scanner scanner, SistemaTickets sistema) {
        int opcionAdministrador;

        do {
            System.out.println("\n===== MENU ADMINISTRADOR =====");
            System.out.println("1. Ver siguiente ticket pendiente");
            System.out.println("2. Resolver siguiente ticket");
            System.out.println("3. Volver");
            System.out.print("Seleccione una opcion: ");

            opcionAdministrador = leerEntero(scanner);

            switch (opcionAdministrador) {
                case 1:
                    verSiguienteTicket(sistema);
                    break;

                case 2:
                    resolverSiguienteTicket(sistema);
                    break;

                case 3:
                    System.out.println("Volviendo al menu principal...");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
                    break;
            }

        } while (opcionAdministrador != 3);
    }

    private static void crearTicket(Scanner scanner, SistemaTickets sistema) {
        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.print("Ingrese la descripcion del problema: ");
        String descripcion = scanner.nextLine();

        Ticket ticket = sistema.crearTicket(nombreCompleto, descripcion);

        System.out.println("\nTicket creado correctamente.");
        System.out.println("Su numero de ticket es: " + ticket.getId());
    }

    private static void buscarTicketResuelto(Scanner scanner, SistemaTickets sistema) {
        System.out.print("Ingrese el ID del ticket: ");
        int id = leerEntero(scanner);

        Ticket ticket = sistema.buscarTicketResuelto(id);

        if (ticket == null) {
            System.out.println("El ticket esta pendiente.");
            return;
        }

        System.out.println("\nTicket encontrado:");
        System.out.println(ticket);
    }

    private static void verSiguienteTicket(SistemaTickets sistema) {
        Ticket ticket = sistema.verSiguienteTicket();

        if (ticket == null) {
            return;
        }

        System.out.println("\nSiguiente ticket pendiente:");
        System.out.println(ticket);
    }

    private static void resolverSiguienteTicket(SistemaTickets sistema) {
        Ticket ticket = sistema.resolverSiguienteTicket();

        if (ticket == null) {
            return;
        }

        System.out.println("\nTicket resuelto correctamente:");
        System.out.println(ticket);
    }

    private static int leerEntero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Debe ingresar un numero valido: ");
            scanner.nextLine();
        }

        int numero = scanner.nextInt();

        scanner.nextLine();

        return numero;
    }
}