package com.etapa1.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(MainApplication.class, args);
		
		HttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("https://api.github.com/users/EmanuelBacalhau");

		HttpResponse response = httpClient.execute(httpGet);
		String responseBody = EntityUtils.toString(response.getEntity());

		Document document = Jsoup.parse(responseBody);
		FileWriter file = new FileWriter("github.json");
		file.write(document.text());
		file.close();
	}

}
