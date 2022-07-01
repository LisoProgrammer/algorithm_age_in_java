import java.util.*;


public class adivinarNumero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el número que estoy pensando. Es un número que se encuentra entre el 1 y el 100. \nPor favor ingresa un número que se encuentre entre 1 y 100");
        int numero = sc.nextInt();
        double azar_number = Math.random()*100.0;
        azar_number = (int) azar_number;
        //System.out.println(azar_number);
        if(numero > 0 && numero <=100){
            //empezar el bucle
            do{
                if(numero>azar_number){
                    System.out.println("El número que busca es mayor.");
                    numero = sc.nextInt();
                }else if(numero<azar_number){
                    System.out.println("El número que busca es menor.");
                    numero = sc.nextInt();
                }
            }while(numero != azar_number);
            
            System.out.println("Lo adivinaste! El número en que pensé es el "+(int) azar_number+".");
        }else{
            System.out.println("Adivina el número que se encuentra entre 1 y 100. \nPor favor ingresa un número que se encuentre entre 1 y 100");

        }
        sc.close();
    }
}
