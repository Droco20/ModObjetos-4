import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 * clase Ferry me permite instanciar el objeto vehiculo creando una lista hasta
 * llegar a 10 unidades y luego imprime el resultado
 */

public class Ferry {

    public static void main(String[] args) throws Exception {

        ArrayList<Vehicle> VehicleList = new ArrayList();
        int add = 0;
        Scanner sc = new Scanner(System.in);

        try {

            do {

                System.out.println("\n Bienvenid@s. Abordaje Ferry\n");
                System.out.println("""
                        Agrega Los Datos Referentes a cada Opcion:
                        \n""");

                System.out.println(". Numero de Placa del vehículo");
                String idBadge = sc.nextLine();
                System.out.println(".Fecha de Matricula (Dia-Mes-Año): ");
                String fM = sc.nextLine();
                String[] l = fM.split("-");
                Calendar dateRegistration = Calendar.getInstance();
                dateRegistration.set(Integer.parseInt(l[0]), Integer.parseInt(l[1]), Integer.parseInt(l[2]));
                System.out.println(".Cantidad de Pasajeros");
                int numPassengers = Integer.parseInt(sc.nextLine());
                System.out.println("-Digite 1 si hay tripulacion abordo de lo contrario Digite 0");
                int crew = Integer.parseInt(sc.nextLine());
                System.out.println(":Cantidad de ruedas del Vehiculo");
                int tires = Integer.parseInt(sc.nextLine());
                System.out.println("Tipo de Movilidad del Vehiculo");
                String meansTransport = sc.nextLine();
                System.out.println("Digite la Informacion del siguiente vehiculo");

                Vehicle vcle = new Vehicle(idBadge, dateRegistration, numPassengers, (crew != 0), tires,
                        meansTransport) {
                };
                VehicleList.add(vcle);

                add = add + 1;

            } while (add < 10);
            System.out.println(VehicleList);

        } catch (NumberFormatException e) {
            System.out.println("Error: Se ha recibido un caracter no numerico");

        } finally {
            System.out.println(VehicleList);
        }

    }
}
