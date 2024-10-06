import java.util.Scanner;
public class CifrasNumeros {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Dame un numero entero");
        int numero =scanner.nextInt();

        String numeroString = Integer.toString(numero);
        int numeroCifras = numeroString.length();
        if (numeroCifras==1){
            System.out.println("Tu numero tiene 1 cifra");
        }else{
            System.out.println("Tu numero tiene " + numeroCifras + " cifras");
        }

    }
}
