import java.util.Scanner;
public class clase {

    public static int sumar(int numero1, int numero2){
        return numero1+numero2;
    }
        public static int sumar(int numero1, int numero2, int numero3){
            return numero1+numero2+numero3;
        }
            public static int sumar(int numero1, int numero2, int numero3, int numero4){
                return numero1+numero2+numero3+numero4;
            }


}
public static void main(String[] args) {
 System.out.println(sumar(5, 6));   
 System.out.println(sumar(5, 6,7));   
 System.out.println(sumar(5, 6,7,8));   


 }    
}
