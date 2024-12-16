# conversor-de-monedas
Este proyecto desarrolla una app con Java para convertir divisas por medio de una API

Explicación Detallada del Código

I. Propósito Principal
El código Java proporcionado tiene como objetivo principal facilitar la obtención de tasas de cambio de divisas en tiempo real utilizando una API externa. Específicamente, la clase ConsultarConversion se encarga de realizar una solicitud a una API de tasas de cambio (en este caso, https://vb.exchangerate-api.com) para obtener la tasa de conversión entre dos monedas dadas.

II. Funcionamiento General

A. Creación de la Solicitud:

Se construye una URL específica para la API, incluyendo los códigos de las divisas de entrada y salida.
Se crea un cliente HTTP para realizar la solicitud a la API.
Se configura la solicitud HTTP con la URL y otros parámetros necesarios.

B. Envío de la Solicitud y Procesamiento de la Respuesta:

Se envía la solicitud a la API y se recibe la respuesta en formato JSON.
La librería Gson se utiliza para convertir el JSON de la respuesta en un objeto de la clase Divisas.
Este objeto Divisas contiene la información relevante sobre el tipo de cambio, como la tasa de conversión entre las dos monedas.

C. Manejo de Errores:

Si ocurre algún error durante el proceso de solicitud o conversión, se lanza una excepción personalizada indicando que no se pudo encontrar la moneda.

D. Estructura del Código

*Clase ConsultaConversion:
Contiene el método buscarDivisas que realiza la lógica principal de la obtención de la tasa de cambio.
*Clase Divisas:
Esta clase se utiliza para representar la información obtenida de la API, como la divisa de entrada, divisa de salida y el tipo de cambio.
*Uso del Código
Para utilizar este código, se crea un objeto de la clase ConsultaConversion y se llama al método buscarDivisas proporcionando los códigos de las divisas de entrada y salida. El método devolverá un objeto Divisas que contiene la información del tipo de cambio.

Ejemplo de uso:

Java

ConsultaConversion consulta = new ConsultaConversion();
Divisas tasas = consulta.buscarDivisas("USD", "EUR");
double tasaDeCambio = tasas.getTasaDeCambio();
System.out.println("La tasa de cambio de USD a EUR es: " + tasaDeCambio);

*Dependencias
Gson: Se utiliza para convertir el JSON de la respuesta de la API en objetos Java.
Java HTTP Client: Se utiliza para realizar las solicitudes HTTP a la API.

*Consideraciones Adicionales
-API Externa: El código depende de una API externa para obtener las tasas de cambio. Es importante verificar los términos de servicio y las limitaciones de uso de la API.
-Manejo de Errores: Se recomienda implementar un manejo de errores más robusto, como capturar diferentes tipos de excepciones y proporcionar mensajes de error más específicos.
-Caching: Para mejorar el rendimiento, se podría implementar un mecanismo de caché para almacenar las tasas de cambio obtenidas y evitar realizar solicitudes repetidas a la API.
