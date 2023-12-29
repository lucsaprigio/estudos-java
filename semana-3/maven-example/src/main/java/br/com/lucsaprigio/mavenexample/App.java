package br.com.lucsaprigio.mavenexample;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class App {
    public static void main(String[] args) {
        var url = "https://viacep.com.br/ws/29704065/json";

        try {
            CloseableHttpClient client = HttpClientBuilder.create().build();
            CloseableHttpResponse response = client.execute(new HttpGet(url));
            var json = EntityUtils.toString(response.getEntity());

            System.out.println(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}