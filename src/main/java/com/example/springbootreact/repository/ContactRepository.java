package com.example.springbootreact.repository;

import com.example.springbootreact.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface ContactRepository extends JpaRepository<Contact,Long> {
}
