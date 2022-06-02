import Clases.*;

import java.util.ArrayList;
import java.util.Locale;
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
        int numDoors;
        int height;
        int i = 0;

        while(vehicles.size()<10){
            i++;
            System.out.println("Ingresando el " + i + " vehículo");
            System.out.println("Ingrese el tipo del " + i + " vehículo");
            kind = sc.nextLine();
            System.out.println("Ingrese el número de pasajeros del " + i + " vehículo");
            passengers = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el número de ruedas del " + i + " vehículo");
            System.out.println("Si es carro, moto, bicicleta o lancha No Aplica");
            numWheels = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese la fecha de matrícula del " + i + " vehículo");
            registrationDate = sc.nextLine();
            switch (kind.toLowerCase()){
                case "carro":
                    System.out.println("Ingrese el número de puertas del " + i + " vehículo");
                    numDoors = Integer.parseInt(sc.nextLine());
                    vehicles.add(new Car(kind,passengers,registrationDate, numDoors));
                    break;
                case "moto":
                    vehicles.add(new Motorcycle(kind,passengers,registrationDate));
                    break;
                case "bicicleta":
                    vehicles.add(new Bicycle(kind,passengers,registrationDate));
                    break;
                case "camion":
                    System.out.println("Ingrese la altura del " + i + " vehículo");
                    height = Integer.parseInt(sc.nextLine());
                    vehicles.add(new Truck(kind, passengers, numWheels, registrationDate, height));
                    break;
                case "yate":
                    vehicles.add(new Boat(kind,passengers,registrationDate));
                    break;
                default:
                    System.out.println("Valor incorrecto!!");
                    System.exit(0);
                    //main("");
                    break;
            }
            int opc;
            do{
                System.out.println("¿El vehículo tiene pasajeros?");
                System.out.println("\t1.Sí");
                System.out.println("\t2.No");
                opc = Integer.parseInt(sc.nextLine());
                if (opc == 1) vehicles.get(i-1).setCrew(true);
                else if (opc == 2) vehicles.get(i-1).setCrew(false);
                else System.out.println("Opción incorrecta!!!");
            }while (opc != 1 && opc != 2);
            do{
                System.out.println("¿Hay más vehículos?");
                System.out.println("\t1.Sí");
                System.out.println("\t2.No");
                opc = Integer.parseInt(sc.nextLine());
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