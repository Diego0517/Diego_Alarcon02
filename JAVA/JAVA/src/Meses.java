import java.util.Scanner;
public class Meses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte numero;
        do {
           System.out.println("Escribe un numero entre 1 y 12:");
           numero = scanner.nextByte();
        } while (numero < 1 || numero > 12);

      switch (numero) {
           case 1:
        System.out.println("Enero");
            break;
            case 2:
        System.out.println("Febrero");
            break;
            case 3:
        System.out.println("Marzo");
            break;
            case 4:
        System.out.println("Abril");
            break;
            case 5:
        System.out.println("Mayo");
            break;
            case 6:
        System.out.println("Junio");
            break;
            case 7:
        System.out.println("Julio");
            break;
            case 8:
        System.out.println("Agosto");
            break;
            case 9:
        System.out.println("Septiembre");
            break;
            case 10:
        System.out.println("Octubre");
            break;
            case 11:
        System.out.println("Noviembre");
            break;
            case 12:
        System.out.println("Diciembre");
            break;
      
        default:
        System.out.println("Ese mes no existe");
            break;
      }

        System.out.println("FIN!!!");
        scanner.close();

    }
}

