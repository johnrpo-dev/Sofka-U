import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
          String kind;
          int passengers;
          boolean crew;
          int numWheels;
          String registrationDate;
          String medium;
          int i = 0;

        while(vehicles.size()<10){
            i++;
            System.out.println("Ingresando el " + i + " vehículo");
            System.out.println("Ingrese el tipo del " + i + " vehículo");
            kind = sc.next();
            System.out.println("Ingrese el número de pasajeros del " + i + " vehículo");
            passengers = sc.nextInt();
            System.out.println("Ingrese el número de ruedas " + i + " vehículo");
            numWheels = sc.nextInt();
            System.out.println("Ingrese la fecha de matrícula del " + i + " vehículo");
            registrationDate = sc.next();
            System.out.println("Ingrese el medio de locomoción " + i + " vehículo");
            medium = sc.nextLine();
            vehicles.add(new Vehicle(kind,passengers,numWheels,registrationDate,medium));
            int opc;
            do{
                System.out.println("¿El vehículo tiene pasajeros?");
                System.out.println("\t1.Sí");
                System.out.println("\t2.No");
                opc = sc.nextInt();
                if (opc == 1) vehicles.get(i-1).setCrew(true);
                else if (opc == 2) vehicles.get(i-1).setCrew(false);
                else System.out.println("Opción incorrecta!!!");
            }while (opc != 1 && opc != 2);
            do{
                System.out.println("¿Hay más vehículos?");
                System.out.println("\t1.Sí");
                System.out.println("\t2.No");
                opc = sc.nextInt();
                if (opc == 1) break;
                else if (opc == 2) printing(vehicles);
                else System.out.println("Opción incorrecta!!!");
            }while (opc != 1 || opc != 2);
        }

    }

    private static void printing(ArrayList<Vehicle> vehicles){
        System.out.println(vehicles);
        System.exit(0);
    }
}
