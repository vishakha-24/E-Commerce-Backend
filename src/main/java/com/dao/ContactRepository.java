package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
