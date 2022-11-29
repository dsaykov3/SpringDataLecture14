package net.codejava.spring.dao;

import net.codejava.spring.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ContactDAOJPARepository extends JpaRepository<Contact, Long> {


}
