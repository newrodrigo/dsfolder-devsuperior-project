package com.devsuperior.dsfolder.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsfolder.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List <Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria Silva", "123.456.789-00", 2000.00, Instant.parse("1994-07-20T10:30:00Z"), 1));
		list.add(new Client(2L, "Pedro Oliveira", "123.456.789-11", 1900.00, Instant.parse("1990-09-02T19:30:00Z"), 2));
		return ResponseEntity.ok().body(list);
	}
}
