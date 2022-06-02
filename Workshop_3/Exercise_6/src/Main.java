
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector ranNum = new Vector();
        int num = 0;
        int i = 0;



        while(true){
            System.out.println("Ingrese un número");
            num = Integer.parseInt(sc.nextLine());
            if (ranNum.contains(num) == true){
                break;
            }
            ranNum.addElement(num);
            //i++;
        }

        System.out.println(ranNum);
    }
}
