import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    Scanner teclado = new Scanner(System.in);

    // ObjEmpleado emple = new ObjEmpleado();
    public void Menu() {
        float calculo;
        ArrayList<ObjEmpleado> emple = new ArrayList<>();
        System.out.println("*****************************");
        System.out.println("BIENVENIDO");
        System.out.println("INGRESE EL NOMBRE DEL EMPLEADO");
        String nombre = teclado.next();
        System.out.println("INGRESE EL SALARIO ACTUAL DEL EMPLEADO");
        float salario = teclado.nextInt();
        if (salario > 2500000 && salario < 3000000) {
            calculo = (float) (salario + (salario * 0.09));
            System.out.printf("SALARIO TOTAL= %.2f", calculo);
        } else {
            if (salario >= 3000000 && salario < 4500000) {
                calculo = (float) (salario + (salario * 0.085));
                System.out.printf("SALARIO TOTAL= %.2f", calculo);
            } else {
                if (salario >= 4500000 && salario < 5000000) {
                    calculo = (float) (salario + (salario * 0.06));
                    System.out.printf("SALARIO TOTAL= %.2f", calculo);
                } else {
                    if (salario > 50000000) {
                        calculo = (float) (salario + (salario * 0.04));
                       System.out.printf("SALARIO TOTAL= %.2f", calculo);
                    }

                }

            }

        }
        System.out.println("¿TRABAJO HORAS EXTRAS DIURNAS?");
        String resp = teclado.next();
        if (resp.equalsIgnoreCase("si")) {
            System.out.println("CUANTOS DIAS FUERON?");
            int dias = teclado.nextInt();
            System.out.println("CUANTAS HORAS");
            int horas = teclado.nextInt();
            System.out.println("¿FUE UN FESTIVO?");
            String respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("si")) {
                calculo = (float) (salario * dias * horas + (salario * 0.0125));
                System.out.printf("SALARIO TOTAL= %.2f", calculo);
            } else {
                calculo = (float) (salario * dias * horas + (salario * 0.25));
                System.out.printf("SALARIO TOTAL= %.2f", calculo);
            }
        } else {
            System.out.println("¿TRABAJO HORAS EXTRAS NOCTURNAS?");
            resp = teclado.next();
            if (resp.equalsIgnoreCase("si")) {
                System.out.println("CUANTOS DIAS FUERON?");
                int dias = teclado.nextInt();
                System.out.println("CUANTAS HORAS");
                int horas = teclado.nextInt();
                System.out.println("¿FUE UN FESTIVO?");
                String respuesta = teclado.next();
                if (respuesta.equalsIgnoreCase("si")) {
                    calculo = (float) (salario * dias * horas + (salario * 0.35));
                    System.out.printf("SALARIO TOTAL= %.2f", calculo);
                } else {
                    calculo = (float) (salario * dias * horas + (salario * 0.0175));
                    System.out.printf("SALARIO TOTAL= %.2f", calculo);
                }

            }
        }

    }

}
