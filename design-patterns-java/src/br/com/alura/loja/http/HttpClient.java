package br.com.alura.loja.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class HttpClient implements HttpAdapter {

  String url = "http://api.externa/orcamento";

  @Override
  public void post(Map<String, Object> dados) {
    try {
      URL urlApi = new URL(url);
      URLConnection connection = urlApi.openConnection();
      connection.connect();
    } catch (Exception e) {
      throw new RuntimeException("Erro ao enviar requisição HTTP", e);
    }

  }

}