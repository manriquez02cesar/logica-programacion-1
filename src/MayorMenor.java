import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Se ingresara un primer elemento el cual se va a comparar con otros 2 elementos
        System.out.println("Ingresa tu primer numero");
        double num1 = sc.nextDouble();

        //Se ingresará el segundo elemento
        System.out.println("Ingresa tu segundo numero");
        double num2 = sc.nextDouble();

        //Se ingresará un tercer elemento
        System.out.println("Ingresa tu tercer numero");
        double num3 = sc.nextDouble();


        double[] orden = {num1, num2, num3};
        double cajita = 0;

        if (num3 < num2 | num3 == num2){
            cajita = orden[1];
            orden[1] = orden[2];
            orden[2]= cajita;
        }
        if (num2 < num1 | num2 == num1) {
            cajita = orden[0];
            orden[0] = orden[1];
            orden[1]= cajita;
        }
        if (num3 < num2 | num3 == num2){
            cajita = orden[1];
            orden[1] = orden[2];
            orden[2]= cajita;
        }
        System.out.println(orden[2] + ", " + orden[1] + ", " + orden[0]);
        System.out.println(orden[0] + ", " + orden[1] + ", " + orden[2]);
    }
}
