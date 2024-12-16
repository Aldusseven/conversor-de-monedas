import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaConversion consulta = new ConsultaConversion();

        int opcion = 0;

        while (opcion != 8) {
            System.out.println("Bienvenido al conversor de divisas\n" +
                    "Elige la opción de tu interés e\n" +
                    "ingresa el monto que deseas convertir:\n" +
                    "1. Dólar a Peso Argentino\n" +
                    "2. Peso Argentino a Dólar\n" +
                    "3. Dólar a Real Brasileño\n" +
                    "4. Real Brasileño a Dólar\n" +
                    "5. Dólar a Peso Colombiano\n" +
                    "6. Peso Colombiano a Dólar\n" +
                    "7. Convertir otras divisas\n" +
                    "8. Salir");

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConversionDivisa.convertir( "USD",  "ARS", consulta, lectura);
                    break;
                case 2:
                    ConversionDivisa.convertir( "ARS",  "USD", consulta, lectura);
                    break;
                case 3:
                    ConversionDivisa.convertir( "USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConversionDivisa.convertir( "BRL",  "USD", consulta, lectura);
                    break;
                case 5:
                    ConversionDivisa.convertir( "USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConversionDivisa.convertir( "COP",  "USD", consulta, lectura);
                    break;
                case 7:
                    ConversionDivisa.convertirOtraDivisa(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

    }
}
