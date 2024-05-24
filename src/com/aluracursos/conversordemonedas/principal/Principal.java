package com.aluracursos.conversordemonedas.principal;

import com.aluracursos.conversordemonedas.tareas.ConsultaApi;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String monedaConvertir = "";
        String monedaAConvertir = "";
        int numeroOpcion = 0;
        Scanner scanner = new Scanner(System.in);
        ConsultaApi consultaApi = new ConsultaApi();


        String mensaje = """
               *****************************************
               ** Sea bienvenido al conversor de monedas **
               Por favor digite la opcion de la moneda que desea cambiar
               1 - Argentina = ARG
               2 - Peso Colombiano = COP
               3 - Dolar = USD
               4 - Euro = EUR
               5 - Bolivia = BOB
               6 - Canada = CAD
               7 - Brasil = BRL
               9 - Salir
               """;
        String mensaje2 = "Por favor digite la opcion de la moneda a la que desea cambiar";

        while (numeroOpcion != 9){
            System.out.println(mensaje);
            numeroOpcion = scanner.nextInt();
            if (numeroOpcion == 9){
                System.out.println("Gracias por utilizar este sistema");
                break;
            }
            switch (numeroOpcion){
                case 1:
                    monedaConvertir = "ARG";
                    break;
                case 2:
                    monedaConvertir = "COP";
                    break;
                case 3:
                    monedaConvertir = "USD";
                    break;
                case 4:
                    monedaConvertir = "EUR";
                    break;
                case 5:
                    monedaConvertir = "BOB";
                    break;
                case 6:
                    monedaConvertir = "CAD";
                    break;
                default:
                    System.out.println("Opcion no validad");
                    break;
        }
            System.out.println(mensaje2);
            numeroOpcion = scanner.nextInt();
            switch (numeroOpcion){
                case 1:
                    monedaAConvertir = "ARG";
                    break;
                case 2:
                    monedaAConvertir = "COP";
                    break;
                case 3:
                    monedaAConvertir = "USD";
                    break;
                case 4:
                    monedaAConvertir = "EUR";
                    break;
                case 5:
                    monedaAConvertir = "BOB";
                    break;
                case 6:
                    monedaAConvertir = "CAD";
                    break;
                default:
                    System.out.println("Opcion no validad");
                    break;
            }
            System.out.println("Digite la cantidad que desea convertir");
            var valorAConvertir = scanner.nextDouble();
            System.out.println("El valor " + valorAConvertir +
                    consultaApi.busquedaConversion(monedaConvertir, monedaAConvertir , valorAConvertir));
    }
  }
}
