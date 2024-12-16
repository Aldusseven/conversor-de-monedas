import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    public Divisas buscarDivisas(String divisaEntrada, String divisaSalida) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/41234c261fab8ffe2582d5ed/pair/" + divisaEntrada + "/" + divisaSalida);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisas.class);
        } catch (Exception e) {
            throw new RuntimeException("Conversión no disponible");
        }
    }
}