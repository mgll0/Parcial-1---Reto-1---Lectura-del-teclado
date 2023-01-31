import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String operation;
        int operando_1 = 0, operando_2 = 0;
        Boolean autorizacion = false;

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca su operacion");
        operation = leer.nextLine();

        System.out.println("Operando 1");
        operando_1 = leer.nextInt();
        System.out.println("Operando 2");
        operando_2 = leer.nextInt();


        switch (operation){
            case "SUMA":
                System.out.println(operando_1 + "+" + operando_2 + "=" + (operando_1 + operando_2));
                autorizacion = true;
                break;
            case "RESTA":
                System.out.println(operando_1 + "-" + operando_2 + "=" + (operando_1 - operando_2));
                autorizacion = true;
                break;
            case "MULTIPLICACION":
                System.out.println(operando_1 + "*" + operando_2 + "=" + (operando_1 * operando_2));
                autorizacion = true;
                break;
            case "DIVISION":
                System.out.println(operando_1 + "/" + operando_2 + "=" + (operando_1 / operando_2));
                autorizacion = true;
                break;
        }
        if (autorizacion == false){
            System.out.println("Operacion no soportada");
        }
    }
}