package com.example.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
