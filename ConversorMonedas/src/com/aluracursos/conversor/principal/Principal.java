package com.aluracursos.conversor.principal;
import com.aluracursos.conversor.principal.modelos.AnalisisFiltrado;
import com.aluracursos.conversor.principal.modelos.Conexion;
import com.aluracursos.conversor.principal.modelos.ConversionMonedas;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Scanner cantidades = new Scanner(System.in);

                while(true) {
                    System.out.println("*********************************************");
                    System.out.println("CONVESOR DE MONEDAS\n" +
                            "*********************************************\n"+
                            "Opciones de monedas a convertir:\n" +
                            "1) Dólar a peso argentino\n" +
                            "2) Peso argentino a dólar\n" +
                            "3) Dólar a real brasileño\n" +
                            "4) Real brasileño a dolar\n" +
                            "5) Dólar a peso colombiano\n" +
                            "6) Peso colombiano a dólar\n" +
                            "7) Salir\n" +
                            "Digite la opción deseada: ");
                    var opcion = lectura.nextLine();
                    System.out.println("*********************************************");

                    if (opcion.equals("1")) {
                        System.out.println("Introduce la cantidad: ");
                        double cantidad = cantidades.nextDouble();
                        ConversionMonedas solicitud = new ConversionMonedas();
                        String respuesta = solicitud.DolarAPesoArgentino(cantidad);
                        System.out.println("*********************************************");
                        System.out.println("Resultado: " + respuesta + " pesos argentinos");
                        System.out.println("*********************************************");
                    }

                    else if (opcion.equals("2")) {
                        System.out.println("Introduce la cantidad: ");
                        double cantidad = cantidades.nextDouble();
                        ConversionMonedas solicitud = new ConversionMonedas();
                        String respuesta = solicitud.PesoArgentinoADolar(cantidad);
                        System.out.println("*********************************************");
                        System.out.println("Resultado: " + respuesta + " dólares");
                        System.out.println("*********************************************");
                    }

                    else if (opcion.equals("3")) {
                        System.out.println("Introduce la cantidad: ");
                        double cantidad = cantidades.nextDouble();
                        ConversionMonedas solicitud = new ConversionMonedas();
                        String respuesta = solicitud.DolarARealBrasileno(cantidad);
                        System.out.println("*********************************************");
                        System.out.println("Resultado: " + respuesta + " reales brasileños");
                        System.out.println("*********************************************");
                    }

                    else if (opcion.equals("4")) {
                        System.out.println("Introduce la cantidad: ");
                        double cantidad = cantidades.nextDouble();
                        ConversionMonedas solicitud = new ConversionMonedas();
                        String respuesta = solicitud.RealBrasilenoADolar(cantidad);
                        System.out.println("*********************************************");
                        System.out.println("Resultado: " + respuesta + " dólares");
                        System.out.println("*********************************************");
                    }

                    else if (opcion.equals("5")) {
                        System.out.println("Introduce la cantidad: ");
                        double cantidad = cantidades.nextDouble();
                        ConversionMonedas solicitud = new ConversionMonedas();
                        String respuesta = solicitud.DolarAPesoColombiano(cantidad);
                        System.out.println("*********************************************");
                        System.out.println("Resultado: " + respuesta + " pesos colombianos");
                        System.out.println("*********************************************");
                    }

                    else if (opcion.equals("6")) {
                        System.out.println("Introduce la cantidad: ");
                        double cantidad = cantidades.nextDouble();
                        ConversionMonedas solicitud = new ConversionMonedas();
                        String respuesta = solicitud.PesoColombianoADolar(cantidad);
                        System.out.println("*********************************************");
                        System.out.println("Resultado: " + respuesta + " dólares");
                        System.out.println("*********************************************");
                    }

                    else if (opcion.equalsIgnoreCase("salir")) {
                        break;
                    }

                    else{
                        System.out.println("¡Digite una opción correcta!");
                    }
                }
    }
}
