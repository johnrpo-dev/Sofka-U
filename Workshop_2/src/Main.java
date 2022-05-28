import java.util.ArrayList;
import java.util.Iterator;
import  java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Spacecraft> spacecrafts = new ArrayList<>();

    public static void main(String [] args){
        goMenu();
    }

    public static void goMenu(){
        System.out.println("\n*****************Bienvenido al Simulador de Cohetes***********************\n");
        System.out.println("Mira las siguientes opciones:\n");
        System.out.println("\t1. Ingresar nave");
        System.out.println("\t2. Modificar nave");
        System.out.println("\t3. Manejar nave");
        System.out.println("\t4. Listar naves");
        System.out.println("\t5. Salir");
        System.out.println("Ingresa una opción: ");
        int response = Integer.valueOf(sc.nextLine());

        switch (response){
            case 1:{
                createSpacecraft();
                break;
            }
            case 2:{
                modifySpacecraft();
                break;
            }
            case 3:{
                manSpacecraft();
                break;
            }
            case 4:{
                list();
                break;
            }
            case 5:{
                System.out.println("¡¡¡¡Saliste!!!!!");
                break;
            }
            default:{
                System.out.println("¡¡¡¡Opción incorrecta!!!!");
                goMenu();
            }
        }
    }

    public static void createSpacecraft(){
        int opc;
        do{
            System.out.println("Ingrese el tipo de la nave:");
            System.out.println("\t1. Lanzadera");
            System.out.println("\t2. Tripulado");
            System.out.println("\t3. No tripulado");
            opc = Integer.valueOf(sc.nextLine());
        }while(opc > 3 && opc < 0);
        System.out.println("Ingrese el nombre de la nave:");
        String name = sc.nextLine();
        System.out.println("Ingrese la nacionalidad de la nave:");
        String nationality = sc.nextLine();
        System.out.println("Ingrese la velocidad máxima de la nave:");
        int max_speed = Integer.valueOf(sc.nextLine());
        int capacity;
        switch(opc){
            case 1:
                spacecrafts.add(new LaunchVehicle(name, nationality, max_speed));
                break;
            case 2:
                System.out.println("Ingrese la capacidad de pasajeros de la nave:");
                capacity = Integer.valueOf(sc.nextLine());
                spacecrafts.add(new MannedSpaceship(name,nationality,max_speed, capacity));
                break;
            case 3:
                spacecrafts.add(new UnmannedSpaceship(name, nationality, max_speed));
                break;
        }
        goMenu();
    }

    public static void modifySpacecraft() {
        System.out.println("Ingrese el nombre de la nave");
        int i = chooseShip();
        int opc;
        //System.out.println(spacecrafts.get(i).getName());
        System.out.println(((Object)spacecrafts.get(i)).getClass().getSimpleName());
        System.out.println("¿Qué desea hacer?");
        System.out.println("\t1. Cambiar nombre");
        System.out.println("\t2. Cambiar nacionalidad");
        System.out.println("\t3. Cambiar velocidad máxima");
        System.out.println("\t4. Cambiar o asignar combustible");
        System.out.println("\t5. Cambiar o asignar peso");
        System.out.println("\t6. Cambiar o asignar empuje");
        System.out.println("\t7. Cambiar o asignar altura");
        System.out.println("\t8. Cambiar o asignar propósito (No aplica Vehículos Lanzadera)");
        System.out.println("\t0. Ir al menú");
        /*boolean launchVehicle = ((Object)spacecrafts.get(i)).getClass().getSimpleName().equalsIgnoreCase("LaunchVehicle");
        boolean mannedSpaceship = ((Object)spacecrafts.get(i)).getClass().getSimpleName().equalsIgnoreCase("MannedSpaceship");
        boolean unmannedSpaceship = ((Object)spacecrafts.get(i)).getClass().getSimpleName().equalsIgnoreCase("UnmannedSpaceship");
        if(launchVehicle)
            System.out.println("\t8. Cambiar o asignar velocidad inicial");
        else if(mannedSpaceship) {
            System.out.println("\t8. Cambiar la capacidad");
            System.out.println("\t9. Cambiar o asignar el propósito");
        }
        else{
            System.out.println("\t8. Cambiar o asignar el propósito");
        }*/
        opc = Integer.valueOf(sc.nextLine());

        switch (opc){
            case 1: {
                System.out.println("Asigne un nombre:");
                String name = sc.nextLine();
                spacecrafts.get(i).setName(name);
                break;
            }
            case 2: {
                System.out.println("Asigne la nacionalidad:");
                String nationality = sc.nextLine();
                spacecrafts.get(i).setNationality(nationality);
                break;
            }
            case 3: {
                System.out.println("Asigne la velocidad máxima:");
                int max_speed= Integer.valueOf(sc.nextLine());
                spacecrafts.get(i).setMax_speed(max_speed);
                break;
            }
            case 4: {
                System.out.println("¿Cuántos combustibles maneja?");
                int quantify = sc.nextInt();
                String f;
                ArrayList<String> fuel = new ArrayList<>();
                for(int j = 1; j <= quantify; j++){
                    System.out.println("Ponga el "+ j + " combustible:");
                    f = sc.nextLine();
                    fuel.add(f);
                }
                spacecrafts.get(i).setFuel(fuel);
                break;
            }
            case 5: {
                System.out.println("Asigne el peso:");
                float weight= Float.valueOf(sc.nextLine());
                spacecrafts.get(i).setWeight(weight);
                break;
            }
            case 6: {
                System.out.println("Asigne el empuje:");
                float p_force= Float.valueOf(sc.nextLine());
                spacecrafts.get(i).setPushingForce(p_force);
                break;
            }
            case 7: {
                System.out.println("Asigne la altura:");
                float height= Float.valueOf(sc.nextLine());
                spacecrafts.get(i).setHeight(height);
                break;
            }
            case 8: {
                System.out.println("Asigne un propósito:");
                String purpose = sc.nextLine();
                spacecrafts.get(i).setPurpose(purpose);
            }
            case 0:
                goMenu();
                break;
            default:
                modifySpacecraft();
                break;
        }
    }

    public static void manSpacecraft(){
        System.out.println("¿Qué vehículo quiere manejar?");
        int i = chooseShip();
        System.out.println("Solo se puede salir si el vehículo está en reposo ¿De acuerdo?¨[S/N]");
        String condition = sc.nextLine().toLowerCase();
        boolean out = true;
        String action;
        switch (condition){
            case "s": {
                do {
                    System.out.println(spacecrafts.get(i).getName());
                    spacecrafts.get(i).getRunning();
                    System.out.println(spacecrafts.get(i).getSpeed());
                    System.out.println("Presione 'A' para acelerar");
                    System.out.println("Presione 'F' para frenar");
                    System.out.println("Presione 'P' para salir si está en reposo");
                    action = sc.nextLine();
                    switch (action) {
                        case "A": {
                            spacecrafts.get(i).accelerate();
                            spacecrafts.get(i).setRunning();
                            break;
                        }
                        case "F": {
                            spacecrafts.get(i).brake();
                            spacecrafts.get(i).setRunning();
                            break;
                        }
                        case "P": {
                            if (spacecrafts.get(i).getSpeed2() == 0) {
                                out = false;
                            }
                        }
                    }
                }while(out);
                goMenu();
                break;
            }
            case "n":
                goMenu();
                break;
            default:
                manSpacecraft();
                break;
        }
    }

    public static void list(){
        Iterator<Spacecraft> it= spacecrafts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Presiona una tecla para ir dentro de menú:");
        String name = sc.nextLine();
        goMenu();
    }

    public static int chooseShip(){
        int i = -1;
        String name = sc.nextLine();
        for (Spacecraft ship : spacecrafts){
            if(ship.getName().equalsIgnoreCase(name)){
                System.out.println(ship.getName());
                i++;
                break;
            }
        }
        return i;
    }

}
