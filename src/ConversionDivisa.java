import java.util.Scanner;

public class ConversionDivisa {
    public static void convertir(String divisaEntrada, String divisaSalida, ConsultaConversion consulta, Scanner lectura) {
        double monto;
        double montoConvertido;

        Divisas divisas = consulta.buscarDivisas(divisaEntrada, divisaSalida);

        System.out.println("El tipo de cambio para hoy: 1 " + divisaEntrada + " = " + divisas.conversion_rate() + " " + divisaSalida);

        System.out.println("Ingresa el monto a consultar " + divisaEntrada + ": ");
        monto = Double.parseDouble(lectura.nextLine());

        montoConvertido = monto * divisas.conversion_rate();

        System.out.println(monto + " " + divisaEntrada + " = " + montoConvertido + " " + divisas.conversion_rate());
    }

    public static void convertirOtraDivisa(ConsultaConversion consulta, Scanner lectura) {
        System.out.println("Ingresa el código de la divisa de entrada: ");
        String divisaEntrada = lectura.nextLine().toUpperCase();

        System.out.println("Ingresa el código de la divisa de salida: ");
        String divisaSalida = lectura.nextLine().toUpperCase();

        convertir(divisaEntrada, divisaSalida, consulta, lectura);
    }
}