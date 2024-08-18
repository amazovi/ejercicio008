package es.cic.curso.ejercicio008.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.cic.curso.ejercicio008.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}