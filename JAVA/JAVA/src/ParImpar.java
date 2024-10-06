import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Escribe un numero:");
     int i = scanner.nextInt();
     if (i % 2 == 0) {
      System.out.println("TU NUMERO ES PAR");   
     } else{
         System.out.println( "TU NUMERO ES IMPAR");     
      }    
     }
    }      
    

