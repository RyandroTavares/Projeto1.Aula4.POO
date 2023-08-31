package com.capturando.dadosJsom;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class DadosJsomApplication {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException{
		SpringApplication.run(DadosJsomApplication.class, args);

		ObjectMapper mapper = new ObjectMapper();

		StringWriter writer = new StringWriter();
        mapper.writeValue(writer, getPessoas());
        System.out.println(writer); 	

        String jsonInput = "[{\"id\":1,\"firstNome\":\"Lucas\",\"lastNome\":\"Lavandeira\",\"age\":15,\"cpf\":\"123.456.789-09\",\"nationality\":\"Brasil\"},{\"id\":2,\"firstNome\":\"Maria\",\"lastNome\":\"Rosário\",\"age\":20,\"cpf\":\"321.654.987-09\",\"nationality\":\"Alemanha\"},{\"id\":1,\"firstNome\":\"Jose\",\"lastNome\":\"Felipe\",\"age\":35,\"cpf\":\"789.644.455-09\",\"nationality\":\"Italia\"}]";
        ArrayList<Pessoa> json = mapper.readValue(jsonInput, new TypeReference<List<Pessoa>>() {});
        System.out.println("Pessoa: " + json);
        FileWriter file = new FileWriter("arquivoJson.json");
        file.write(writer.toString());
        file.close();
	}

	private static List<Pessoa> getPessoas() {

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        Pessoa p1 = new Pessoa();
        p1.setId(1);
        p1.setFirstNome("Lucas");
        p1.setLastNome("Lavandeira");
        p1.setAge(15);
        p1.setCpf("123.456.789-09");
        p1.setNationality("Brasil");

        Pessoa p2 = new Pessoa();
        p2.setId(2);
        p2.setFirstNome("Maria");
        p2.setLastNome("Rosário");
        p2.setAge(20);
        p2.setCpf("321.654.987-09");
        p2.setNationality("Alemanha");

        Pessoa p3 = new Pessoa();
        p3.setId(3);
        p3.setFirstNome("Jose");
        p3.setLastNome("Felipe");
        p3.setAge(35);
        p3.setCpf("789.644.455-09");
        p3.setNationality("Italia");

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        return pessoas;

    }

}
