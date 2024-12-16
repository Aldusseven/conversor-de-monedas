<h1>Conversor de monedas</h1>

<h2>Este proyecto desarrolla una app con Java para convertir divisas por medio de una API</h2>

<h3>*Explicación Detallada del Código*</h3>

<h4>I. Propósito Principal</h4>
El código Java proporcionado tiene como objetivo principal facilitar la obtención de tasas de cambio de divisas en tiempo real utilizando una API externa. Específicamente, la clase ConsultarConversion se encarga de realizar una solicitud a una API de tasas de cambio (en este caso, https://vb.exchangerate-api.com) para obtener la tasa de conversión entre dos monedas dadas.

<h4>II. Funcionamiento General</h4>

<h5>a. Creación de la Solicitud:</h5>

1. Se construye una URL específica para la API, incluyendo los códigos de las divisas de entrada y salida.
2. Se crea un cliente HTTP para realizar la solicitud a la API.
3. Se configura la solicitud HTTP con la URL y otros parámetros necesarios.

<h5>b. Envío de la Solicitud y Procesamiento de la Respuesta:</h5>

1. Se envía la solicitud a la API y se recibe la respuesta en formato JSON.
2. La librería Gson se utiliza para convertir el JSON de la respuesta en un objeto de la clase Divisas.
3. Este objeto Divisas contiene la información relevante sobre el tipo de cambio, como la tasa de conversión entre las dos monedas.

<h5>c. Manejo de Errores:</h5>

Si ocurre algún error durante el proceso de solicitud o conversión, se lanza una excepción personalizada indicando que no se pudo encontrar la moneda.

<h5>d. Estructura del Código</h5>

*Clase ConsultaConversion:
Contiene el método buscarDivisas que realiza la lógica principal de la obtención de la tasa de cambio.

*Clase Divisas:
Esta clase se utiliza para representar la información obtenida de la API, como la divisa de entrada, divisa de salida y el tipo de cambio.

<h5>e. Uso del Código</h5>
Para utilizar este código, se crea un objeto de la clase ConsultaConversion y se llama al método buscarDivisas proporcionando los códigos de las divisas de entrada y salida. El método devolverá un objeto Divisas que contiene la información del tipo de cambio.

*Dependencias
-Gson: Se utiliza para convertir el JSON de la respuesta de la API en objetos Java.
-Java HTTP Client: Se utiliza para realizar las solicitudes HTTP a la API.

*Consideraciones Adicionales
-API Externa: El código depende de una API externa para obtener las tasas de cambio. Es importante verificar los términos de servicio y las limitaciones de uso de la API.

-Manejo de Errores: Se recomienda implementar un manejo de errores más robusto, como capturar diferentes tipos de excepciones y proporcionar mensajes de error más específicos.

-Caching: Para mejorar el rendimiento, se podría implementar un mecanismo de caché para almacenar las tasas de cambio obtenidas y evitar realizar solicitudes repetidas a la API.
