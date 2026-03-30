import java.util.Scanner;
//Vamos a trabajar con ArrayList importamos su paquete
import java.util.ArrayList;

public class MayorMenor {
    public static void main(String[] args) {
        //==============================================================================================================
        //              CODIGO MEJORADO A PARTIR DEL CODIGO ANTERIOR QUE EMPIEZA DESDE LA LINEA 68
        //==============================================================================================================

        Scanner sc= new Scanner(System.in);
        int dato;
        double cajita = 0;

        do {
            //Actualizare el codigo para que puedan ingresar datos con un limite dinamico
            System.out.println("Tienes que ingresar un numero no menor ni igual al numero 1!");
            //Preguntamos cuantos numeros desea comparar
            System.out.println("¿Cuantos numeros deseas comparar?");
            dato = sc.nextInt();//En el reto indica que solo ingresemos 3 numeros a comparar
        }while (dato <= 1);


        //Creamos una lista dinamica para ir guardando los numeros ingresados.
        ArrayList<Double> lista = new ArrayList<>();
        //Se crea un for para ingresar los numeros de forma iterativa
        for (int i = 0; i < dato; i++){
            int j = i;
            System.out.println("Ingresa tu " + (int)++j + "° numero");
            lista.add(sc.nextDouble());
        }


        //Usamos un for anidado para comparar un elmento con el que sigue algo similar al metodo burbuja
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                // Comparamos el elemento actual con el siguiente
                if (lista.get(j) > lista.get(j + 1)) {
                    // Intercambio usando la variable "cajita"
                    cajita = lista.get(j);//Aqui estamos guardando el valor para no perderlo al agregarle un valor nuevo
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, cajita);
                }
            }
        }


        System.out.println(lista);//Lista ordenada de manera ascendiente

        //Reutilizamos el mismo codigo anterior solo alterando el orden
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j) < lista.get(j + 1)) {
                    cajita = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, cajita);
                }
            }
        }
        System.out.println(lista);//De manera descendiente

        //
        /*
        ================================================================================================================
                            CODIGO QUE CUMPLE CON LOS CRITERIOS PERO SOLO RECIBE 3 DATOS NUMERICOS
        ================================================================================================================
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
        System.out.println(orden.length);
         */
    }
}
