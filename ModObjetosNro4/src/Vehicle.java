import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * la clase Vehicle contiene los atributos que permiten construir objetos de
 * este tipo
 */

public class Vehicle {

     private String idBadge;
     private Calendar dateRegistration;
     private int numPassengers;
     private boolean crew;
     private int tires;
     private String typeVehicle;

     /** metodo constructor pasa los atributos nescesarios para crar el objeto */

     public Vehicle(String idBadge, Calendar dateRegistration, int numPassengers, boolean crew, int tires,
               String typeVehicle) {
          this.idBadge = idBadge;
          this.dateRegistration = dateRegistration;
          this.numPassengers = numPassengers;
          this.crew = crew;
          this.tires = tires;
          this.typeVehicle = typeVehicle;
     }

     /** getters and setters metodos modificadores */

     public String getIdBadge() {
          return idBadge;
     }

     public void setIdBadge(String idBadge) {
          this.idBadge = idBadge;
     }

     public Calendar getDateRegistration() {
          return dateRegistration;
     }

     public void setDateRegistration(Calendar dateRegistration) {
          this.dateRegistration = dateRegistration;
     }

     public int getNumPassengers() {
          return numPassengers;
     }

     public void setNumPassengers(int numPassengers) {
          this.numPassengers = numPassengers;
     }

     public boolean isCrew() {
          return crew;
     }

     public void setCrew(boolean crew) {
          this.crew = crew;
     }

     public int getTires() {
          return tires;
     }

     public void setTires(int tires) {
          this.tires = tires;
     }

     public String getTypeVehicle() {
          return typeVehicle;
     }

     public void setTypeVehicle(String typeVehicle) {
          this.typeVehicle = typeVehicle;
     }

     /** me permite mostrar los datos por defecto sobreescritos */

     @Override
     public String toString() {
          DateFormat dateFormat = new SimpleDateFormat("dd-mm-year");
          String strDate = dateFormat.format(dateRegistration.getTime());
          return "\nDatos del Vehiculo\n Numero Placa: " + idBadge + "\nFecha de la matricula: "
                    + strDate + "\nCantidad de pasajeros: " + numPassengers + "\nTripulacion abordo: "
                    + (crew == true ? "Si" : "No") + "\nCantidad de ruedas: " + tires
                    + "\nTipo de Vehiculo: " + typeVehicle + "\n";
     }

}
