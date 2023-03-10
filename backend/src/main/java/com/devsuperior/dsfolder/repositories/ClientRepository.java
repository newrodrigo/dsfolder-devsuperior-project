package com.devsuperior.dsfolder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsfolder.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
